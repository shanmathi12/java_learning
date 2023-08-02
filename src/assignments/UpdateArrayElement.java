package assignments;

import java.util.ArrayList;

public class UpdateArrayElement {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Update an element with a given element
        int index = 2; // Index of the element to update
        String newElement = "Purple"; // New element to replace the existing element

        if (index >= 0 && index < colors.size()) {
            colors.set(index, newElement);
            System.out.println("Updated element at index " + index + ": " + newElement);
        } else {
            System.out.println("Invalid index specified.");
        }

        // Print out the updated ArrayList
        System.out.println("Elements in the ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
