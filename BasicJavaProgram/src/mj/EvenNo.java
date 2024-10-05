 package mj;
import java.util.Scanner;

public class EvenNo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = obj.nextInt(); 
        
        for (int i = 1; i <= n; i++) {
        
            if (i % 2==0) {
                System.out.println(i);
            }
        }
        
    }
}


