package assignments;


import java.util.ArrayList;

public class IncreaseArrayListSize {
    public static void main(String[] args) {
        // Create an ArrayList with initial capacity
        int initialCapacity = 10;
        ArrayList<String> colors = new ArrayList<>(initialCapacity);

        // Add elements to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Print out the size of the ArrayList
        System.out.println("Initial ArrayList Size: " + colors.size());
    }
}

