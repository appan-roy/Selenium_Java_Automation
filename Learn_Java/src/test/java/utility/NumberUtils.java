package utility;

public class NumberUtils {

	public boolean isEven(int number) {
		
		if(number % 2 == 0)
			return true;
		else
			return false;
		
	}
	
	public int squareOfNum(int number) {
		
		return number * number;
		
	}
	
	public int cubeOfNum(int number) {

		return number * number * number;
		
	}
	
	public int sumOfDigits(int number) {
		
		int sum = 0;
		
		while(number > 0) {
			
			int rem = number % 10;
			
			sum += rem;
			
			number /= 10;
			
		}
		
		return sum;
		
	}
	
	public int sumOfEvenDigits(int number) {
		
		int sum = 0;
		
		while(number > 0) {
			
			int rem = number % 10;
			
			if(rem % 2 == 0)
				sum += rem;
			
			number /= 10;
			
		}
		
		return sum;
		
	}
	
	public int sumOfOddDigits(int number) {
		
		int sum = 0;
		
		while(number > 0) {
			
			int rem = number % 10;
			
			if(rem % 2 != 0)
				sum += rem;
			
			number /= 10;
			
		}
		
		return sum;
		
	}
	
	public int productOfDigits(int number) {
		
		int product = 1;
		
		while(number > 0) {
			
			int rem = number % 10;
			
			product *= rem;
			
			number /= 10;
			
		}
		
		return product;
		
	}
	
	public int reverseNumber(int number) {
		
		int reversed = 0;

        while(number != 0) {
            
        	int rem = number % 10;
            
        	reversed = reversed * 10 + rem;
            
        	number /= 10;
        	
        }

		return reversed;
		
	}
	
	public int sumOfSquareOfDigits(int number) {
		
		int sum = 0;

        while(number != 0) {
            
        	int rem = number % 10;
            
        	sum += squareOfNum(rem);
            
        	number /= 10;
        	
        }

		return sum;
		
	}
	
	public int sumOfCubeOfDigits(int number) {
		
		int sum = 0;

        while(number != 0) {
            
        	int rem = number % 10;
            
        	sum += cubeOfNum(rem);
            
        	number /= 10;
        	
        }

		return sum;
		
	}
	
	public boolean isPrime(int number) {
		
		boolean flag = true;
		
		if (number == 1) {
			
			flag = false;
			
		} else {
			
			for(int i = 2; i <= number/2; ++i){
	            
				// condition for non-prime number
	            if(number % i == 0){
	                
	            	flag = false;
	                
	            	break;
	                
	            }
	            
	        }
			
		}

		return flag;
		
	}
	
	public boolean isPerfectSquare(int number) {
	
		boolean flag = false;
		
		int x = (int) Math.sqrt(number);
        
		double y = Math.sqrt(number);
        
        if(x == y) {
        	
        	flag = true;
        	
        }
        
		return flag;
		
	}
	
	public boolean isPerfectCube(int number) {
		
		boolean flag = false;
		
		int x = (int) Math.cbrt(number);
        double y = Math.cbrt(number);
        
        if(x == y) {
        	
        	flag = true;
        	
        }
        
		return flag;
		
	}
	
	public boolean isPalindrome(int number) {
		
		if(reverseNumber(number) == number)
			return true;
		else
			return false;
		
	}
	
	public int hcfOfTwoNumbers(int number1, int number2) {
		
		int hcf = 1;
		
		for(int i = 1; i <= number1 && i <= number2; ++i){
            // Checks if i is factor of both integers
            if(number1 % i==0 && number2 % i==0)
                hcf = i;
        }
		
		return hcf;
		
	}
	
	public int lcmOfTwoNumbers(int number1, int number2) {
		
		int hcf = 1;
		
		for(int i = 1; i <= number1 && i <= number2; ++i){
            // Checks if i is factor of both integers
            if(number1 % i==0 && number2 % i==0)
                hcf = i;
        }
		
		int lcm = (number1 * number2) / hcf;
		
		return lcm;
		
	}
	
	public void showAllFactors(int number) {
		
		System.out.println("The factors of " + number + " are : ");
		
		for(int i = 1; i <= number; i++) {

			if(number % i == 0)
				System.out.print(i + "\t");
			
		}
		
		System.out.println();
		
	}
	
	public void showPrimeFactors(int number) {
		
		System.out.println("The prime factors of " + number + " are : ");
		
		for(int i = 1; i <= number; i++) {

			if(isPrime(i)) {
				
				if(number % i == 0)
					System.out.print(i + "\t");
				
			}
			
		}
		
		System.out.println();
		
	}
	
	public void showPrimeFactorisation(int number) {

		System.out.println("The prime factorization of " + number + " are : ");
		
		for(int i = 2; i <= number; i++) {
			
			while(number % i == 0) {
				System.out.print(i + "\t");
				number /= i;
			}
			
		}
		
		System.out.println();
		
	}
	
	public int sumOfAllFactors(int number) {
		
		int sum = 0;
		
		for(int i = 1; i <= number; i++) {
			
			if(number % i == 0)
				sum += i;
			
		}
		
		return sum;
		
	}
	
	public int sumOfPrimeFactors(int number) {
		
		int sum = 0;
		
		for(int i = 1; i <= number; i++) {
			
			if(isPrime(i)) {
				
				if(number % i == 0)
					sum += i;
				
			}
			
		}
		
		return sum;
		
	}
	
	public int sumOfPrimeFactorisation(int number) {
		
		int sum = 0;
		
		for(int i = 2; i <= number; i++) {
			
			while(number % i == 0) {
				sum += i;
				number /= i;
			}
			
		}

		return sum;
		
	}
	
	public int numOfDigits(long number) {
		
		int count = 0;
		
		while(number != 0) {
			
			number /= 10;
			
			count++;
			
		}
		
		return count;
		
	}
	
	public boolean presenceOfDigit(long number, int digit) {
		
		int flag = 0;
		
		String strDigit = Integer.toString(digit);
		
		String strNum = Long.toString(number);
		
		String numArr [] = strNum.split("");
		
		for(int i = 0; i < numArr.length; i++) {
			
			if(numArr[i].equals(strDigit)) {
				flag = 1;
				break;
			}
			
		}
		
		if(flag == 1)
			return true;
		else
			return false;
		
	}
	
	public int numOfOccurenceOfDigit(long number, int digit) {
		
		int count = 0;
		
		String strDigit = Integer.toString(digit);
		
		String strNum = Long.toString(number);
		
		String numArr [] = strNum.split("");
		
		for(int i = 0; i < numArr.length; i++) {
			
			if(numArr[i].equals(strDigit))
				count++;
			
		}
		
		return count;
		
	}
	
	// Recursive function factorial
	public long factorial(int number) {
		
		if(number == 0)
			return 1;
		else
			return (number * factorial(number-1));
		
	}
	
	public int sumOfFactorialOfDigits(int number) {
		
		int sum = 0;

        while(number != 0) {
            
        	int rem = number % 10;
            
        	sum += factorial(rem);
            
        	number /= 10;
        	
        }

		return sum;
		
	}
	
	public boolean isDuck(int number) {
		
		String strNum = Integer.toString(number);
		
		int counter = 0;
		
		for(int i = 0; i < strNum.length(); i++) {
			
			if(strNum.charAt(i) == '0')
				counter++;
			
		}
		
		if(strNum.charAt(0) != '0' && counter > 0)
			return true;
		else
			return false;
		
	}
	
	public boolean isUnique(int number) {
		
		int flag = 1;
		
		String strNum = Integer.toString(number);
		
		String numArr [] = strNum.split("");
		
		for(int i = 0; i < numArr.length-1; i++) {
			
			for(int j = i+1; j < numArr.length; j++) {
				
				if(numArr[i].equals(numArr[j])) {
					flag = 0;
					break;
				}else
					continue;
				
			}
			
		}
		
		if(flag == 1)
			return true;
		else
			return false;
		
	}
	
	public boolean isSmith(int number) {
		
		int sum = 0;
		
		int temp = number;
		
		for(int i = 2; i <= temp; i++) {
			
			while(temp % i == 0) {
				
				sum += sumOfDigits(i);
				temp /= i;
				
			}
			
		}

		if(sum == sumOfDigits(number) && (! isPrime(number)))
			return true;
		else
			return false;
		
	}
	
	public int shiftLeft(int number) {
		
		int digits = numOfDigits(number);
		
		int rem = (int) (number % Math.pow(10, digits-1));
		int quotient = (int) (number / Math.pow(10, digits-1));
		
		int product = rem * 10 + quotient;
		
		return product;

	}
	
	public int shiftRight(int number) {
		
		int digits = numOfDigits(number);
		
		int rem = number % 10;
		int quotient = number / 10;
		
		int product = (int) (rem * Math.pow(10, digits-1) + quotient);
		
		return product;

	}
	
}
