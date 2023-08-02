package assignments;

import java.util.ArrayList;

public class InsertFirstPosition {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Insert an element at the first position
        fruits.add(0, "Mango");

        // Print out the updated ArrayList
        System.out.println("Elements in the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

