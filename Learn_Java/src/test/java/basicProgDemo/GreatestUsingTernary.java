package basicProgDemo;

import java.util.Scanner;

public class GreatestUsingTernary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three integers : ");
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		if((a != b) && (b != c) && (c != a)) {
			
			int max = (a>b)?(a>c)?a:c:(b>c)?b:c;
			
			System.out.println("The greatest number is "+max);
			
		}else {
			
			System.out.println("Sorry !! You have entered same number. Please try again !!");
			
		}

		sc.close();

	}

}
