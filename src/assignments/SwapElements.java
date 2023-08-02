package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Swap two elements in the ArrayList
        int index1 = 1; // Index of the first element to swap
        int index2 = 3; // Index of the second element to swap

        if (index1 >= 0 && index1 < colors.size() && index2 >= 0 && index2 < colors.size()) {
            Collections.swap(colors, index1, index2);
            System.out.println("Swapped elements at index " + index1 + " and " + index2);
        } else {
            System.out.println("Invalid indices specified.");
        }

        // Print out the updated ArrayList
        System.out.println("Elements in the ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

