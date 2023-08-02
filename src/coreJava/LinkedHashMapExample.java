package coreJava;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a new LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add key-value pairs to the LinkedHashMap
        linkedHashMap.put("John", 25);
        linkedHashMap.put("Alice", 30);
        linkedHashMap.put("Bob", 40);
        linkedHashMap.put("Sarah", 35);

        // Retrieve values from the LinkedHashMap
        int johnAge = linkedHashMap.get("John");
        int aliceAge = linkedHashMap.get("Alice");

        System.out.println("John's age: " + johnAge);
        System.out.println("Alice's age: " + aliceAge);

        // Iterate over the key-value pairs in the LinkedHashMap
        System.out.println("Key-Value pairs in the LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Check if a key exists in the LinkedHashMap
        boolean isBobPresent = linkedHashMap.containsKey("Bob");
        System.out.println("Is Bob present? " + isBobPresent);

        // Remove a key-value pair from the LinkedHashMap
        linkedHashMap.remove("Sarah");

        // Check the size of the LinkedHashMap
        int size = linkedHashMap.size();
        System.out.println("Size of the LinkedHashMap: " + size);
    }
}

