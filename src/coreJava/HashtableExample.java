package coreJava;
	
	import java.util.Hashtable;

	public class HashtableExample {
	    public static void main(String[] args) {
	        // Create a new Hashtable
	        Hashtable<String, Integer> hashtable = new Hashtable<>();

	        // Add key-value pairs to the Hashtable
	        hashtable.put("John", 25);
	        hashtable.put("Alice", 30);
	        hashtable.put("Bob", 40);
	        hashtable.put("Sarah", 35);

	        // Retrieve values from the Hashtable
	        int johnAge = hashtable.get("John");
	        int aliceAge = hashtable.get("Alice");

	        System.out.println("John's age: " + johnAge);
	        System.out.println("Alice's age: " + aliceAge);

	        // Check if a key exists in the Hashtable
	        boolean isBobPresent = hashtable.containsKey("Bob");
	        System.out.println("Is Bob present? " + isBobPresent);

	        // Remove a key-value pair from the Hashtable
	        hashtable.remove("Sarah");

	        // Iterate over the keys in the Hashtable
	        System.out.println("Keys in the Hashtable:");
	        for (String key : hashtable.keySet()) {
	            System.out.println(key);
	        }

	        // Iterate over the values in the Hashtable
	        System.out.println("Values in the Hashtable:");
	        for (int value : hashtable.values()) {
	            System.out.println(value);
	        }

	        // Check if the Hashtable is empty
	        boolean isEmpty = hashtable.isEmpty();
	        System.out.println("Is Hashtable empty? " + isEmpty);

	        // Get the size of the Hashtable
	        int size = hashtable.size();
	        System.out.println("Size of the Hashtable: " + size);
	    }
	}



