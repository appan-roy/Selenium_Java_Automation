package utility;

import java.util.ArrayList;

public class ConverterUtils extends NumberUtils {
	
	StringUtils su = new StringUtils();
	
	public long decimalToBinary(long dec) {
		
		int counter = 0;
		
		long binary = 0;
		
		while(dec > 0) {
			
			counter++;
			
			int rem = (int) (dec % 2);
			
			binary += (int) (rem * Math.pow(10, counter-1));
			
			dec /= 2;
			
		}
		
		return binary;
		
	}
	
	public int binaryToDecimal(long binary) {
		
		int digits = numOfDigits(binary);
		
		int decimal = 0;
		
		for(int i = 0; i < digits; i++) {
			
			int rem = (int) (binary % 10);
			
			decimal += rem * Math.pow(2, i);
			
			binary /= 10;
			
		}
		
		return decimal;
		
	}
	
	public int decimalToOctal(int decimal) {
		
		int counter = 0;
		
		int octal = 0;
		
		while(decimal > 0) {
			
			counter++;
			
			int rem = decimal % 8;
			
			octal += (int) (rem * Math.pow(10, counter-1));
			
			decimal /= 8;
			
		}
		
		return octal;
		
	}
	
	public int octalToDecimal(long octal) {
		
		int digits = numOfDigits(octal);
		
		int decimal = 0;
		
		for(int i = 0; i < digits; i++) {
			
			int rem = (int) (octal % 10);
			
			decimal += rem * Math.pow(8, i);
			
			octal /= 10;
			
		}
		
		return decimal;
		
	}
	
	public String decimalToHex(int decimal) {

		String hex = null;
		
		ArrayList<String> list = new ArrayList<String>();
		
		while(decimal > 0) {
			
			int rem = decimal % 16;
			
			if(rem == 10)
				list.add("A");
			else if(rem == 11)
				list.add("B");
			else if(rem == 12)
				list.add("C");
			else if(rem == 13)
				list.add("D");
			else if(rem == 14)
				list.add("E");
			else if(rem == 15)
				list.add("F");
			else
				list.add(Integer.toString(rem));
			
			decimal /= 16;
			
		}

		for(int i = 0; i < list.size(); i++)
			hex = String.join("", list);
		
		return su.reverseString(hex);
		
	}
	
	public int hexToDecimal(String hexadecimal) {

		int decimal = 0;
		
		String revHex = su.reverseString(hexadecimal);
		
		String revHexArr [] = revHex.split("");
		
		for(int i = 0; i < revHexArr.length; i++) {
			
			if(revHexArr[i].equals("A"))
				decimal += 10 * Math.pow(16, i);
			else if(revHexArr[i].equals("B"))
				decimal += 11 * Math.pow(16, i);
			else if(revHexArr[i].equals("C"))
				decimal += 12 * Math.pow(16, i);
			else if(revHexArr[i].equals("D"))
				decimal += 13 * Math.pow(16, i);
			else if(revHexArr[i].equals("E"))
				decimal += 14 * Math.pow(16, i);
			else if(revHexArr[i].equals("F"))
				decimal += 15 * Math.pow(16, i);
			else
				decimal += Integer.parseInt(revHexArr[i]) * Math.pow(16, i);
			
		}
		
		return decimal;
		
	}
	
	public String hexToBinary(String hex) {
		
		String hexArr [] = hex.split("");
		
		ArrayList<String> binList = new ArrayList<String>();
		
		String binary = null;
		
		for(int i = 0; i < hexArr.length; i++) {
			
			if(hexArr[i].equals("0"))
				binList.add("0000");
			else if(hexArr[i].equals("1"))
				binList.add("0001");
			else if(hexArr[i].equals("2"))
				binList.add("0010");
			else if(hexArr[i].equals("3"))
				binList.add("0011");
			else if(hexArr[i].equals("4"))
				binList.add("0100");
			else if(hexArr[i].equals("5"))
				binList.add("0101");
			else if(hexArr[i].equals("6"))
				binList.add("0110");
			else if(hexArr[i].equals("7"))
				binList.add("0111");
			else if(hexArr[i].equals("8"))
				binList.add("1000");
			else if(hexArr[i].equals("9"))
				binList.add("1001");
			else if(hexArr[i].equals("A"))
				binList.add("1010");
			else if(hexArr[i].equals("C"))
				binList.add("1100");
			else if(hexArr[i].equals("D"))
				binList.add("1101");
			else if(hexArr[i].equals("E"))
				binList.add("1110");
			else if(hexArr[i].equals("F"))
				binList.add("1111");
			else if(hexArr[i].equals("F"))
				binList.add("1111");

		}
		
		for(int i = 0; i < binList.size(); i++) {
			binary = String.join("", binList);
		}
		
		return binary;
		
	}
	
}
