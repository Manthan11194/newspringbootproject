package mj;

import java.util.Scanner;
public class SumOfDigits {
	
public static void main(String arg[]) {
	
	
	System.out.println("enter the number");
	Scanner sc= new Scanner(System.in);
	int number = sc.nextInt();
	
	int sum=0;
	while(number !=0) {
		
		int digit = number%10;
		sum+=digit;
		number/=10;
	}
	
	System.out.println("sum of the digits"+sum);
	 
}

}
