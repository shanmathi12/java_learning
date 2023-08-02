package LinkedListAssignments;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseIterateLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList with some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");
        linkedList.add("Grapes");

        // Get a ListIterator to iterate in reverse order
        ListIterator<String> iterator = linkedList.listIterator(linkedList.size());

        // Iterate through the LinkedList in reverse order
        System.out.println("Elements in the LinkedList (in reverse order):");
        while (iterator.hasPrevious()) {
            String element = iterator.previous();
            System.out.println(element);
        }
    }
}

