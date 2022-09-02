package snippets;

public class CodeSnippet3 {

	public CodeSnippet3() {
		this(5);
		System.out.println("Default constructor");
	}
	
	public CodeSnippet3(int x) {
		this(7.5);
		System.out.println(x);
	}
	
	public CodeSnippet3(double y) {
		this("Java");
		System.out.println(y);
	}
	
	public CodeSnippet3(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		new CodeSnippet3();
	}

}
