package assignments;

import java.util.ArrayList;

public class ReplaceSecondElement {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Replace the second element with a specified element
        int index = 1; // Index of the second element
        String specifiedElement = "Purple"; // Specified element to replace

        if (index >= 0 && index < colors.size()) {
            colors.set(index, specifiedElement);
            System.out.println("Replaced the second element with: " + specifiedElement);
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

