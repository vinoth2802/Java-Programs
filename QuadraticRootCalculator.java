import java.util.Scanner;
public class QuadraticRootCalculator {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the coefficients of the quadratic equation(ax^2+bx+c=0): ");
        System.out.print("a :");
        double a= s.nextDouble();
        System.out.print("b :");
        double b= s.nextDouble();
        System.out.print("c :");
        double c= s.nextDouble();
        double discriminant=b*b-4*a*c;
        switch (Double.compare(discriminant,0))
        {
            case 1://positive discriminant
                double root1=(-b+Math.sqrt(discriminant))/(2*a);
                double root2=(-b-Math.sqrt(discriminant))/(2*a);
                System.out.println("Two distinct real roots:");
                System.out.println("Root 1:"+root1);
                System.out.println("Root 2:"+root2);
                break;
            case 0://zero discriminant
                double root=-b/(2*a);
                System.out.println("One real root:");
                System.out.println("Root :"+root);
                break;
            case -1://negative discriminant
                double real=-b/(2*a);
                double img=Math.sqrt(-discriminant)/(2*a);
                System.out.println("Two complex roots: ");
                System.out.println("Root 1:"+real+"+"+img+"i");
                System.out.println("Root 2:"+real+"-"+img+"i");
                break;
            default:System.out.println("Invalid coefficients .cannot determine roots");
        }
        s.close();

    }

}