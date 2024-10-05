/*
import java.util.Arrays; 

public class MaxElement {
	
	public static void main(String[] args){ 
		int arr[] = {10, 324, 45, 90, 9808}; 
		
		// Java Stream and max to find the max element
		// in array
		int max = Arrays.stream(arr).max().getAsInt(); 
	
		System.out.println("Largest in given array is " +max); 
	} 

} */
// Java Program to Find the Largest
// Element in the array using sort function
import java.io.*;
import java.util.*;

// Driver Class
class MaxElement {
	// main function
	public static void main(String[] args)
	{
		int arr[] = { 12, 45, 67, 89, 100, 23,
					3456, 897, 452, 444, 899, 700 };
		
		// Sorting function using
		// Sort function
		Arrays.sort(arr);
	
		// Printing the Result
		System.out.println(
			"Largest number from given array: "
			+ arr[arr.length - 1]);
	}
}


