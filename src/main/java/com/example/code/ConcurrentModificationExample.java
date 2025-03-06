package main.java.com.example.code;

import java.util.*;

public class ConcurrentModificationExample {
    public static void main(String[] args) {
        // Example that throws ConcurrentModificationException
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));

        try {
            for (String name : names) {
                if (name.equals("Bob")) {
                    // Modifying a list directly during iteration using a for-each loop
                    // triggers ConcurrentModificationException because the iterator detects
                    // a structural change in the collection.
                    names.remove(name); // This will cause ConcurrentModificationException
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Exception caught: " + e);
        }

        // Correct way to modify the list while iterating using Iterator
        List<String> safeNames = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));

        // Using an Iterator allows safe modification of the list while iterating
        Iterator<String> iterator = safeNames.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Bob")) {
                iterator.remove(); // Safe removal using Iterator
            }
        }
        System.out.println("List after safe removal: " + safeNames); // Output: [Alice, Charlie]
    }
}