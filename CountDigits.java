import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n=s.nextLong();
        int count=0;
        while(n>0)
        {
            n/=10;
            count++;
        }
        System.out.print("Number of digits: "+count);
        s.close();
    }

}
