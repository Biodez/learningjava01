import java.text.MessageFormat;

public class Variables {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;


        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples += 500;
        //Update number of apples.
        
        System.out.println("Time for business! You're selling each apple for 40 cents");
        //Make a price variable. Set it equal to 40 cents.
        double price = 0.40;

        System.out.println("One customer walked in. He bought 4 apples!");
        //Update number of apples.
        numOfApples -= 4;
        //Update number of customers;
        numOfCustomers += 1;
        //Update profit
        profit = price * 4;

        System.out.println("Another customer walked in. He bought 20 apples!");
        //Update number of apples;
        numOfApples -= 20;
        //Update number of customers;
        numOfCustomers += 1;
        //Update profit
        profit = profit + (price * 20);

        System.out.println("Another customer walked in. She bought 200 apples!");
        //Update number of apples;
        numOfApples -= 200;
        //Update number of customers;
        numOfCustomers += 1;
        //Update profit
        profit = profit + (price * 200);

        System.out.println(MessageFormat.format("Wow! So far, you made: {0}", profit));
        System.out.println(MessageFormat.format("{0} customers love your apples.", numOfCustomers));
        System.out.println(MessageFormat.format("You have {0} apples left. We'll sell more tomorrow!", numOfApples));

    }

}