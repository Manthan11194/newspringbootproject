import java.util.Scanner;
	public class primenocheck {
		public static void main(String []args) {
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Value of Number");
			n=sc.nextInt();
			
			if(n<=1) {
				System.out.println("Number is Not Prime");
			}
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					System.out.println("Number is Not Prime");
					break;
				}
				else {
					System.out.println("Number is Prime");
					break;
				}
				
			}
		}
	}
	


