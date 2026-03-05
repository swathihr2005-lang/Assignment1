
public class StringReverse {
   public static void main(String[] args) {

        String original = "Kannada";

        StringBuilder sb = new StringBuilder(original);

      
        sb.reverse();

        
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + sb);
    }
}

