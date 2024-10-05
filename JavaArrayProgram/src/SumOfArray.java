/*
 TYPE 1
 
// Java Program to find sum of elements in a given array
class SumOfArray {
	static int arr[] = { 12, 3, 4, 15 };

	// method for sum of elements in an array
	static int sum()
	{
		int sum = 0; // initialize sum
		int i;

		// Iterate through all elements and add them to sum
		for (i = 0; i < arr.length; i++)
			sum += arr[i];

		return sum;
	}

	// Driver method
	public static void main(String[] args)
	{
		System.out.println("Sum of given array is "
						+ sum());
	}
}*/


 //# TYPE 2
 
/* One Line Solution 
One Line solution using Java inbuilt method 
import java.util.Arrays is an important statement
Syntax
Arrays.stream(arrayName).sum();  */

import java.util.Arrays;
// import Arrays class to use inbuilt sum() method
import java.io.*;

class SumOfArray {
	public static void main (String[] args) {
		int [] nums = {1,2,3,4,5};
		int sum = Arrays.stream(nums).sum();
		System.out.println(sum);
	}
}


