package assignments;

import java.util.ArrayList;

public class ExtractArrayListPortion {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Extract a portion of the ArrayList
        int fromIndex = 1; // Starting index (inclusive)
        int toIndex = 4; // Ending index (exclusive)
        ArrayList<String> extractedColors = new ArrayList<>(colors.subList(fromIndex, toIndex));

        // Print out the extracted portion of the ArrayList
        System.out.println("Extracted ArrayList Portion:");
        for (String color : extractedColors) {
            System.out.println(color);
        }
    }
}

