package interviewQnA;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num = 13531;
		int temp = num;
		
		int revNum = 0;
		
		while (temp != 0) {
			int rem = temp % 10;
			revNum = revNum * 10 + rem;
			temp /= 10;
		}
		
		if(revNum == num) System.out.println("Palindrome");
		else System.out.println("Not palindrome");

	}

}
