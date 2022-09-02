package thisKeywordDemo;

public class MyVar {

	int x;
	
	int y;
	
	public MyVar(int x, int y) {
		
		this.x = x;
		
		this.y = y;
		
	}
	
	public void sum() {
		
		int sum = x + y;
		
		System.out.println("The sum is " + sum);
		
	}
	
	public static void main(String[] args) {
		
		MyVar obj = new MyVar(25, 50);
		
		obj.sum();

	}

}
