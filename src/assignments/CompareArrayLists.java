package assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareArrayLists {
    public static void main(String[] args) {
        // Create the first ArrayList
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Create the second ArrayList
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Compare the ArrayLists
        boolean isEqual = list1.equals(list2);

        // Print the result
        System.out.println("Are the ArrayLists equal? " + isEqual);
    }
}

