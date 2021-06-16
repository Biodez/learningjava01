import java.text.MessageFormat;
import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("If Java was easy, they would call it Python!");
        // }

        Scanner scan = new Scanner(System.in);
        // System.out.print("pick a number to count by: ");
        // int numCount = scan.nextInt();
        // System.out.print("pick a number to start counting from: ");
        // int fromCount = scan.nextInt();
        // System.out.print("pick a number to count to: ");
        // int countTo = scan.nextInt();

        // for (int i = fromCount; i <= countTo; i+=numCount) {
        //     System.out.print(MessageFormat.format("{0} ", i));
        // }

        // for (int i = 0; i < 19; i++) {
        //     if (i % 3 == 0 && i % 5 == 0){
        //         System.out.println(i + " FizzBuzz");
        //     } else if (i % 5 == 0){
        //         System.out.println(i + " Buzz");
        //     } else if (i % 3 == 0) {
        //         System.out.println(i + " Fizz");
        //     }
        // }
        
        // int myChoice = myNumber();
        // System.out.print("I choose a number between 1 and 5. Try to guess it: ");
        // int userChoice = scan.nextInt();
      
        // while (userChoice != myChoice) {
        //     System.out.print("Guess again: ");
        //     userChoice = scan.nextInt();
        // }
        // System.out.println("You win");


        // String username = "afeez";
        // String password = "Oladokun1992@";

        // System.out.println("Welcome to Javagram! Sign in below");
        // System.out.print("* Username: ");
        // String yourUsername = scan.nextLine();
        // System.out.print("* Password: ");
        // String yourPassword = scan.nextLine();

        // while (!yourUsername.equals(username) || !yourPassword.equals(password)) {
        //     System.out.println("\nIncorrect, please try again\n");
        //     System.out.print("* Username: ");
        //     yourUsername = scan.nextLine();
        //     System.out.print("* Password: ");
        //     yourPassword = scan.nextLine();
        // }
        // System.out.println("\nSign in successful. Welcome!");

    //     System.out.println("Hi Bart, I can write lines for you");

    //     System.out.println("What did you want me to write?");
    //     String userInput = scan.nextLine();

    //    for (int i = 0; i <= 99; i++) {
    //        System.out.println(MessageFormat.format("{0}. {1};", i, userInput));
    //    }
    //    System.out.print("Hi Timmy! choose a number to count to: ");
    //    int numberChoice = scan.nextInt();
    //    System.out.println("Great! Here is how it is done");

    //    for (int i = 0; i <= numberChoice; i++) {
    //        System.out.print(i + " ");
    //    }
        

        // for (int i = 99; i >= 1; i--) {
        //     sing(i);
        // }

        int dice1 = rollDice();
        int dice2 = rollDice();

        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2 + "\n");

        while (dice1 != dice2) {
            dice1 = rollDice();
            dice2 = rollDice();

            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2 + "\n");
        }
        System.out.println("You rolled double!");
        

        scan.close();
    }

    // public static void sing(int i){
    //     System.out.println(MessageFormat.format("{0} bottles of beer on the wall, {1} bottles of beer! \n take one down, pass it around, {2} bottles of beer on the wall! \n", i, i, i-1));
    // }

    // public static int myNumber(){
    //     double randomNumber = Math.random() * 5;
    //     randomNumber += 1;
    //     return (int)randomNumber;
    // }

    public static int rollDice(){
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int)randomNumber;
    }
    
}
