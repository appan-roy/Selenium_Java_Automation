package stringDemo;

public class StringOperations {

	public static void main(String[] args) {

		//Starts With
		String str1 = "Hello World";
		boolean status1 = str1.startsWith("Hello");
		System.out.println("The status is "+status1);	//true
		
		//Ends With
		String str2 = "Java World";
		boolean status2 = str2.endsWith("Java");
		System.out.println("The status is "+status2);	//false
		
		//Equals
		boolean status3 = str1.equals(str2);
		System.out.println("The status is "+status3);	//false
		
		//Equals Ignore Case
		String str3 = new String("hElLo WoRld");	//creating java string by new keyword
		boolean status4 = str1.equalsIgnoreCase(str3);
		System.out.println("The status is "+status4);	//true
		
		//Char At & Index Of
		char ch[]={'s','t','r','i','n','g','s'};
		String str4 = new String(ch);	//converting char array to string
		System.out.println("The 5th character of the string "+str4+" is : "+str4.charAt(5));	//g
		System.out.println("The index of s is "+str4.indexOf('s'));		//0 - first occurence
		
		//Trim
		String str5 = "   Appan   Roy      ";
		System.out.println(str5.trim());	//Appan   Roy
		
		//Length
		String str6 = "UEFA Champions League";
		System.out.println("The length of the string is "+str6.length());	//21
		
		//Compare To
		String str7 = "RockStar";
		System.out.println("Compare To 'ROCKSTAR': " + str7.compareTo("rockstar"));		//-32
		
		//Compare To - Case Ignored
		String str8 = "PopStar";
		System.out.println("Compare To 'POPSTAR' - Case Ignored: " + str8.compareToIgnoreCase("POPSTAR"));	//0
		
		//Contains
		String str9 = "Automation Testing";
		System.out.println("Contains sequence 'Test' : "+str9.contains("Test"));	//true
		
		//Replace
		String str10 = "FIFA World Cup";
		System.out.println("Replace 'FIFA' with 'ICC' : "+str10.replace("FIFA", "ICC"));	//ICC World Cup
		
		//Replace All & Replace First
		String str11 = "hello hello hello";
		System.out.println("Replace 'FIFA' with 'ICC' : "+str11.replaceAll("hello", "hi"));	//hi hi hi
		System.out.println("Replace 'FIFA' with 'ICC' : "+str11.replaceFirst("hello", "hi"));	//hi hello hello
		
		//To Uppercase & Lowercase
		String str12 = "heLlo WOrlD";
		System.out.println("The uppercase is : "+str12.toUpperCase());	//HELLO WORLD
		System.out.println("The lowercase is : "+str12.toLowerCase());	//hello world

	}

}
