package mj;

import java.util.Scanner;

public class RemoveVowelsString {
	
   public static void main(String[] args)
   {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter string");
         String str=sc.next();
         System.out.println("your remove vowels string");
         char arr[]=str.toCharArray();
         int n=arr.length;
         String res="";
         for(int i=0;i<n;i++)
         {
              if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U')
                   continue;
               else 
                    res=res+arr[i];
         }
        System.out.println(res);
  }
}

