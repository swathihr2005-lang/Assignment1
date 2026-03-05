final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

class Parent {

    final int number = 100;

    final void show() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {

    void displayNumber() {
        
        System.out.println("Final variable value: " + number);
    }
}

public class FinalKeyword {

    public static void main(String[] args) {

        FinalClass obj1 = new FinalClass();
        obj1.display();

        Child obj2 = new Child();
        obj2.show();
        obj2.displayNumber();
    }
}

