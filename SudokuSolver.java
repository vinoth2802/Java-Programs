public class SudokuSolver {
    private static final int N = 9;

    public static void main(String[] args) {
        int[][] sudokuBoard = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveSudoku(sudokuBoard)) {
            printSudoku(sudokuBoard);
        } else {
            System.out.println("No solution exists for the given Sudoku puzzle.");
        }
    }

    private static boolean solveSudoku(int[][] board) {
        int row = -1;
        int col = -1;
        boolean isFilled = true;

        // Find the first empty cell in the Sudoku board
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isFilled = false;
                    break;
                }
            }
            if (!isFilled) {
                break;
            }
        }

        // If the board is already filled, return true
        if (isFilled) {
            return true;
        }

        // Try placing digits from 1 to 9 in the empty cell
        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;

                // Recursively try solving the rest of the Sudoku puzzle
                if (solveSudoku(board)) {
                    return true;
                }

                // If the current placement doesn't lead to a solution, backtrack
                board[row][col] = 0;
            }
        }

        // No solution found for the current configuration
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check if the current number is not present in the current row and column
        for (int i = 0; i < N; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        // Check if the current number is not present in the 3x3 grid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num) {
                    return false;
                }
            }
        }

        // The current number can be placed in the cell
        return true;
    }

    private static void printSudoku(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
