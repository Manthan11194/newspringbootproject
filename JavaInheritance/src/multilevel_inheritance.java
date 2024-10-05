
class shape{
	public void display() {
		System.out.println("inside display");
	}
}
class rectangle extends shape{
	void area() {
		System.out.println("inside arae");
		
	}
}
class cube extends rectangle{
	public void volume() {
		System.out.println("inside volume");
	}
}
public class multilevel_inheritance {
public static void main(String args[]) {
	cube c = new cube();
	c.display();
	c.area();
	c.volume();
}
}
