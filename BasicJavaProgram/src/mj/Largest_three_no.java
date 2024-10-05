package mj;
/*import java.util.*;
public class Largest_three_no {
	
	public static void main(String args[]) {
		
		int a, b, c, largest;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no A");
		a=sc.nextInt();
		System.out.println("enter a no A");
		b=sc.nextInt();
		System.out.println("enter a no A");
		c=sc.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println("largest no"+a);
		}
		if (b>=a && b>=c) {
			
			System.out.println("largest no"+b);
		}
		if(c>=a && c>=b) {
			
			System.out.println("largest no"+c);
		}
	}
}*/

// find largest number using user input 
import java.util.*;
class Largest_three_no{
	public static void main(String args[]) {
		
		int n, largest, num,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number of element");
		n=sc.nextInt();
		
		largest = Integer.MIN_VALUE;
        System.out.println("Enter numbers:");
        
        for(i=0;i<n;i++) {
        	
        	num=sc.nextInt();
        	if(num>largest) {
        		
        		largest=num;
        	}
        }
		
        System.out.println("the largest number is"+largest);
	}
}