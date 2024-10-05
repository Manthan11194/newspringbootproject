package mj;
import java.util.Scanner;
public class CountDigitalInNumber {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		long number = sc.nextLong();
		int count=0;
		long n=Math.abs(number);
		while(n>0) {
			
			n=n/10;
			count++;
		}
		System.out.println("number of digits"+count);
	}

}
