import java.text.MessageFormat;
import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");

        scan.nextLine();
        
        int cardNumber1 = randomCard();
        int cardNumber2 = randomCard();
        System.out.println(MessageFormat.format("\n You get a \n {0} \n and a \n {1}", cardString(cardNumber1), cardString(cardNumber2)));
        int userHandValue = Math.min(cardNumber1, 10) + Math.min(cardNumber2, 10);
        System.out.println(MessageFormat.format("Yor total is {0}", userHandValue));

        int dealerNumber1 = randomCard();
        int dealerNumber2 = randomCard();
        int dealerHandValue = Math.min(dealerNumber1, 10) + Math.min(dealerNumber2, 10);
        System.out.println(MessageFormat.format("\nThe dealer shows \n {0} \n and has a card facing down \n {1}", cardString(dealerNumber1), faceDown()));
        System.out.println("\nThe dealer's total is hidden");

        while (true) {
            String userOption = hitOrStay();
            if (userOption.equals("hit")) {
                int newUserNumber = randomCard();
                System.out.println(MessageFormat.format("\n You got a \n {0}", cardString(newUserNumber)));
                userHandValue = Math.min(newUserNumber, 10) + userHandValue;
                System.out.println(MessageFormat.format("Your new total is {0}", userHandValue));

                if (userHandValue > 21) {
                    System.out.println("Bust! Player loses");
                    System.exit(0);
                } 
            } else {
                System.out.println("\nDealers turn!");
                System.out.println("\nThe dealer's cards are \n" + cardString(dealerNumber1) + "\n and a \n" + cardString(dealerNumber2));
                while (true) {
                    scan.nextLine();
                    int dealerNewNumber = randomCard();
                    System.out.println("\nDealer gets a\n" + cardString(dealerNewNumber));
                    dealerHandValue = Math.min(dealerNewNumber, 10) + dealerHandValue;
                    System.out.println("Dealer's total is " + dealerHandValue);
                    if (dealerHandValue > 21) {
                        System.out.println("Bust! Dealer loses");
                        System.exit(0);

                    } else if (dealerHandValue >= 17){
                        break;
                    }
                    break;
                }
                break;
            }
        }
        if (dealerHandValue > userHandValue) {
            System.out.println("Dealer Wins!");
        } else {
            System.out.println("Player Wins!");
        }
    
         scan.close();

    }
    public static int randomCard(){
        double randomNumber = Math.random() * 13;
        randomNumber += 1;
        return (int)randomNumber;
    }
    public static String cardString(int cardNumber){
        if (cardNumber == 1) {
            return "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
        } else if (cardNumber == 2){
            return "   _____\n"+              
                   "  |2    |\n"+ 
                   "  |  o  |\n"+
                   "  |     |\n"+
                   "  |  o  |\n"+
                   "  |____Z|\n";
        } else if (cardNumber == 3){
            return "   _____\n" +
                   "  |3    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  |  o  |\n"+
                   "  |____E|\n";
        } else if (cardNumber == 4){
            return "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";
        } else if (cardNumber == 5){
            return "   _____ \n" +
                   "  |5    |\n" +
                   "  | o o |\n" +
                   "  |  o  |\n" +
                   "  | o o |\n" +
                   "  |____S|\n";
        } else if (cardNumber == 6){
            return "   _____ \n" +
                   "  |6    |\n" +
                   "  | o o |\n" +
                   "  | o o |\n" +
                   "  | o o |\n" +
                   "  |____6|\n";
        } else if (cardNumber == 7){
            return "   _____ \n" +
                   "  |7    |\n" +
                   "  | o o |\n" +
                   "  |o o o|\n" +
                   "  | o o |\n" +
                   "  |____7|\n";
        } else if (cardNumber == 8){
            return "   _____ \n" +
                   "  |8    |\n" +
                   "  |o o o|\n" +
                   "  | o o |\n" +
                   "  |o o o|\n" +
                   "  |____8|\n";
        } else if (cardNumber == 9){
            return "   _____ \n" +
                   "  |9    |\n" +
                   "  |o o o|\n" +
                   "  |o o o|\n" +
                   "  |o o o|\n" +
                   "  |____9|\n";
        } else if (cardNumber == 10){
            return "   _____ \n" +
                   "  |10  o|\n" +
                   "  |o o o|\n" +
                   "  |o o o|\n" +
                   "  |o o o|\n" +
                   "  |___10|\n";
        } else if (cardNumber == 11){
            return "   _____\n" +
                   "  |J  ww|\n"+ 
                   "  | o {)|\n"+ 
                   "  |o o% |\n"+ 
                   "  | | % |\n"+ 
                   "  |__%%[|\n";
        } else if (cardNumber == 12){
            return "   _____\n" +
                   "  |Q  ww|\n"+ 
                   "  | o {(|\n"+ 
                   "  |o o%%|\n"+ 
                   "  | |%%%|\n"+ 
                   "  |_%%%O|\n";
        } else {
            return "   _____\n" +
                   "  |K  WW|\n"+ 
                   "  | o {)|\n"+ 
                   "  |o o%%|\n"+ 
                   "  | |%%%|\n"+ 
                   "  |_%%%>|\n";

        }
    }

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }

    public static String hitOrStay(){
        System.out.println("Would you like to hit or stay?");
        String userResult = scan.nextLine();
        while (!userResult.equalsIgnoreCase("hit") && !userResult.equalsIgnoreCase("stay")) {
            System.out.println("please write hit or stay");
            userResult = scan.nextLine();
        }
        return userResult;
    }
  
}


