import java.util.Scanner;
public class swapuseveriable {

	public static void main(String[] args) {
		int a,b,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr A first value");
		a=sc.nextInt();
		System.out.println("enetr B second value");
		b=sc.nextInt();
		System.out.println("after a swapping");
		 t=a;
		 a=b;
		 b=t;
		 System.out.println("the value of A:"+ a); 
		 System.out.println("the value of B:"+ b); 

	}

}
