
abstract class Shape {
   
    abstract double area();
}

class Circle extends Shape {
    double radius;

 
    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape {
    double length;
    double width;

   
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

   
    double area() {
        return length * width;
    }
}


  
public class Main {
     public static void main(String[] args) {
        Shape s1 = new Circle(6);
        Shape s2 = new Rectangle(5, 7);

        System.out.println("Area of Circle: " + s1.area());
        System.out.println("Area of Rectangle: " + s2.area());
    } 
}
