

interface Employee
{

    double calculateSalary();

}

class HourlyEmployee implements Employee{
    private String name;
    private int employeeID;
    private double hourlyRate;
    private int hoursWorked;
    public HourlyEmployee(String name,int employeeID,double hourlyRate,int hoursWorked )
    {
        this.name=name;
        this.employeeID=employeeID;
            this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }
    public double  calculateSalary()
    {
        return hourlyRate*hoursWorked;
    }
    public String toString()
    {
        System.out.println("Employee name : "+name);
        System.out.println("Employee ID   : "+employeeID);
        System.out.println("Employee type : Hourly employee");
        return "";
    }


}
class FullTimeEmployee implements Employee{
    private String name;
    private int employeeID;
    private double dailyRate;
    private int totalAbsentDays;
    private String month;
    enum Month{
        JANUARY(31),FEBRUARY(28),MARCH(31),APRIL(30),MAY(31),JUNE(30),JULY(31),
        AUGUST(31),SEPTEMBER(30),OCTOBER(31),NOVEMBER(30),DECEMBER(31);
        private  int days;
        private Month(int value)
        {
            days=value;
        }
        public int getDays()
        {
            return days;
        }


    }

    FullTimeEmployee(String name,int employeeID,double dailyRate,int totalAbsentDays,String month)
    {
        this.name=name;
        this.employeeID=employeeID;
        this.dailyRate=dailyRate;
        this.totalAbsentDays=totalAbsentDays;
        this.month=month;
    }
    public double calculateSalary()
    {
        Month m=Month.valueOf(month.toUpperCase());
        int totalDays=m.getDays();
        int workingDays=totalDays-totalAbsentDays;
        return workingDays*dailyRate;
    }
    public String toString()
    {
        System.out.println("Employee name : "+name);
        System.out.println("Employee ID   : "+employeeID);
        System.out.println("Employee type : Full Time employee ");
        return "";
    }


}


public class DynamicDispatching {
    public static void main(String[] args) {
        Employee emp;
        emp=new HourlyEmployee("vinoth",12,100,6);
        System.out.println(emp+"Salary : $ "+emp.calculateSalary());
        emp=new FullTimeEmployee("Kumar",13,1000,4,"march");
        System.out.println(emp+"Salary : $ "+emp.calculateSalary());
    }
}
