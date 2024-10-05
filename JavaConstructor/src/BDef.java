 
class A1 {
	 int a; String b; boolean c;
	
	 A1()
	 {
		 a=100; b="Manthan"; c=true;
	 }
	 void display() 
	 {
		 System.out.println(a+" "+b+" "+c);
	 }
 }
class BDef {
	public static void main(String args[]) {
	
		A1 obj=new A1();
		obj.display();
		
	}
	
}
