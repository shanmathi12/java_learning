package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(10);

        // Sort the ArrayList
        Collections.sort(numbers);

        // Print out the sorted ArrayList
        System.out.println("Sorted ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

