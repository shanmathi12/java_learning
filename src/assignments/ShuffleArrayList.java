package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Shuffle the elements in the ArrayList
        Collections.shuffle(colors);

        // Print out the shuffled ArrayList
        System.out.println("Shuffled ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

