package recursionDemo;

public class ReverseNumber {

	public static void main(String[] args) {
		
		reverse(12345);
		reverse(001);
		reverse(300);
		reverse(1045);
		reverse(2360);

	}
	
	static void reverse(int x) {
		if(x >= 10) {
			System.out.print(x % 10);
			reverse(x/10);
		}else {
			System.out.println(x);
		}
	}

}
