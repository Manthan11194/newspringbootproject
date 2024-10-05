package mj;
import java.util.Scanner;
public class AdditionofToNo {
	
public static void main(String args[]) {
	
  Scanner sc = new Scanner(System.in);
  System.out.println("enter a first no");
  int num1=sc.nextInt();
  System.out.println("enter a secount no");
  int num2=sc.nextInt();
  
  int sum=num1+num2;
  
  System.out.println("the addition of "+ num1+"and "+num2+"is:"+ sum);
  
  
	}
}


