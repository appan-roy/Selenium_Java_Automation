package interviewQnATricky;

public class CheckValidPhoneCCNumber {

	public static void main(String[] args) {
		System.out.println(isCorrectPhoneNumber("1234567890"));
		System.out.println(isCorrectCCNumber("1234567890987652"));
	}
	
	public static boolean isCorrectPhoneNumber(String num) {
		return num.matches("[0-9]{10}");
	}
	
	public static boolean isCorrectCCNumber(String num) {
		return num.matches("\\d{16}");
	}

}
