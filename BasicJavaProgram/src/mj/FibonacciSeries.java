
//using Do while loop
/*package mj;
import java.util.*;
public class FibonacciSeries {
	
	public static void main(String args[]) {
		
		int a=1, b=1, n, fibon=1;	
		Scanner sc =new Scanner(System.in);
		System.out.println("enter value u want:");
		n=sc.nextInt();
		System.out.println(fibon);
		while(n>1) {
			System.out.println(" "+fibon);
			fibon=a+b;
			a=b;
			b=fibon;
			n--;
			
		}
		System.out.println("");
	}
}

//using for loop user input method 
package mj;
import java.util.*;
class FibonacciSeries{
	public static void main(String args[])   
		
		int i, numterm, firstterm=0, secondterm=1, nextterm;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of terms in Fibonacci series: ");
		numterm=sc.nextInt();
		
		for(i=1;i<=numterm;i++) {
			
			System.out.println(firstterm+" ");
			nextterm = firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
		}
	}
}*/
//using without user input method 

package mj;
class FibonacciSeries {
    
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
      
        for (int i = 0; i < N; i++) {
            
            System.out.print(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
    public static void main(String args[])
    {
        int N = 5;
        
        Fibonacci(N);
    }
}


