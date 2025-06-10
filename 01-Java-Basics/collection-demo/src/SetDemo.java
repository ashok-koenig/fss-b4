import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        System.out.println("Fruits List: "+ fruits);
    }
}
