package mj;
/*import java.util.*;
public class Swapnumber {

	public static void main(String args[]) {
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value in a");
		a=sc.nextInt();
		System.out.println("enter a value of b");
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("the swap value is:" +a);
		System.out.println("the swap value is:" +b);
	}
}*/

//swap value without using third variable

import java.util.Scanner;
class Swapnumber{
	public static void main(String args[]) {
		
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a a value");
	a=sc.nextInt();
	System.out.println("enter a value b");
	b=sc.nextInt();
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println(a);
	System.out.println(b);
	}
}

