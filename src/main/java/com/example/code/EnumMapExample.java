package main.java.com.example.code;

import java.util.EnumMap;
import java.util.Map;

// Define an Enum for Employee Roles
enum Role {
    DEVELOPER, MANAGER, TESTER, HR
}

public class EnumMapExample {
    public static void main(String[] args) {
        // Creating an EnumMap with Role as the key and String as the value
        EnumMap<Role, String> roleMap = new EnumMap<>(Role.class);

        // Adding key-value pairs
        roleMap.put(Role.DEVELOPER, "John");
        roleMap.put(Role.MANAGER, "Alice");
        roleMap.put(Role.TESTER, "Bob");
        roleMap.put(Role.HR, "Sophia");

        // Printing EnumMap contents
        System.out.println("EnumMap contents:");
        for (Map.Entry<Role, String> entry : roleMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
