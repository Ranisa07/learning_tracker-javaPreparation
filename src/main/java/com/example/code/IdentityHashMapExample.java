package main.java.com.example.code;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        // Creating an IdentityHashMap
        IdentityHashMap<String, String> identityMap = new IdentityHashMap<>();

        // Creating two different String objects with the same value
        String key1 = new String("A");
        String key2 = new String("A"); // Different object with the same content

        // Adding key-value pairs to IdentityHashMap
        identityMap.put(key1, "First");
        identityMap.put(key2, "Second"); // This will be treated as a different key

        // Printing IdentityHashMap contents
        System.out.println("IdentityHashMap contents:");
        for (Map.Entry<String, String> entry : identityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
