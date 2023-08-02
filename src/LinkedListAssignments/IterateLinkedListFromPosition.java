package LinkedListAssignments;

import java.util.LinkedList;

public class IterateLinkedListFromPosition {
    public static void main(String[] args) {
        // Create a LinkedList with some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");
        linkedList.add("Grapes");

        // Specify the starting position
        int startPosition = 2;

        // Iterate through elements from the specified position
        System.out.println("Elements in the LinkedList from position " + startPosition + ":");
        for (int i = startPosition; i < linkedList.size(); i++) {
            String element = linkedList.get(i);
            System.out.println(element);
        }
    }
}

