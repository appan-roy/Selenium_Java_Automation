package snippets;

public class CodeSnippet6 {
	
	static int a = 10;
	int b = 20;
	
	public static void main(String[] args) throws Throwable {

		System.out.println(CodeSnippet6.a);
		System.out.println(CodeSnippet6.Hello.a);
		
		CodeSnippet6 cs6 = new CodeSnippet6();
		System.out.println(cs6.b);
		
		CodeSnippet6.Hello hello = new CodeSnippet6.Hello();
		System.out.println(hello.b);
		
		Hello h = new Hello();
		System.out.println(h.a);
		System.out.println(h.b);

	}
	
	static class Hello {
		
		static int a = 15;
		int b = 25;
		
		public static void main(String[] args) {
			
			System.out.println(a);
			
			Hello hello = new Hello();
			System.out.println(hello.b);
			
		}
		
	}

}
