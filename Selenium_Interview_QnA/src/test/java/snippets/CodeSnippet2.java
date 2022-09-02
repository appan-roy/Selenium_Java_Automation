package snippets;

public class CodeSnippet2 extends Parent {

	public CodeSnippet2() {
		System.out.println("No arg constructor of child");
	}
	
	public CodeSnippet2(String s) {
		super(s);
		System.out.println("Calling arg constructor of child");
	}
	
	public static void main(String[] args) {
		new CodeSnippet2("Java");
		new CodeSnippet2();
	}

}

class Parent {
	
	String str;
	
	Parent(){
		this("");
		System.out.println("No arg constructor of parent");
	}
	
	Parent(String s){
		this.str = s;
		System.out.println("Calling arg constructor of parent");
	}
	
}
