package mj;

public class RemoveVowels {

		 
		static String RemVowel(String str) 
		{ 
			return str.replaceAll("[aeiouAEIOU]", ""); 
		} 
		
		// Driver Code 
		public static void main(String[] args) 
		{ 
			String str = "GeeeksforGeeks - A Computer Science Portal for Geeks";		 
			System.out.println(RemVowel(str)); 
		} 
	} 


