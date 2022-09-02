package mathDemo;


public class MathClassOps {

	public static void main(String[] args) {
		
		//The Math.abs() function returns the absolute value of the parameter passed to it
		int abs1 = Math.abs(10);  // abs1 = 10
		System.out.println("Absolute Value: "+abs1);
		
		int abs2 = Math.abs(-20); // abs2 = 20
		System.out.println("Absolute Value: "+abs2);
		
		//The Math.ceil() function rounds a floating point value up to the nearest integer value
		double ceil = Math.ceil(7.343);  // ceil = 8.0
		System.out.println("Ceiling Value: "+ceil);
		
		//The Math.floor() function rounds a floating point value down to the nearest integer value
		double floor = Math.floor(7.343);  // floor = 7.0
		System.out.println("Floor Value: "+floor);
		
		//The Math.floorDiv() method divides one integer (int or long) by another, and rounds the result down to the nearest integer value
		double result3 = Math.floorDiv(-100,9);		//result3: -12.0
		System.out.println("result3: " + result3);

		double result4 = -100 / 9;		//result4: -11.0
		System.out.println("result4: " + result4);
		
		//The Math.min() method returns the smallest of two values passed to it as parameter
		int min = Math.min(10, 20);		//min = 10
		System.out.println("Min Value: "+min);
		
		//The Math.max() method returns the largest of two values passed to it as parameter
		int max = Math.max(10, 20);		//max = 20
		System.out.println("Max Value: "+max);
		
		//The Math.round() method rounds a float or double to the nearest integer using normal math round rules (either up or down)
		double roundedDown = Math.round(23.445);	//Value = 23.0
		System.out.println("Round Down Value: "+roundedDown);
		
		double roundedUp   = Math.round(23.545);	//Value = 24.0
		System.out.println("Round Up Value: "+roundedUp);
		
		//The Math.random() method returns a random floating point number between 0 and 1.
		double random1 = Math.random();
		System.out.println("Random Value: "+random1);
		
		//To get a random value between 0 and e.g. 100, multiply the value returned by Math.random() with the maximum number (e.g. 100)
		double random2 = Math.random() * 100D;
		System.out.println("Random Value: "+random2);
		
		//The Math.exp() function returns e (Euler's number) raised to the power of the value provided as parameter
		double exp1 = Math.exp(1);		//exp1 = 2.718281828459045
		System.out.println("exp1 = " + exp1);

		double exp2 = Math.exp(2);		//exp2 = 7.38905609893065
		System.out.println("exp2 = " + exp2);
		
		//The Math.log() method provides the logarithm of the given parameter
		double log1  = Math.log(1);		//log1 = 0.0
		System.out.println("log1 = " + log1);

		double log10 = Math.log(10);	//log10 = 2.302585092994046
		System.out.println("log10 = " + log10);
		
		//The Math.log10 method works like the Math.log() method except is uses 10 as is base for calculating the logarithm instead of e (Euler's Number)
		double log10_1   = Math.log10(1);		//log10_1 = 0.0
		System.out.println("log10_1 = " + log10_1);

		double log10_100 = Math.log10(100);		//log10_100 = 2.0
		System.out.println("log10_100 = " + log10_100);
		
		//The Math.pow() function takes two parameters. The method returns the value of the first parameter raised to the power of the second parameter
		double pow2 = Math.pow(2,2);	//pow2 = 4.0
		System.out.println("pow2 = " + pow2);

		double pow8 = Math.pow(2,8);	//pow8 = 256.0
		System.out.println("pow8 = " + pow8);
		
		//The Math.sqrt() method calculates the square root of the parameter given to it
		double sqrt4 = Math.sqrt(4);	//sqrt4 = 2.0
		System.out.println("sqrt4 = " + sqrt4);

		double sqrt9 = Math.sqrt(9);	//sqrt9 = 3.0
		System.out.println("sqrt9 = " + sqrt9);
		
		//The Math.sin() method calculates the sine value of some angle value in radians
		double sin = Math.sin(Math.PI/4);
		System.out.println("sin = " + sin);
		
		//The Math.cos() method calculates the cosine value of some angle value in radians
		double cos = Math.cos(Math.PI/4);
		System.out.println("cos = " + cos);
		
		//The Math.tan() method calculates the tangens value of some angle value in radians
		double tan = Math.tan(Math.PI/4);
		System.out.println("tan = " + tan);
		
		//The Math.toDegrees() method converts an angle in radians to degrees
		double degrees = Math.toDegrees(Math.PI);
		System.out.println("degrees = " + degrees);
		
		//The Math.toRadians() method converts an angle in degrees to radians
		double radians = Math.toRadians(180);
		System.out.println("radians = " + radians);
		
	}

}
