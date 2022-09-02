package interviewQnA;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 23;
		int counter = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				counter++;
				break;
			}
		}

		if (counter == 0)
			System.out.println("Prime");
		else
			System.out.println("Not a prime");

	}

}
