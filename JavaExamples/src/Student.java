
public class Student {

	private String userName;
	private String password;

	public void setUserName(String user) {
		
	this.userName=user;
	}
	
	public void setpassword(String password) {
		
		this.password=password;
		}
	
	public String getUserName() {
		
		return userName;
	}
	
public String getPassword() {
		
		return password;
	}
	
	Student(){
		
		System.out.println("I am in Student Constructor");
		
	}
	
	Student(String x , String y){
			
	this.userName=x;
	this.password=y;
	
	}
	
	Student(int x){
		
		System.out.println("i am single");
	}
	
	Student(int x, int y){
		
		System.out.println("i am married");
	}
	
	
	void display() {
		
		System.out.println("In Display Method");
		System.out.println("UserName:"+ userName);
		System.out.println("password:"+ password);
	}
		
}


