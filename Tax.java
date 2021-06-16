import java.text.MessageFormat;
import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[4];

        for (int i = 0; i < afterTax.length; i++) {
            afterTax[i] = price[i] + (0.13 * price[i]);
        }
        System.out.println(MessageFormat.format("The original prices are: {0}", Arrays.toString(price)));
        System.out.println(MessageFormat.format("The original prices are: {0}", Arrays.toString(afterTax)));
    }
    
}
