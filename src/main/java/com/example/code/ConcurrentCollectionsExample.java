package main.java.com.example.code;

import java.util.concurrent.*;

public class ConcurrentCollectionsExample {
    public static void main(String[] args) {
        // CopyOnWriteArrayList allows multiple threads to read safely,
        // but writes (add/remove) create a new copy of the list.
        CopyOnWriteArrayList<String> concurrentList = new CopyOnWriteArrayList<>();
        concurrentList.add("A");
        concurrentList.add("B");

        // ConcurrentSkipListSet is a thread-safe set that is sorted.
        ConcurrentSkipListSet<String> concurrentSet = new ConcurrentSkipListSet<>();
        concurrentSet.add("X");
        concurrentSet.add("Y");

        // ConcurrentHashMap is a high-performance, thread-safe Map.
        ConcurrentHashMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(1, "One");
        concurrentMap.put(2, "Two");

        // Printing the collections
        System.out.println("Concurrent List: " + concurrentList);
        System.out.println("Concurrent Set: " + concurrentSet);
        System.out.println("Concurrent Map: " + concurrentMap);
    }
}

