package Static_Var;

public class Student {
	 
		   int rollno;
		   String name;  
		   static String college ="jspm";//static variable  
		   //constructor  
		   Student(int r, String n)
		   {  
		   rollno = r;  
		   name = n;  
		   }  
		   //method to display the values  
		   void display ()
		   {
			   System.out.println(rollno+" "+name+" "+college);
		   }    
	 
		 public static void main(String args[])
		 {  
		 Student s1 = new Student(111,"Manthan");  
		 Student s2 = new Student(222,"Ram");  
		 
		 s1.display();  
		 s2.display();  
		 }  
	}  


