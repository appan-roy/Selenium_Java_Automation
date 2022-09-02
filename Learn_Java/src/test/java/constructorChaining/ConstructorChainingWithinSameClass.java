package constructorChaining;

public class ConstructorChainingWithinSameClass {

	// default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    ConstructorChainingWithinSameClass()
    {
        // calls constructor 2
        this(5);
        System.out.println("The default constructor");
    }
  
    // parameterized constructor 2
    ConstructorChainingWithinSameClass(int x)
    {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }
  
    // parameterized constructor 3
    ConstructorChainingWithinSameClass(int x, int y)
    {
        System.out.println(x * y);
    }
    
	public static void main(String[] args) {
		
		// invokes default constructor first
        new ConstructorChainingWithinSameClass();

	}

}
