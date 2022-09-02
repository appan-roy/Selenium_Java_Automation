package classDemo;

public class FirstClassDemo {
	
	int x=10;
	int y=20;
	
	public static void main(String[] args) {
		
		//Creating new class object//
		
		FirstClassDemo obj1 = new FirstClassDemo();
		
		obj1.sum();
		
		System.out.println("The value of x is "+obj1.x);
		
		System.out.println("The value of y is "+obj1.y);

	}
	
	
	public void sum(){
		
		int a=90;
		int b=30;
		int c=a+b;
		
		System.out.println("The sum is "+c);
	}
}
