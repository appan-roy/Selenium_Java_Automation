package snippets;

public class CodeSnippet5 extends BaseClass {
	
	String str = "Derived Class";
	
	public CodeSnippet5() {
		super();
		System.out.println(super.showSq(5));
		System.out.println(this.showSq(7));
	}
	
	public long showSq(int n) {
		return (long) Math.pow(n, 2);
	}

	public static void main(String[] args) {
		new CodeSnippet5();
	}

}

class BaseClass {
	
	String str = "Base Class";
	
	public long showSq(int n) {
		return n * n;
	}
	
}