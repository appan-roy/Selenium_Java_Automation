package parameterizationDemo;

public class ParametersPassing {

	public static void main(String[] args) {
		
		ParametersPassing obj1 = new ParametersPassing();
		
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
