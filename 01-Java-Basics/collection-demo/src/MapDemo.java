import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "John");
        employees.put(102, "Peter");
        employees.put(103, "John Smith");
        System.out.println("Employees List: "+ employees);
    }
}
