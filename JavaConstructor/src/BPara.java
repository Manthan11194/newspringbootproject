
 class A2 {
	 int x,y;
	 
	 A2(int a, int b){
		 
		x=a; y=b; 
	 }
	 void show() {
		 System.out.println(x+" "+y);
	 }
}

 class BPara{
	 public static void main(String args[]) {
		 
		 A2 obj = new A2(100,200);
		 obj.show();
	 }
 }