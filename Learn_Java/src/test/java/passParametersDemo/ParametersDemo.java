package passParametersDemo;

public class ParametersDemo {

	public static void main(String[] args) {
		
		ParametersDemo obj1 = new ParametersDemo();
		
		obj1.add(55, 563);
		
		obj1.sub(98.04, 35.65);
	}
	
	public void add(int a, int b){
		
		int c = a+b;
		System.out.println(c);
	}
	
	public void sub(double x, double y){
		
		double z = x-y;
		System.out.println(z);
	}
}
