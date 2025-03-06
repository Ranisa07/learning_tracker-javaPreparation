package main.java.com.example.code;

import java.util.WeakHashMap;
import java.util.Map;

public class WeakHashMapExample {
    public static void main(String[] args) {
        // Creating a WeakHashMap
        WeakHashMap<Object, String> weakMap = new WeakHashMap<>();

        // Creating a key object
        Object key1 = new Object();
        Object key2 = new Object();

        // Adding key-value pairs
        weakMap.put(key1, "Value 1");
        weakMap.put(key2, "Value 2");

        // Printing before making key1 eligible for GC
        System.out.println("Before GC: " + weakMap);

        // Removing the strong reference to key1 (eligible for garbage collection)
        key1 = null;

        // Requesting garbage collection
        System.gc();

        // Waiting for a short time to allow GC to process
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing after GC
        System.out.println("After GC: " + weakMap);
    }
}




