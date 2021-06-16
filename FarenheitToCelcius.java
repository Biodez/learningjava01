import java.text.MessageFormat;
import java.util.Scanner;

public class FarenheitToCelcius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Kindly input the farenheit value of the temperature you want to convert: \n");
        double farenheitValue = scan.nextDouble();
        double celciusValue = farenheitCelcius(farenheitValue);

        printTemperature(farenheitValue, celciusValue);

        scan.close();
    }
    public static double farenheitCelcius(double farenheit){
        double Celcius = (farenheit - 32) * 5/9;
        return Celcius;
    }
    public static void printTemperature(double farenheit, double celciusValue){
        System.out.println(MessageFormat.format("\nThe farenheit value is {0} \n", farenheit));
        System.out.println(MessageFormat.format("The farenheit value of {0} degrees gives {1} degrees celcius after conversion", farenheit, celciusValue));
    }
    
}
