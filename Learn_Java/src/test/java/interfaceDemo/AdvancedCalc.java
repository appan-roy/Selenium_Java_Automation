package interfaceDemo;

public class AdvancedCalc implements BasicCalc{

	public static void main(String[] args) {
		
		AdvancedCalc obj = new AdvancedCalc();
		
		obj.add(45, 57);
		
		obj.sub(67, 32);
		
		obj.mul(54, 8);
		
		obj.div(65, 5);
		
		obj.mod(8, 5);
		
	}
	
		public void add(int a, int b) {
		
		int sum = a + b;
		
		System.out.println("This is for addition and the result is "+sum);
		
	}

	public void sub(int a, int b) {
		
		int sub = a - b;
		
		System.out.println("This is for subtraction and the result is "+sub);
		
	}

	public void mul(int a, int b) {
		
		int mul = a * b;
		
		System.out.println("This is for multiplication and the result is "+mul);
		
	}

	public void div(int a, int b) {
		
		int div = a / b;
		
		System.out.println("This is for division and the result is "+div);
		
	}

	public void mod(int a, int b){
		
		int mod = a % b;
		
		System.out.println("This is for modulo and the result is "+mod);
		
	}
		
}
