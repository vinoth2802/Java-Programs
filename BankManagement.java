import java.util.Scanner;
import java.util.Vector;

class BankAccount {
    public String name;
    private String address;
    public String accountNumber;
    public double balanceAmount;
    public  Vector<Transaction> transactionList=new Vector<>();
    public  Vector<Loan> loanList=new Vector<>();
    public void read()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("--Creating a new account--");
        System.out.print("Enter the name             : ");
        name=s.nextLine();
        System.out.print("Enter the address          : ");
        address=s.nextLine();
        System.out.print("Enter the account number   : ");
        accountNumber=s.nextLine();
        System.out.print("Enter the balance amount   : ");
        balanceAmount=Double.parseDouble(s.nextLine());
    }
    public void displayBankAccount()
    {
        System.out.println("Name           : "+name);
        System.out.println("Address        : "+address);
        System.out.println("Account number : "+accountNumber);
        System.out.println("Balance amount : "+balanceAmount);
    }
}
class Loan extends BankAccount{
    private  double loanAmount;
    private  int numberOfInstallment;
    private  double EMIamount;
    final static  double rate=0.1;
    public void getLoan()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("--For getting a loan---");
        System.out.print("Enter the amount for the loan    : ");
        loanAmount=Double.parseDouble(s.nextLine());
        System.out.print("Enter the number of installments : ");
        numberOfInstallment=Integer.parseInt(s.nextLine());
        System.out.println("Loan is provided with 10% interest rate.");
        calculateEMI();
        System.out.println("The EMI amount is : "+String.format("%.2f",EMIamount)+" rupees");
    }
    public void calculateEMI()
    {
        EMIamount=(loanAmount*numberOfInstallment*rate)/100;
    }
    public  void displayLoan()
    {
        int j=1;
        System.out.println("Loan history of "+name+" :");
        for(Transaction t:transactionList)
        {
            System.out.println("Loan"+j+" :");
            System.out.println("Loan amount            : "+loanAmount);
            System.out.println("Number of installments : "+numberOfInstallment);
            System.out.println("EMI amount             : "+EMIamount);
            j++;
        }

    }
}
class Transaction extends BankAccount
{
    private String date;
    private String typeOfTransaction;
    private double transactionAmount;

    public void  makeTransaction() {
        Scanner s=new Scanner(System.in);
        System.out.println("---Making a Transaction---");
        System.out.print("Enter the date(dd/mm/yyyy)                  : ");
        date = s.nextLine();
        System.out.print("Enter the type of transaction(credit/debet) : ");
        typeOfTransaction = s.nextLine();
        if (typeOfTransaction.equalsIgnoreCase("credit")) {
            System.out.print("Enter the amount to deposit                 : ");
            transactionAmount = Double.parseDouble(s.nextLine());
            balanceAmount += transactionAmount;
            System.out.println("After deposit the balance amount is         : " + balanceAmount);
        } else if (typeOfTransaction.equalsIgnoreCase("debet")) {
            System.out.print("Enter the amount to withdraw                : ");
            transactionAmount = Double.parseDouble(s.nextLine());
            balanceAmount -= transactionAmount;
            System.out.println("After withdrawal the balance amount is       : " + balanceAmount);
        }
    }

        public  void displayTransaction()
        {
            int j = 1;
            System.out.println("Transaction history of " + name + " :");
            for (Transaction t : transactionList) {
                System.out.println("Transaction" + j + " :");
                System.out.println("Date             : " + date);
                System.out.println("Transaction type : " + typeOfTransaction);
                System.out.println("Amount           : " + transactionAmount);
                j++;
            }
        }

}

public class BankManagement{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("---Bank Management System---");
                    BankAccount user=new BankAccount();
                    user.read();

                            Transaction t=new Transaction();
                            t.makeTransaction();

                            Loan l=new Loan();
                            l.getLoan();


                            Transaction t1=new Transaction();
                            t.displayTransaction();

                            Loan l1 = new Loan();
                            l.displayLoan();

                    s.close();

            }

        }








