package LinkedListAssignments;

import java.util.LinkedList;

public class AppendElementToLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Append an element to the end of the LinkedList
        String element = "Hello";
        linkedList.addLast(element);

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);
    }
}

