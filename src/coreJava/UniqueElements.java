package coreJava;
	
		import java.util.ArrayList;
		import java.util.Collections;
		import java.util.HashMap;
		import java.util.List;
		import java.util.Map;

		public class UniqueElements {
		    public static void main(String[] args) {
		        List<Integer> numbers = new ArrayList<>();
		        numbers.add(20);
		        numbers.add(40);
		        numbers.add(50);
		        numbers.add(40);
		        numbers.add(70);
		        numbers.add(70);
		        numbers.add(10);
		        numbers.add(15);

		        List<Integer> uniqueElements = findUniqueElements(numbers);
		        List<Integer> repetitiveElements = findRepetitiveElements(numbers);

		        System.out.println("Unique elements: " + uniqueElements);
		        System.out.println("Repetitive elements: " + repetitiveElements);
		    }

		    public static <T> List<T> findUniqueElements(List<T> list) {
		        Map<T, Integer> elementCountMap = new HashMap<>();

		        for (T element : list) {
		            elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
		        }

		        List<T> uniqueElements = new ArrayList<>();
		        for (Map.Entry<T, Integer> entry : elementCountMap.entrySet()) {
		            if (entry.getValue() == 1) {
		                uniqueElements.add(entry.getKey());
		            }
		        }

		        return uniqueElements;
		    }

		    public static <T> List<T> findRepetitiveElements(List<T> list) {
		        Map<T, Integer> elementCountMap = new HashMap<>();

		        for (T element : list) {
		            elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
		        }

		        List<T> repetitiveElements = new ArrayList<>();
		        for (Map.Entry<T, Integer> entry : elementCountMap.entrySet()) {
		            if (entry.getValue() > 1) {
		                repetitiveElements.add(entry.getKey());
		            }
		        }

		        return repetitiveElements;
		    }
	

	}
	   