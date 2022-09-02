package constructorChaining;

public class Child extends Parent {

	// constructor 3
    Child()
    {
        System.out.println("No-argument constructor of child");
    }
  
    // parameterized constructor 4
    Child(String name)
    {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized constructor of child");
    }
	
}
