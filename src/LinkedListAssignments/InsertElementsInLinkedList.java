package LinkedListAssignments;

import java.util.LinkedList;

public class InsertElementsInLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Insert element at the first position
        linkedList.addFirst("First");
        System.out.println("LinkedList after inserting at the first position: " + linkedList);

        // Insert element at the last position
        linkedList.addLast("Last");
        System.out.println("LinkedList after inserting at the last position: " + linkedList);

        // Insert element at the front (same as adding at the first position)
        linkedList.offerFirst("Front");
        System.out.println("LinkedList after inserting at the front: " + linkedList);

        // Insert element at the end (same as adding at the last position)
        linkedList.offerLast("End");
        System.out.println("LinkedList after inserting at the end: " + linkedList);
    }
}

