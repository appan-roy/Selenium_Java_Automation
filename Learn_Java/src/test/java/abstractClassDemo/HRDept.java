package abstractClassDemo;

public class HRDept extends ITDept{

	public static void main(String args[]) {
		
		//Scenario 1 - Child class reference with Child class object
		
		HRDept hr = new HRDept();
		
		hr.goodies();
		
		hr.work();
		
		hr.salary();
		
		hr.bonus();
		
		
		//Scenario 2 - Base class reference with Child class object
		
		ITDept it = new HRDept();
		
		it.goodies();
		
		it.work();
		
		it.salary();
		
	}

	
	public void salary() {
		
		System.out.println("The salary is 4 LPA");
		
	}

	public void bonus() {
		
		System.out.println("The bonus is 1 LPA");
		
	}
	
}
