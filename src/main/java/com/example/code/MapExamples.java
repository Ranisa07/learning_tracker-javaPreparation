package main.java.com.example.code;
import java.util.*;
public class MapExamples {
    public static void main(String[] args) {
        // HashMap Example (Unordered)
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Cherry", 30);
        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap Example (Insertion Order Maintained)
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Cherry", 30);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap Example (Sorted Order by Key)
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Cherry", 30);
        System.out.println("TreeMap: " + treeMap);
    }
}


