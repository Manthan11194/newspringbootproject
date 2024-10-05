
 class A {
	int a; 
	
	String name;
	
	A()
	{
		a=0; name="manthan";
		
	}
	void show() {
		
		System.out.println(a+""+name);
	}
}
class B {
	
	public static void main(String args[]) {
		
		A obj = new A();
		obj.show();
	}
}
