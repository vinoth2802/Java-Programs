import java.util.Scanner;
public class Array2D {
   private int row;
    private int col;
    private int[][] a;
    Array2D(int x,int y)
    {
        row=x;
        col=y;
        a=new int[row][col];
    }
    public void read()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the elements of array:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        s.close();
    }
    public void sumOfArrayElements()
    {
        System.out.println("Sum of elements in each row and column:");
        int sum=0;
        for(int i=0,k=0;i<row||k<col;i++,k++) {
            int rowSum=0,colSum=0;
            for (int j = 0,l=0; j < col||l<row; j++,l++)
            {
                if(i<row&&j<col) {
                    rowSum += a[i][j];
                    sum+=a[i][j];
                }
                if(k<col&&l<row) {
                    colSum += a[l][k];
                }
            }
            System.out.println("row "+(i+1)+"    :"+rowSum);
            System.out.println("column "+(k+1)+" :"+colSum);
        }
        System.out.println("Sum of all elements of array: "+sum);
    }
    public void display()
    {
        System.out.println("---Displaying the Array---");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no.of rows: ");
        int r=s.nextInt();
        System.out.print("Enter the no.of columns: ");
        int c=s.nextInt();
        Array2D arr=new Array2D(r,c);
        arr.read();
        arr.sumOfArrayElements();
        arr.display();
        s.close();
    }

}















