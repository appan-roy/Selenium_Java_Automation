package inheritanceDemo;

public class ChildClass1 extends BaseClass{

	//This is an example of level 1 inheritance//
	
	public static void main(String[] args) {
	
		ChildClass1 child1 = new ChildClass1();
		
		child1.add(56, 78);
		
		child1.sub(34, 65);
		
		child1.mul(45, 7);
		
		child1.div(46, 20);

	}
	
	public void mul(int a, int b){
		
		int mul = a * b;
		
		System.out.println("The sum is "+mul);
		
	}
	
	public void div(int a, int b){
		
		int div = a / b;
		
		System.out.println("The sum is "+div);
		
	}
}
