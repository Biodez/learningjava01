import java.text.MessageFormat;
import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lets play Pokerito. Type anything when you are ready.");
        scan.nextLine();
        System.out.println("• There are two players, you and the computer.");
        System.out.println("• The dealer will give each player one card.");
        System.out.println("• Then, the dealer will draw five cards (the river)");
        System.out.println("• The player with the most river matches wins!");
        System.out.println("• If the matches are equal, everyone's a winner!\n");

        System.out.println("• Ready? Type anything if you are.");
        scan.nextLine();

        String playerCard = randomCard();
        System.out.println("Here's your card: ");
        System.out.println(playerCard + "\n");
        String computerCard = randomCard();
        System.out.println("Here's the computer's card: ");
        System.out.println(computerCard);

        int yourMatches = 0;
        int computerMatches =0;

        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        for (int i = 1; i <= 5; i++) {
            scan.nextLine();
            System.out.println(MessageFormat.format("Card {0} \n\n", i));
            String cardDrawn = randomCard();
            System.out.println(cardDrawn);

            if (playerCard.equals(cardDrawn)) {
                yourMatches += 1;
            } else if (computerCard.equals(cardDrawn)){
                computerMatches += 1;
            }
        }

        System.out.println(MessageFormat.format("Your number of matches: {0}", yourMatches));
        System.out.println(MessageFormat.format("Computer number of matches: {0}", computerMatches));

        if (yourMatches > computerMatches) {
            System.out.println("You win!");
        } else if(yourMatches < computerMatches) {
            System.out.println("The computer wins!");
        } else {
            System.out.println("Everyone wins!");
        }
         scan.close();
    }
    public static String randomCard(){
        double randomNumber = Math.random() * 13;
        randomNumber += 1;
        randomNumber = (int)randomNumber;

        if (randomNumber == 1) {
            return "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
        } else if (randomNumber == 2){
            return "   _____\n"+              
                   "  |2    |\n"+ 
                   "  |  o  |\n"+
                   "  |     |\n"+
                   "  |  o  |\n"+
                   "  |____Z|\n";
        } else if (randomNumber == 3){
            return "   _____\n" +
                   "  |3    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  |  o  |\n"+
                   "  |____E|\n";
        } else if (randomNumber == 4){
            return "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";
        } else if (randomNumber == 5){
            return "   _____ \n" +
                   "  |5    |\n" +
                   "  | o o |\n" +
                   "  |  o  |\n" +
                   "  | o o |\n" +
                   "  |____S|\n";
        } else if (randomNumber == 6){
            return "   _____ \n" +
                   "  |6    |\n" +
                   "  | o o |\n" +
                   "  | o o |\n" +
                   "  | o o |\n" +
                   "  |____6|\n";
        } else if (randomNumber == 7){
            return "   _____ \n" +
                   "  |7    |\n" +
                   "  | o o |\n" +
                   "  |o o o|\n" +
                   "  | o o |\n" +
                   "  |____7|\n";
        } else if (randomNumber == 8){
            return "   _____ \n" +
                   "  |8    |\n" +
                   "  |o o o|\n" +
                   "  | o o |\n" +
                   "  |o o o|\n" +
                   "  |____8|\n";
        } else if (randomNumber == 9){
            return "   _____ \n" +
                   "  |9    |\n" +
                   "  |o o o|\n" +
                   "  |o o o|\n" +
                   "  |o o o|\n" +
                   "  |____9|\n";
        } else if (randomNumber == 10){
            return "   _____ \n" +
                   "  |10  o|\n" +
                   "  |o o o|\n" +
                   "  |o o o|\n" +
                   "  |o o o|\n" +
                   "  |___10|\n";
        } else if (randomNumber == 11){
            return "   _____\n" +
                   "  |J  ww|\n"+ 
                   "  | o {)|\n"+ 
                   "  |o o% |\n"+ 
                   "  | | % |\n"+ 
                   "  |__%%[|\n";
        } else if (randomNumber == 12){
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

}

