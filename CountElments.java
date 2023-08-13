import java.util.Scanner;
public class CountElments {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        System.out.print("Enter the element to be counted: ");
        int x = s.nextInt();
        System.out.println("Number of occurrences of element " + x + " in array: " + count(a, n - 1, x));
        s.close();

    }

    public static int count(int[] arr, int n, int x) {
        //int count=0;
        if (n < 0)
            return 0;
        if (arr[n] == x)
            return count(arr, n - 1, x) + 1;
        else
            return count(arr, n - 1, x);
    }
}

