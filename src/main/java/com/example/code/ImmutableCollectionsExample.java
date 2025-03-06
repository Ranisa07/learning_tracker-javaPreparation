package main.java.com.example.code;

import java.util.*;

public class ImmutableCollectionsExample {
    public static void main(String[] args) {
        // Immutable List using List.of()
        List<String> immutableList = List.of("Apple", "Banana", "Cherry");

        // Immutable Set using Set.of()
        Set<String> immutableSet = Set.of("Red", "Green", "Blue");

        // Immutable Map using Map.of()
        Map<Integer, String> immutableMap = Map.of(
                1, "One",
                2, "Two",
                3, "Three"
        );

        // Printing the immutable collections
        System.out.println("Immutable List: " + immutableList);
        System.out.println("Immutable Set: " + immutableSet);
        System.out.println("Immutable Map: " + immutableMap);

        // Attempting to modify will throw an UnsupportedOperationException
        try {
            immutableList.add("Orange");  // Error: UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify immutable list");
        }

        try {
            immutableSet.remove("Red");  // Error: UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify immutable set");
        }

        try {
            immutableMap.put(4, "Four");  // Error: UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify immutable map");
        }
    }
}

