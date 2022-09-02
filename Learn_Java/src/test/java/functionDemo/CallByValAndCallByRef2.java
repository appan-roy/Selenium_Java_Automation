package functionDemo;

import java.io.IOException;

public class CallByValAndCallByRef2 {

	int a = 10, b = 20;

	public static void main(String[] args) throws IOException {

		CallByValAndCallByRef2 obj = new CallByValAndCallByRef2();
		System.out.println("Before swapping, a = " + obj.a + ", b = " + obj.b);

		// call by value
		obj.swap(obj.a, obj.b);

		// call by reference
		obj.swap(obj);

	}

	public void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping, a = " + x + ", b = " + y);
	}

	public void swap(CallByValAndCallByRef2 ref) {
		int temp = ref.a;
		ref.a = ref.b;
		ref.b = temp;
		System.out.println("After swapping, a = " + ref.a + ", b = " + ref.b);
	}

}
