package interviewQnA;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 76239;
		
		int revNum = 0;
		
		while (num != 0) {
			int rem = num % 10;
			revNum = revNum * 10 + rem;
			num /= 10;
		}
		
		System.out.println("Reverse number : " + revNum);

	}

}
