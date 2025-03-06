package src.main.java.com.example.code;
import java.util.*;
public class ForIndexLoopExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
