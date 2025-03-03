package src.main.java.com.example.code;
import java.util.*;
public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            // iterator.remove(); // Uncomment to remove elements while iterating
        }
    }
}
