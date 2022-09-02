package interviewQnATricky;

import java.util.stream.IntStream;

public class PrintOneToHundredWithoutLoop {

	public static void main(String[] args) {
		
		/*
		 * Print 1 to 100 without using any loops
		 */
		
		// Method 1
		printNumInRange(1, 100);
		System.out.println();
		
		// Method 2
		IntStream.range(1, 101).forEach(e -> System.out.print(e+","));

	}
	
	static void printNumInRange(int startNum, int endNum) {
		if(startNum <= endNum) {
			System.out.print(startNum+",");
			startNum++;
			printNumInRange(startNum, endNum);
		}
	}

}
