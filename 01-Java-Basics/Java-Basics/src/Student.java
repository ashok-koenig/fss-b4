public class Student {
    public String name;
    public short age;
    private short grade;
    // Constructor - Used to intialize the instance variables while creating object
    public Student(String name, short age, short grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void introduce(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Grade: "+ grade);
    }
}
