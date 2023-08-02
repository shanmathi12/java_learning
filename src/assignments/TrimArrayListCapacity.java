package assignments;

import java.util.ArrayList;

public class TrimArrayListCapacity {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Trim the capacity of the ArrayList
        colors.trimToSize();

        // Print out the trimmed ArrayList
        System.out.println("Trimmed ArrayList Capacity: " + colors.size());
    }
}
