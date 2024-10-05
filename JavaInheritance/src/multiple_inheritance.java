
import java.io.*;

interface A1 {

	final int a = 10;

	void display();
}

class multiple_inheritance implements A1 {

	public void display(){ 
	System.out.println("Manthan"); 
	}

	public static void main(String[] args)
	{
		multiple_inheritance m = new multiple_inheritance();
		m.display();
		System.out.println(a);
	}
}

