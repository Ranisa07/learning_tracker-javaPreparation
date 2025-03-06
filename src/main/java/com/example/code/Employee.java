package main.java.com.example.code;

import java.util.Objects;

class Employee {
    private int id;
    private String name;

    // Constructor to initialize Employee objects
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Overriding equals() to compare two Employee objects based on their id and name.
     * Without this override, equals() would check reference equality (default behavior).
     */
    @Override
    public boolean equals(Object obj) {
        // Check if both references point to the same object
        if (this == obj) return true;

        // If obj is null or belongs to a different class, return false
        if (obj == null || getClass() != obj.getClass()) return false;

        // Typecast obj to Employee and compare id and name
        Employee employee = (Employee) obj;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    /**
     * Overriding hashCode() to generate a unique hash code based on id and name.
     * This ensures that objects that are equal (according to equals()) have the same hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // Overriding toString() for better readability when printing Employee objects
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
    public static void main(String[] args) {
        // Creating two Employee objects with the same id and name
        Employee e1 = new Employee(101, "John");
        Employee e2 = new Employee(101, "John");

        // Checking equality of objects
        System.out.println(e1.equals(e2)); // Output: true (since id and name are the same)

        // Checking hash codes of objects
        System.out.println(e1.hashCode()); // e.g., 123456
        System.out.println(e2.hashCode()); // Same hash code as e1

        // Confirming that equal objects have the same hash code
        System.out.println(e1.hashCode() == e2.hashCode()); // Output: true
    }
}
