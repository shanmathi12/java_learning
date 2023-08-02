package assignments;
import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        // Create an ArrayList with some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Search for an element
        String elementToSearch = "Blue";
        int index = colors.indexOf(elementToSearch);

        if (index != -1) {
            System.out.println("Element '" + elementToSearch + "' found at index: " + index);
        } else {
            System.out.println("Element '" + elementToSearch + "' not found in the ArrayList.");
        }
    }
}
