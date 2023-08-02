package assignments;

import java.util.ArrayList;

public class CloneArrayList {
    public static void main(String[] args) {
        // Create the source ArrayList
        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("Apple");
        sourceList.add("Banana");
        sourceList.add("Orange");

        // Clone the source ArrayList to a new ArrayList
        ArrayList<String> clonedList = (ArrayList<String>) sourceList.clone();

        // Print out the cloned ArrayList
        System.out.println("Cloned ArrayList:");
        for (String element : clonedList) {
            System.out.println(element);
        }
    }
}


