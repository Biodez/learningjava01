import java.text.MessageFormat;

public class FunctionTest {
    public static void main(String[] args) {
        rectangleMeasurement(20, 50);
    }

    public static void rectangleMeasurement(double length, double width){
        double area = length * width;
        System.out.println(MessageFormat.format("The area of the rectangle with length {0} and width {1} is {2} ", length, width, area));
    }
    
}
