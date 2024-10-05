package mj;

import java.util.Scanner;
public class PositiveNegativeChecker {

	public static void mian(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		double number = sc.nextDouble();
		
		if(number>0) {
			
			System.out.println("enter number is positive ");
			
		}
		else if(number<0)
		{
			
			System.out.println("enter number is negative");
		}
	}
	
}
