import java.util.Scanner;
public class swapwithoutvariable {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr A value");
		a=sc.nextInt();
		System.out.println("enetr B value");
		b=sc.nextInt();
		System.out.println("After Swapping value");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a:"+ a);
		System.out.println("b:"+ b); 

	}

}
