 import java.io.FileReader;
import java.io.IOException;
public class ExceptionDemo {
  public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;   
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception Caught: " + e);
        }

        try {
            FileReader file = new FileReader("test.txt");  
            System.out.println("File opened successfully.");
            file.close();
        } catch (IOException e) {
            System.out.println("Checked Exception Caught: " + e);
        }

        System.out.println("Program continues after handling exceptions.");
    }
}

