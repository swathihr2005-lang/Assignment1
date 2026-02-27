
package assignment1;

public class Demo {
    

    
    void show(int a) {
        System.out.println("Overloading: " + a);
    }

    void show(int a, int b) {
        System.out.println("Overloading: " + (a + b));
    }
}

class Test extends Demo {

    // overriding
    @Override
    void show(int a) {
        System.out.println("Overriding: " + a);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show(5);
        t.show(5, 10);
    }
}

