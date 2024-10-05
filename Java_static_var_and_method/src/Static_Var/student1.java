package Static_Var;

class student1{  
    int rollno;  
    String name;  
    static String college = "Jspm";  
    //static method to change the value of static variable  
    static void change(){  
    college = "APOCER";  
    }  
    //constructor to initialize the variable  
    student1(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display values  
    void display()
    {
    	System.out.println(rollno+" "+name+" "+college);
    }  
 

 
   public static void main(String args[]){  
   student1.change();//calling change method  //A static method can be invoked without the need for creating an instance of a class.
   											   //A static method can access static data member and can change the value of it.
   											   //A static method belongs to the class rather than the object of a class.
   //creating objects  
   student1 s1 = new student1(111,"Manthan");  
   student1 s2 = new student1(222,"Ram");  
   student1 s3 = new student1(333,"Sham");  
   //calling display method  
   s1.display();  
   s2.display();  
   s3.display();  
   }  
}  