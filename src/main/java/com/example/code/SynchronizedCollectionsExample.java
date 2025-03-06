package main.java.com.example.code;

import java.util.*;

public class SynchronizedCollectionsExample {
    public static void main(String[] args) {
        // Synchronized List using Collections.synchronizedList()
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add("Apple");
        syncList.add("Banana");

        // Synchronized Set using Collections.synchronizedSet()
        Set<String> syncSet = Collections.synchronizedSet(new HashSet<>());
        syncSet.add("Red");
        syncSet.add("Blue");

        // Synchronized Map using Collections.synchronizedMap()
        Map<Integer, String> syncMap = Collections.synchronizedMap(new HashMap<>());
        syncMap.put(1, "Hello");
        syncMap.put(2, "World");

        // Printing the collections
        System.out.println("Synchronized List: " + syncList);
        System.out.println("Synchronized Set: " + syncSet);
        System.out.println("Synchronized Map: " + syncMap);

        // Important: To safely iterate over synchronized collections, use synchronized blocks.
        synchronized (syncList) {
            for (String item : syncList) {
                System.out.println("Iterating List: " + item);
            }
        }

        synchronized (syncSet) {
            for (String item : syncSet) {
                System.out.println("Iterating Set: " + item);
            }
        }

        synchronized (syncMap) {
            for (Map.Entry<Integer, String> entry : syncMap.entrySet()) {
                System.out.println("Iterating Map: " + entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}

