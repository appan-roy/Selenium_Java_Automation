package interviewQnA;

public class FullFormToShortForm {

	public static void main(String[] args) {
		
		String str = "First In First Out";
		String shortForm = "";
		
		String[] arr = str.split(" ");
		
		for (String string : arr) {
			shortForm += string.charAt(0);
		}
		
		System.out.println(shortForm);

	}

}
