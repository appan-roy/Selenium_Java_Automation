package snippets;

public class CodeSnippet1 {

	public static void main(String[] args) {
		
		// 1. predict the output
		System.out.println(args.length);
		//System.out.println(args[0]);
		
		// 2. predict the output
		String str1 = "Java", str2 = "Java";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		// 3. predict the output
		str2 = "Python";
		System.out.println(str1 = str2);

	}

}
