package stringDemo;

public class StringDemo {

	public static void main(String[] args) {
		
		String str1 = "Hello World";
		
		String str2 = "Java World";
		
		boolean status1 = str1.startsWith("Hello");
		
		System.out.println("The status is "+status1);
		
		boolean status2 = str2.endsWith("Java");
		
		System.out.println("The status is "+status2);
		
		boolean status3 = str1.equals(str2);
		
		System.out.println("The status is "+status3);
		
		String str3 = "hElLo WoRld";
		
		boolean status4 = str1.equalsIgnoreCase(str3);
		
		System.out.println("The status is "+status4);
		
		System.out.println(str3.charAt(7));
	}

}
