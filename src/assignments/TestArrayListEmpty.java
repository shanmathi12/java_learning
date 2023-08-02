package assignments;

import java.util.ArrayList;

public class TestArrayListEmpty {
    public static void main(String[] args) {
        // Create an empty ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Test whether the ArrayList is empty or not
        boolean isEmpty = colors.isEmpty();

        // Print the result
        if (isEmpty) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}

