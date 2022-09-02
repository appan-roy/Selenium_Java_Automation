package interviewQnA;

public class Armstrong {

	public static void main(String[] args) {
		
		int n = 407;	// 153, 370, 371, 407
		int temp = n;
		int sum = 0;
		
		while(temp != 0) {
			int rem = temp % 10;
			sum += (int)Math.pow(rem, 3);
			temp /= 10;
		}
		
		if(n == sum) System.out.println("Armstrong");
		else System.out.println("Not Armstrong");

	}

}
