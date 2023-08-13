import java.util.Scanner;
public class PrimeNumberGenerator {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the limit(n): ");
        int n=s.nextInt();
        System.out.println("All the prime numbers within 1 and "+n+" are:");
        for(int x=2;x<n;x++) {
            boolean isPrime = true;
            for(int y=2;y<=x/2;y++)
            {
                if(x%y==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
                System.out.print(x+" ");
        }
        s.close();
    }
}
