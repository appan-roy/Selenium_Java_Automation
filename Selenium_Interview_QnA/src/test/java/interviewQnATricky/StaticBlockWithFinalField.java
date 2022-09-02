package interviewQnATricky;

public class StaticBlockWithFinalField {

	public static void main(String[] args) {
		System.out.println(Main.x);		// the main class will not be loaded as x is final
		System.out.println(Main.y);		// the main class will be loaded and prints the static block before y
	}

}

class Main {
	public static final int x = 100;
	public static int y = 200;
	static {
		System.out.println("Static block of main class");
	}
}