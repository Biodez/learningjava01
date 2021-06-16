import java.text.MessageFormat;
import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Javagram, Let's get you signed up...");
        // int counter = 0;

        System.out.println("\nWhat is your first name: ");
        String f_name = scan.nextLine();
        // counter++;
        System.out.println("\nWhat is your last name: ");
        String l_name = scan.nextLine();

        System.out.println("\nHow old are you: ");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("\nWhat username would you prefer: ");
        String username = scan.nextLine();

        System.out.println("\nWhat city are you from: ");
        String city = scan.nextLine();

        System.out.println("\nWhat country are you from: ");
        String country = scan.nextLine();

        // System.out.println("How much money would you like to spend on Coffee: ");
        // double coffeeMoney = scan.nextDouble();
        // counter++;

        // System.out.println("How many times a week do you take coffee: ");
        // int coffeeDays = scan.nextInt();
        // counter++;

        System.out.println(MessageFormat.format("\nThank you {0} for joining Javagram!!!", f_name));
        System.out.println("\nHere are the information you entered...");
        System.out.println(MessageFormat.format("\tFirstname: {0}", f_name));
        System.out.println(MessageFormat.format("\tLastname: {0}", l_name));
        System.out.println(MessageFormat.format("\tAge: {0}", age));
        System.out.println(MessageFormat.format("\tUsername: {0}", username));
        System.out.println(MessageFormat.format("\tCity: {0}", city));
        System.out.println(MessageFormat.format("\tCountry: {0}", country));

        scan.close();
        
    }
    
}
