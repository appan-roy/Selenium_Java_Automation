package numbersDemo;

import java.util.Scanner;

import utility.NumberUtils;

/*
 * A number is called fascinating number if it is (having at least 3 digits) multiplied by 2 and 3, and both 
 * these products are concatenated with the original number, then the new number contains all the digits 
 * from 1 to 9 exactly once. There could be any number of zeros and are ignored. Example:- Number = 192
 * Multiplying by 2 => 192 * 2 = 384, Multiplying by 3 => 192 * 3 = 576
 * Concatenation => “192” + “384” + “576” = 192384576, which contains all the digits from 1 to 9 exactly 
 * once. Hence, it is a fascinating number. Since 192 is a fascinating number so, 1902, 19002, 19000…0002, 
 * are also a fascinating number. Because number of 0 is ignored.
 */

public class FascinatingNum {

	public static void main(String[] args) {
		
		NumberUtils nu = new NumberUtils();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		int flag = 1, counter = 0;
		
		// check the number is fascinating number or not
		if(nu.numOfDigits(num) >= 3) {
			
			String strFasci = Integer.toString(num) + Integer.toString(num * 2) + Integer.toString(num * 3);
			
			long fasci = Long.parseLong(strFasci);
			
			for(int i = 1; i < 10; i++) {
				
				if(! nu.presenceOfDigit(fasci, i))
					counter++;
				
			}
			
		}else
			flag = 0;

		if(flag == 1 && counter == 0)
			System.out.println("The number " + num + " is a fascinating number");
		else
			System.out.println("The number " + num + " is not a fascinating number");
		
		sc.close();
		
	}

}
