
public class StringComparison {
    
    public static void main(String[] args) {

        
        String str = "My name is";
        str.concat("sonu");  
        System.out.println("String after concat (without reassignment): " + str);

        str = str.concat(" Sonu");  
        System.out.println("String after concat (with reassignment): " + str);


        StringBuilder sb = new StringBuilder("My name is");
        sb.append(" Sonu");  
        System.out.println("StringBuilder after append: " + sb);

        StringBuffer sbf = new StringBuffer("My name is");
        sbf.append(" Sonu");  
        System.out.println("StringBuffer after append: " + sbf);

        long startTime, endTime;

        startTime = System.currentTimeMillis();
        String test = "";
        for (int i = 0; i < 10000; i++) {
            test += "a";
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by String: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuilder testBuilder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            testBuilder.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuffer testBuffer = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            testBuffer.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ms");
    }

}
