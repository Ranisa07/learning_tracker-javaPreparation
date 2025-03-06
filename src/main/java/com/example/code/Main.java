package main.java.com.example.code;

import java.util.*;

class EmployeeAsKey {
    private int id;
    private String name;

    // Constructor to initialize Employee objects
    public EmployeeAsKey(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Overriding equals() to compare two Employee objects based on their id and name.
     * If two Employee objects have the same id and name, they are considered equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if both references point to the same object
        if (obj == null || getClass() != obj.getClass()) return false; // Check if obj is of type Employee
        EmployeeAsKey employee = (EmployeeAsKey) obj;
        return id == employee.id && Objects.equals(name, employee.name); // Compare id and name values
    }

    /**
     * Overriding hashCode() to generate a unique hash code based on id and name.
     * This ensures that equal objects have the same hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // Overriding toString() to print Employee details in a readable format
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        // Using Employee in a HashSet
        Set<EmployeeAsKey> employeeSet = new HashSet<>();
        EmployeeAsKey e1 = new EmployeeAsKey(101, "John");
        EmployeeAsKey e2 = new EmployeeAsKey(102, "Alice");
        EmployeeAsKey e3 = new EmployeeAsKey(101, "John"); // Duplicate of e1 based on id and name

        // Adding employees to HashSet
        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3); // This will not be added because it's equal to e1

        System.out.println("HashSet contents:");
        for (EmployeeAsKey e : employeeSet) {
            System.out.println(e);
        }
        // Output will have only 2 employees, as e1 and e3 are considered duplicates

        // Using Employee as a key in HashMap
        Map<EmployeeAsKey, String> employeeMap = new HashMap<>();
        employeeMap.put(e1, "Software Engineer");
        employeeMap.put(e2, "Manager");
        employeeMap.put(e3, "Senior Software Engineer"); // Updates value of e1 because e1.equals(e3) is true

        System.out.println("\nHashMap contents:");
        for (Map.Entry<EmployeeAsKey, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        // Only 2 keys will be in the map since e1 and e3 are equal (e3 updates e1's value)
    }
}

