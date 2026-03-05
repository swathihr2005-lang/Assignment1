class Student {

    int rollNo;          
    String name;        
    static String college = "ABC College"; 

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    static void changeCollege(String newCollege) {
        college = newCollege;  
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class StaticDemo {
     public static void main(String[] args) {

        Student s1 = new Student(1, "Sonu");
        Student s2 = new Student(2, "Rahul");

        System.out.println("Before changing college:");
        s1.display();
        s2.display();

        Student.changeCollege("XYZ College");

        System.out.println("\nAfter changing college:");
        s1.display();
        s2.display();
    }

}
