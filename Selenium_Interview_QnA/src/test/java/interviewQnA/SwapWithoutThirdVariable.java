package interviewQnA;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		
		// Using Strings
		String str1 = "UFT", str2 = "Selenium";
		
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println(str1);
		System.out.println(str2);
		
		// Using Numbers
		int num1 = 10, num2 = 20;
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println(num1);
		System.out.println(num2);

	}

}
