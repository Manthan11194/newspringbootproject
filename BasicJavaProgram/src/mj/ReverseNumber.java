package mj;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		int number = sc.nextInt();
		int rev=0;
		
		while(number!=0) {
			rev =number%10;
			rev=rev*10+rev;
			number/=10;
			
			
		}
		System.out.println(rev);
	}
	
	

}
