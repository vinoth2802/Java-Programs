//import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args)
    {
        System.out.println("The first 100 prime numbers:");
        int sum=0;
        for(int i=2;i<=100;i++)
        {
            boolean flag=true;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nSum of first 100 prime numbers: "+sum);
    }
}
