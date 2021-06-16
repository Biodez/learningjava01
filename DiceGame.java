import java.text.MessageFormat;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Numbers cannot be less than 0, Game shutting down!");
            System.exit(0);
        } else if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("Numbers cannot be greater than 6, Game shutting down!");
            System.exit(0);
        } else {
            int numSum = num1+num2+num3;
            int diceSum = roll1+roll2+roll3;

            System.out.println(MessageFormat.format("Dice Sum is {0} and Number sum is {1}", diceSum, numSum));

            if (checkWin(diceSum, numSum)) {
                System.out.println("Congrats, you win!");
            } else {
                System.out.println("Sorry, you lose!");
            }
        }
        scan.close();
    }

    public static int rollDice(){
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int)randomNumber;
    }
    public static boolean checkWin(int diceSum, int numSum){
        return (diceSum < numSum && numSum - diceSum < 3);
    }
    
}
