import java.text.MessageFormat;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are");

        String userInput = scan.nextLine();

        if (userInput.equals("yes")) {
            System.out.println("Great!");
            System.out.println("rock – paper – scissors, shoot!");
            String userChoice = scan.nextLine();

            if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
                String computerChosees = computerChoice();
                String results = results(userChoice, computerChosees);
                printResult(userChoice, computerChosees, results);
            } else {
                System.out.println("you have to choose between rock, paper or scissors...");
            }
        } else {
            System.out.println("Darn, some other time...! ");
        }


        scan.close();
    }

    public static String computerChoice(){
        double randomNumber = Math.random() * 3;
        // randomNumber += 1;
        randomNumber = (int)randomNumber;

        if (randomNumber == 1) {
            return "rock";
        } else if (randomNumber == 2){
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String results(String userChoice, String computerChosees){
        if ((userChoice.equals("rock") && computerChosees.equals("scissors")) || 
        (userChoice.equals("paper") && computerChosees.equals("rock")) || (userChoice.equals("scissors") && computerChosees.equals("paper"))) {
            return "You win!";
        } else if ((userChoice.equals("scissors") && computerChosees.equals("rock")) || 
        (userChoice.equals("rock") && computerChosees.equals("paper")) || (userChoice.equals("paper") && computerChosees.equals("scissors"))){
            return "You lose!";
        } else {
            return "It's a tie";
        }
    }
    public static void printResult(String userChoice, String computerChosees, String results){
        System.out.println(MessageFormat.format("You choose: {0}", userChoice));
        System.out.println(MessageFormat.format("Computer chooses: {0}", computerChosees));
        System.out.println(results);
    }
    
}
