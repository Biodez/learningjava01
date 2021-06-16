import java.text.MessageFormat;
import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheitArray = celciusToFahrenheit(celsius);
        System.out.println(Arrays.toString(fahrenheitArray));
        System.out.println("\n");
        printTemperature(celsius, "Celsius");
        System.out.println("\n");
        printTemperature(fahrenheitArray, "Fahrenheit");
    }  

     public static double[] celciusToFahrenheit(double[] celsius){
        double[] fahrenheit = new double[7];
        for (int i = 0; i < celsius.length; i++) {
            fahrenheit[i] = (celsius[i]/5 * 9) + 32;

        }
        return fahrenheit;
     }

    public static void printTemperature(double[] temp, String type){
        System.out.print(MessageFormat.format("{0}: ", type));
        for (int i = 0; i < temp.length; i++) {
            System.out.print(MessageFormat.format("{0} ", String.format("%.2f", temp[i])));
        }
    }

}
