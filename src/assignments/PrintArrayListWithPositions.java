package assignments;

import java.util.ArrayList;

public class PrintArrayListWithPositions {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Print all elements with their positions
        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < colors.size(); i++) {
            String element = colors.get(i);
            System.out.println("Position " + (i + 1) + ": " + element);
        }
    }
}

