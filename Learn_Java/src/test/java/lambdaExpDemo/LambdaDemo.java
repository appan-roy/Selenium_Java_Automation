package lambdaExpDemo;

@FunctionalInterface
interface Cab {
	public void bookCab();
}

@FunctionalInterface
interface CabBook {
	public void bookCab(String src, String dest);
}

@FunctionalInterface
interface CabBooking {
	public String bookCab(String src, String dest);
}

public class LambdaDemo {

	public static void main(String[] args) {

		// 1st functional interface Cab
		Cab cab = () -> System.out.println("Cab is booked");
		cab.bookCab();

		// 2nd functional interface CabBook
		CabBook cabBook = (src, dest) -> System.out.println("Cab is booked from " + src + " to " + dest);
		cabBook.bookCab("Kolkata", "Howrah");

		// 3rd functional interface CabBooking
		CabBooking cabBooking = (src, dest) -> {
			System.out.print("Cab fare from " + src + " to " + dest + " is: ");
			return "Rs. 5000";
		};
		System.out.println(cabBooking.bookCab("Kolkata", "Howrah"));

	}

}
