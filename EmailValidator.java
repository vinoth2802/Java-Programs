import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        scanner.close();

        if (isValidEmail(email)) {
            System.out.println("Valid email address!");
            String reversedEmail = reversedEmail(email);
            System.out.println("Reversed email address: " + reversedEmail);
        } else {
            System.out.println("Invalid email address! Please enter a valid email.");
        }
    }

    public static boolean isValidEmail(String email) {
        if (!email.contains("@") || email.indexOf("@") == email.length() - 1 || email.indexOf(".") == email.length() - 1) {
            return false;
        }

        String[] parts = email.split("@");
        String localPart = parts[0];
        String domainPart = parts[1];

        if (localPart.isEmpty() || localPart.startsWith(".") || localPart.endsWith(".")) {
            return false;
        }

        if (domainPart.isEmpty() || !domainPart.contains(".") || domainPart.indexOf(".") == domainPart.length() - 1) {
            return false;
        }

        if (!domainPart.equals(domainPart.toLowerCase())) {
            return false;
        }

        return true;
    }

    public static String reversedEmail(String email) {
        String[] parts = email.split("@");
        String localPart = parts[0];
        String domainPart = parts[1];
        StringBuffer reversedEmail = new StringBuffer(domainPart);
        reversedEmail.reverse();
        reversedEmail.append("@");
        reversedEmail.append(localPart);
        return reversedEmail.toString();
    }
}
