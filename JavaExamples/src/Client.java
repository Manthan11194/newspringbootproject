
public class Client {

	public static void main(String args[]) {
		
	Student student = new Student();
	
	student.setUserName("manthan123");
	student.setpassword("Manthan@123");
	
	
	String userName="";
			userName=student.getUserName();
	System.out.println(userName);
	String password=student.getPassword();
	System.out.println(password);
	
	
	//student.display();
	
	/*Test test = new Test();
	test.display();
	
	int sum=test.add(10 , 20);
	
	System.out.println("sum="+sum);
	String s=test.show("manthan", 12);
	System.out.println("String="+s);
	*/
	
	
	
	/*student.userName="User123";
	student.password="MJ@123";
	student.display();*/
	
	
	}
}
