import java.util.Scanner;
import java.util.Vector;
 public class BloodDonor {
    private String name;
    private String bloodGroup;
    private double weight;
    private double height;
    private String contactNumber;
    private String location;

     private static Vector<BloodDonor> bloodDonorList=new Vector<>();

     public  void read()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your details for blood donor registration:");
        System.out.print("Name           : ");
        name=s.nextLine();
        System.out.print("Blood Group    : ");
        bloodGroup=s.next();
        System.out.print("Weight(kg)     : ");
        weight=s.nextDouble();
        System.out.print("Height(m)      : ");
        height=s.nextDouble();
        System.out.print("Contact Number : ");
        contactNumber=s.next();
        System.out.print("Location       : ");
        location=s.next();
    }
    public static  void displayByBloodGroup(String BG)
    {
        System.out.println("Blood donors with "+BG+" blood group:");
        int j=1;
        for(int i=0;i<bloodDonorList.size();i++)
        {
            if(bloodDonorList.get(i).bloodGroup.equalsIgnoreCase(BG))
            {
                System.out.println("Donor"+j+" :");
                System.out.println("Name          : "+bloodDonorList.get(i).name);
                System.out.println("Contact number: "+bloodDonorList.get(i).contactNumber);
                j++;
            }
            else
                continue;
        }
    }
    public static void displayByLocation(String loc) {
        System.out.println("Blood donors from " + loc + " :");
        int j = 1;
        for (int i = 0; i < bloodDonorList.size(); i++)
        {
            if (bloodDonorList.get(i).location.equalsIgnoreCase(loc))
            {
                System.out.println("Donor" +j+ " :");
                System.out.println("Name          : " + bloodDonorList.get(i).name);
                System.out.println("Contact number: " + bloodDonorList.get(i).contactNumber);
                j++;
            }
            else
                continue;
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("----BLOOD BANK MANAGEMENT SYSTEM----");
        while(true)
        {
            System.out.println("--Choose a operation to continue--");
            System.out.println("1.Register to donate blood\n2.Search for a blood donor\n3.Exit");
            int choice1 = s.nextInt();
            switch (choice1) {
                case 1:
                    BloodDonor newDonor= new BloodDonor();
                    newDonor.read();
                    bloodDonorList.add(newDonor);
                    break;
                case 2:
                    System.out.println("Search donor by:\n1.Blood Group\n2.Location");
                    int choice2 = s.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.print("Enter the blood group: ");
                            String BG = s.next();
                            displayByBloodGroup(BG);
                            break;
                        case 2:
                            System.out.print("Enter the location: ");
                            String l = s.next();
                            displayByLocation(l);
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program");
                    s.close();
                    return;

            }
        }
    }

}
