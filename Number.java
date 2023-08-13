import java.util.Scanner;
public class Number {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int num1= s.nextInt();
        int num2= s.nextInt();
        int num3= s.nextInt();
        if(num1!=num2&&num2!=num3&&num1!=num3)
            System.out.println("All different");
        else
            System.out.println("Neither all are equal or different");
        s.close();
    }

}
