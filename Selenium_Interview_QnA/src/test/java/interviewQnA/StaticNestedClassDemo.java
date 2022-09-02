package interviewQnA;

//Java program to demonstrate accessing
//a static nested class

//outer class
class OuterClass
{
	// static member
	static int outer_x = 10;
	
	// instance(non-static) member
	int outer_y = 20;
	
	// private member
	private static int outer_private = 30;
	
	// outer method
	void display() {
		System.out.println("outer_x = " + outer_x);
	}
	
	// static nested class
	static class StaticNestedClass
	{
		// no override
		void display()
		{
			// override outer_x var
			outer_x = 40;
			
			// can access static member of outer class
			System.out.println("outer_x = " + outer_x);
			
			// can access display private static member of outer class
			System.out.println("outer_private = " + outer_private);
			
			// The following statement will give compilation error
			// as static nested class cannot directly access non-static members
			// System.out.println("outer_y = " + outer_y);
		
		}
	}
}

//Driver class
public class StaticNestedClassDemo
{
	public static void main(String[] args)
	{
		// accessing the outer class
		OuterClass outerObject = new OuterClass();
		
		outerObject.display();
		
		// accessing a static nested class
		OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
		
		nestedObject.display();
		
	}
}

