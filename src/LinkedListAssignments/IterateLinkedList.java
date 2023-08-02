package LinkedListAssignments;

import java.util.LinkedList;

public class IterateLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList with some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Iterate through all elements in the LinkedList
        System.out.println("Elements in the LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}

