import java.util.Scanner;
public class palindromecheck {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int no=s.nextInt();
		int temp=no, rev=0, rem;
		
		while(temp!= 0)
		{
			
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if (no==rev)
		{
			
			System.out.println(no + "is the palindrome");
		}else
		{
			System.out.println(no + "is  not a palindrome ");
		}

	}

}