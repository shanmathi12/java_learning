package assignments;

import java.util.ArrayList;

public class EmptyArrayList {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Empty the ArrayList
        colors.clear();

        // Print out the empty ArrayList
        System.out.println("Empty ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

