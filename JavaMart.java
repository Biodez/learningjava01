import java.text.MessageFormat;

public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;
        
        double toyCar = 5.99;
        System.out.println("Can I get this car?");

        if (wallet >= toyCar) {
            System.out.println("Sure you can get the car");
            wallet -= toyCar;
        } else {
            System.out.println(MessageFormat.format("Sorry I only have {0} left", wallet));
        }
       
        //if you have enough money
            //       print: Sure!
            //       pay for the toy car 

        //else:  Sorry, I only have <wallet> left.

        
        double nike = 95.99;       //run test case with 89.99
        System.out.println("Can I get these nike shoes?");

        if (wallet >= nike) {
            System.out.println("Sure! You can get the nike shoes");
            wallet -= nike;

        } else {
            System.out.println(MessageFormat.format("Sorry, I only have {0} left.", wallet));
        }
        //if you have enough money
            //       print: Sure!
            //       pay for the nike shoes 

        //else: Sorry, I only have <wallet> left.

    }
}
