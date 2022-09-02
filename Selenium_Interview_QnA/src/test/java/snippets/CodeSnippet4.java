package snippets;

public class CodeSnippet4 extends Super {
	
	String str = "Sub Class";
	
	public CodeSnippet4() {
		super();
		System.out.println("I am in " + super.str);
		System.out.println("I am in " + this.str);
	}
	
	public long showSq(int n) {
		return (long) Math.pow(n, 2);
	}

	public static void main(String[] args) {
		new CodeSnippet4();
	}

}

class Super {
	
	String str = "Super Class";
	
	public Super() {
		System.out.println("I am in " + this.str);
	}
	
	public long showSq(int n) {
		return n * n;
	}
	
}