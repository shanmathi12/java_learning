package assignments;
	
	import java.util.ArrayList;

	public class ColorArrayList {
	    public static void main(String[] args) {
	        // Create an ArrayList to store colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors to the ArrayList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Print out the collection
	        System.out.println("Colors in the collection:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	    }
	}



