package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList {
    public static void main(String[] args) {
        // Create the source ArrayList
        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("Apple");
        sourceList.add("Banana");
        sourceList.add("Orange");

        // Create the destination ArrayList
        ArrayList<String> destinationList = new ArrayList<>();

        // Copy the elements from sourceList to destinationList
        Collections.copy(destinationList, sourceList);

        // Print out the destination ArrayList
        System.out.println("Destination ArrayList:");
        for (String element : destinationList) {
            System.out.println(element);
        }
    }
}

