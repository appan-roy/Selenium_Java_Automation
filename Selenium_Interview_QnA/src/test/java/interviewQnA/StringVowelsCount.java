package interviewQnA;

public class StringVowelsCount {

	public static void main(String[] args) {
		
		String str = "palindrome";
		
		int counter = 0;
		
		for(char ch : str.toCharArray()) {
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' 
					|| ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				counter++;
			}
		}
		
		System.out.println("Vowels count : " + counter);

	}

}
