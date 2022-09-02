package wrapperClassDemo;

public class BoxingUnboxing {

	public static void main(String[] args) {
		
		// The value of integer variable a which is 100 is assigned automatically to the Integer class b. This is known as Autoboxing.
		int a = 100;
		
		Integer b = a;
		
		System.out.println(b);
		
		
		// The value of integer variable x which is 90 is assigned to the Integer class y. This is known as Boxing.
		int x = 90;
		
		Integer y = Integer.valueOf(x);
		
		System.out.println(y);
		
		
		// The value of Integer class m which is 80 is assigned to an integer variable n. This is known as Unboxing.
		Integer m = 80;
		
		int n = m.intValue();
		
		System.out.println(n);
		
		
		// The value of Integer class p which is 70 is assigned automatically to an integer variable q. This is known as Auto-Unboxing.
		Integer p = 70;
		
		int q = p;
		
		System.out.println(q);
		
	}

}
