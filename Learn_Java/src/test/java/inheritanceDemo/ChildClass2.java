package inheritanceDemo;

public class ChildClass2 extends ChildClass1{
	
	//This is an example of level 2 inheritance//
	
	public static void main(String[] args) {
		
		ChildClass2 child2 = new ChildClass2();
		
		child2.add(4, 67);
		
		child2.sub(45, 41);
		
		child2.mul(5, 8);
		
		child2.div(56, 3);
		
		child2.mod(456, 7);

	}
	
	public void mod(int a, int b){
		
		int mod = a % b;
		
		System.out.println("The mod is "+mod);
		
	}
}
