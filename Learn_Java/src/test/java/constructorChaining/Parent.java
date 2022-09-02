package constructorChaining;

public class Parent {
	String name;

	// constructor 1
	Parent()
    {
        this("");
        System.out.println("No-argument constructor of base");
    }

	// constructor 2
	Parent(String name)
    {
        this.name = name;
        System.out.println("Calling parameterized constructor of base");
    }
	
}
