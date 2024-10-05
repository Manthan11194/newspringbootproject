 class Parent {
	 
	 void show() {
		 System.out.println("parent show()");
	 }
 }
 class child extends Parent{
	
	 void show() {
		 System.out.println("child Show()");
	 }
 }
 class Aoverriding{
	 public static void main(String args[]) {
		 Parent obj=new child();
		 obj.show();
		 
	 }
	

}
