package encapsulationDemo;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		//set the emp details
		emp.setName("Appan");
		emp.setId(111111);
		emp.setPhoneNo(98765432);
		
		//get the emp details
		System.out.println("The employee name is : "+emp.getName());
		System.out.println("The employee id is : "+emp.getId());
		System.out.println("The employee phone number is : "+emp.getPhoneNo());

	}

}
