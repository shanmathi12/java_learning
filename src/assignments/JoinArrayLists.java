package assignments;

import java.util.ArrayList;
import java.util.List;

public class JoinArrayLists {
    public static void main(String[] args) {
        // Create the first ArrayList
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        // Create the second ArrayList
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Mango");
        list2.add("Pineapple");
        list2.add("Grapes");

        // Join the ArrayLists
        ArrayList<String> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);

        // Print out the joined ArrayList
        System.out.println("Joined ArrayList:");
        for (String element : joinedList) {
            System.out.println(element);
        }
    }
}

