package polymorphismDemo;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.add(20, 30);
		
		obj.add(30, 56, 345);
		
		obj.add(7, 90, 2f, 645.98);
		
		obj.add(86, 546, 7.89, 7f);
		
	}
	
	// The number of arguments are 2 //
	
	public void add(int a, int b){
		
		int s = a + b;
		System.out.println("The sum is "+s);
		
	}
	
	// The number of arguments are 3 //
	
	public void add(int a, int b, int c){
		
		int s = a + b + c;
		System.out.println("The sum is "+s);
		
	}
	
	// The number of arguments are 4 with different argument types //	
	
	public void add(int a, int b, float c, double d){
		
		double s = a + b + c + d;
		System.out.println("The sum is "+s);
		
	}
	
	// The number of arguments are 4 with different argument types with different orders of arguments from the previous one //
	
	public void add(int a, int b, double c, float d){
		
		double s = a + b + c + d;
		System.out.println("The sum is "+s);
		
	}
	
}
