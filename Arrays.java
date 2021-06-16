import java.text.MessageFormat;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] seats = {"Harry", "Neville", "Ron", "Hermione", "Seamus"};
        System.out.println("It's time to take your fifth year exams. Please, take your seats");
        for (int i = 0; i < seats.length; i++) {
            System.out.println(seats[i] + ", you will take seat " + i);
        }
        System.out.println("Welcome to Java Grocers \nWhat can i help you find: ");
        String groceries = scan.nextLine();
        String[] aisle = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        for (int i = 0; i < aisle.length; i++) {
            if (aisle[i].equals(groceries)) {
                System.out.println(MessageFormat.format("\nWe have that in aisle: {0}", i));
                break;
            }
        }
        int highScore = 0;
        int seat = 0;
        int[] randomArray = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
        randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i] + " ");
        }
        for (int i = 0; i < randomArray.length; i++) {
            if(randomArray[i] > highScore){
                highScore = randomArray[i];
                seat = i;
            }
        }
        System.out.println(MessageFormat.format("\n\nThe highest score is: {0}. Give that man a cookie!", highScore));
        System.out.println("It's the gentleman in seat: " + seat + ". Give that man a cookie!");

        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int wins = 0;
        int loss = 0;
        for (int i = 0; i < record.length; i++) {
            if (record[i].equals("WIN")) {
                wins += 1;
            } else {
                loss += 1;
            }
        }
        System.out.println("With a professional record of " + wins + " wins and " + loss + " losses.");
        System.out.println("He is the pride of oracle: Java Fury!");      

        String[] apple = {"Gala", "Granny Smith", "Macintosh"};
        double[] price = {1.99, 1.49, 1.29};

        for (int i = 0; i < apple.length; i++) {
            System.out.println(MessageFormat.format("\t{0}: ${1}", apple[i], price[i]));
        }

        scan.close();
        
    }

    public static int randomNumber(){
        double r = Math.random() * 50000;
        return (int)r;
    }
    
}
