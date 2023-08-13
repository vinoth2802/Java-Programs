import java.util.Scanner;

public class DecimalToBinaryConvertor {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber=s.nextInt();
        if(decimalNumber==0)
        {
            System.out.print("Binary equivalent: 0");
            return;
        }
        int binary=0;
        int power=1;
        while(decimalNumber>0)
        {
            int remainder=decimalNumber%2;
            binary=binary+(remainder*power);
            power*=10;
            decimalNumber/=2;
        }
        System.out.println("Binary equivalent: "+binary);
        s.close();
    }
}
