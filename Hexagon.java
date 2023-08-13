import java.util.Scanner;
public class Hexagon {
    static final double PI=3.14;
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the side length of a hexagon(in meters): ");
        double side=s.nextDouble();
        System.out.println("Area of the hexagon: "+String.format("%.2f",area(side))+" square meter");
        s.close();
    }
    public static  double area(double side)
    {
        return ((6*(side*side))/(4*(Math.tan(PI/6))));
    }
}
