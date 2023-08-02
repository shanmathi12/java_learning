package assignments;

	import java.util.ArrayList;

	public class IterateArrayList {
	    public static void main(String[] args) {
	        // Create an ArrayList with some elements
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);

	        // Iterate through all elements in the ArrayList
	        System.out.println("Elements in the ArrayList:");
	        for (int i = 0; i < numbers.size(); i++) {
	            int element = numbers.get(i);
	            System.out.println(element);
	        }
	    }
	}


