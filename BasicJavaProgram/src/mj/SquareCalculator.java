package mj;
import java.util.Scanner;

public class SquareCalculator {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num =sc.nextInt();
		int Sqr =num*num;
		System.out.println("the square of number\n"+Sqr);
		
	}
	
	

}
