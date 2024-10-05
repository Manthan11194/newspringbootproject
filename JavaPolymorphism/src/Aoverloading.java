
public class Aoverloading {
	void add() {
		int a=10, b=20, c;
		c=a+b;
		System.out.println(c);
	}
	void add( int x, int y) {
		
		int c;
		c=x+y;
		System.out.println(c);
	}
	void add(int x, double y) {
		double c;
		c=x+y;
		System.out.println(c);
	}
	public static void main(String args[]) {
		
		Aoverloading obj=new Aoverloading();
		obj.add();
		obj.add(10,20);
		obj.add(20,30.1);
	}

}
