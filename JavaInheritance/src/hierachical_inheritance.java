
class A{
	public void display() {
		System.out.println("inside display");
	}
}
class B extends A{
	void area() {
		System.out.println("inside arae");
		
	}
}
class C extends A{
	public void volume() {
		System.out.println("inside volume");
	}
}

public class hierachical_inheritance {
public static void main(String args[]) {
	B r = new B();
	C c = new C();
	
	r.display();
	r.area();
	
	c.display();
	c.volume();
	
}
}
