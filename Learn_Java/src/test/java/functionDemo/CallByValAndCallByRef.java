package functionDemo;

public class CallByValAndCallByRef {

	int a = 17, b = 7;
	
	public static void main(String[] args) {
		
		CallByValAndCallByRef ref = new CallByValAndCallByRef();
		
		//call by value
		System.out.println("The sum is : "+ref.sum(ref.a, ref.b));
		
		//call by reference
		System.out.println("Before swapping a : "+ref.a+" and b: "+ref.b);
		ref.swap(ref);
		System.out.println("After swapping a : "+ref.a+" and b: "+ref.b);

	}

	public int sum(int x, int y) {
		return x+y;
	}
	
	public void swap(CallByValAndCallByRef r) {
		
		int temp = r.a;
		r.a = r.b;
		r.b = temp;
		
	}

}
