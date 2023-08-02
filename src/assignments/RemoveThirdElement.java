package assignments;

import java.util.ArrayList;

public class RemoveThirdElement {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Remove the third element
        int index = 2; // Index of the element to remove

        if (index >= 0 && index < colors.size()) {
            String removedElement = colors.remove(index);
            System.out.println("Removed element at index " + index + ": " + removedElement);
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
