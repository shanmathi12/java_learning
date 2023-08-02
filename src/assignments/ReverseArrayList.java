package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Reverse the elements in the ArrayList
        Collections.reverse(colors);

        // Print out the reversed ArrayList
        System.out.println("Reversed ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
