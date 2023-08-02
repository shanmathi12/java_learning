package coreJava;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a new TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put("John", 25);
        treeMap.put("Alice", 30);
        treeMap.put("Bob", 40);
        treeMap.put("Sarah", 35);

        // Retrieve values from the TreeMap
        int johnAge = treeMap.get("John");
        int aliceAge = treeMap.get("Alice");

        System.out.println("John's age: " + johnAge);
        System.out.println("Alice's age: " + aliceAge);

        // Iterate over the key-value pairs in the TreeMap
        System.out.println("Key-Value pairs in the TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Check if a key exists in the TreeMap
        boolean isBobPresent = treeMap.containsKey("Bob");
        System.out.println("Is Bob present? " + isBobPresent);

        // Remove a key-value pair from the TreeMap
        treeMap.remove("Sarah");

        // Check the size of the TreeMap
        int size = treeMap.size();
        System.out.println("Size of the TreeMap: " + size);

        // Get the first and last keys in the TreeMap
        String firstKey = treeMap.firstKey();
        String lastKey = treeMap.lastKey();

        System.out.println("First key: " + firstKey);
        System.out.println("Last key: " + lastKey);
    }
}

