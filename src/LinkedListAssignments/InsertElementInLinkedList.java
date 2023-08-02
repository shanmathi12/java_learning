package LinkedListAssignments;

import java.util.LinkedList;

public class InsertElementInLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList with some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Specify the element to insert and the position
        String elementToInsert = "Mango";
        int position = 1;

        // Insert the element at the specified position
        linkedList.add(position, elementToInsert);

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);
    }
}

