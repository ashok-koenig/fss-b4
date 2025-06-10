import mypackage.MyClass;

public class Demo {
    // Instance Variable
    String course = "Java Spring Boot";

    void welcome(){
        System.out.println("Welcome method called");
    }

    // Static variable
    static int studentCount = 25;

    public static void main(String[] args) {
        System.out.println("Welcome to Java Programming");
        // Local Variable
        String fullName = "John Smith";
        System.out.println("Name: "+ fullName);

        // Create an object for the Demo Class
        Demo obj = new Demo();

        System.out.println("Course: "+ obj.course);

        obj.welcome();

        System.out.println("Student Count: "+ Demo.studentCount);

        // Create an object for Student class
        Student student1 = new Student("Peter", (short)15, (short) 9);

        student1.introduce();

        System.out.println("Name: "+ student1.name);
//        System.out.println("Grade: "+ student1.grade); // Not possible because grade in private

        // Switch demo

        int num = 2;

        switch (num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Unknown");
                break;
        }

        // Create an object for Child class
        Child child = new Child();
        child.display();

        // Create an object for MyClass in mypackage
        MyClass myClass = new MyClass();
        myClass.display();
    }
}
