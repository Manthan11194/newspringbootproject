
class Employee{
	void salary() {
		
	System.out.println("salary = 300000");	
	}
}
class programmer extends Employee{
	void bonus() {
		
		System.out.println("bonus = 400000");
		
	}
}

public class single_inheritance {

	public static void main(String args[]) {
		
		programmer p = new programmer();
		p.salary();
		p.bonus();
		
	}
	
}
