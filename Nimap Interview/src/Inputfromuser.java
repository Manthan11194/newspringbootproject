import java.util.Scanner;
public class Inputfromuser {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a name ");
		String name = s.next();
		System.out.println("enter a gender");
		char gen =s.next().charAt(0);
		System.out.println("enter a age");
		int age=s.nextInt();
		System.out.println("enter a phone no");
		long phono=s.nextLong();
		System.out.println("the name is:"+ name);
		System.out.println( "the gender is:"+ gen);	
		System.out.println( "the age is:"+ age);
		System.out.println( "the phone no is:" + phono);
	}

}
