import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pizza toppings do you want?.");
        int toppingsNumber = scan.nextInt();

        String[] pizzaTopings = new String[toppingsNumber];
        scan.nextLine();
        System.out.println("Great, enter each topping!");
        for (int i = 0; i < toppingsNumber; i++) {
            System.out.print(i + ". ");
            String toppingsText = scan.nextLine();
            pizzaTopings[i] = toppingsText;
        }
        System.out.println(Arrays.toString(pizzaTopings));
        System.out.println("Thank ypu! Here are the toppings you ordered...");
        for (int j = 0; j < pizzaTopings.length; j++) {
            System.out.println(MessageFormat.format("{0}. {1}", j, pizzaTopings[j]));
        }
        System.out.println("Press anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");

        scan.close();
         
    }
}
