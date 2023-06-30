package codekata;

public class sortByFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arr[] = { 4, 4, 5, 6, 4, 2, 2, 8, 5 };
		  
	    // Size of array arr[]
	    int n = arr.length;
	  
	    // Function call to get cnt
	    int cnt = sortByFreq(arr, n);
	  
	    // Sort the arr[] in decreasing order
	    Arrays.sort(arr, Collections.reverseOrder());
	  
	    // Function that prints elements
	    // in decreasing order
	    printSortedArray(arr, cnt);
	  
	  
	
	  

	


