import java.util.*;
public class arithmatic_mean {

	public static void main(String args[]) {
		
		int n , i, armean, sum=0;
		int arr[]=new int[50];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value want to enter");
		n=sc.nextInt();
		
		System.out.println("enter number");
		for(i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
			sum= sum+arr[i];
			
		}
		armean=sum/n;
		System.out.println("arethmatic mean:"+ armean);
				
	}
}
