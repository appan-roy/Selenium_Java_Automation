package interviewQnA;

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
public class Fibonacci {

	public static void main(String[] args) {
		
		// Method 1
		int n = 2;
		int t1 = 1, t2 = 0, t3 = 0;
		
		System.out.print(0+"\t");
		for(int i = 1; i < n; i++) {
			t3 = t1 + t2;
			System.out.print(t3+"\t");
			t1 = t2;
			t2 = t3;
		}
		
		// Method 2
		System.out.println();
		for(int i = 0; i < n; i++)
			System.out.printf("%d\t", fibonacci(i));

	}
	
	public static int fibonacci(int x) {
		if(x == 0)
			return 0;
		else if(x == 1)
			return 1;
		else
			return (fibonacci(x-1) + fibonacci(x-2));
	}

}
