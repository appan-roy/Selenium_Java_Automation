package passParametersDemo;

public class ParametersDemo2 {

	public static void main(String[] args) {
		
		DynamicCalculator obj1 = new DynamicCalculator();
		
		int add = obj1.add(55, 563);
		
		System.out.println("The sum is "+add);
		
		double sub = obj1.sub(987.54, 543.27);
		
		System.out.println("The sub is "+sub);
		
		String full_name = DynamicCalculator.getMyFullName("Appan", "Roy");
		
		System.out.println("The full name is "+full_name);
		
	}
	
}
