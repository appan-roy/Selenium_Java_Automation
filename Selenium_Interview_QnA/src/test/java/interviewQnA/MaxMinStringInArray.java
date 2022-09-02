package interviewQnA;

public class MaxMinStringInArray {

	public static void main(String[] args) {
		
		String[] myArr = {"Appan", "Singha", "Roy"};
		String max = myArr[0], min = myArr[0];
		
		for(int i = 0; i < myArr.length; i++) {
			if(max.length() < myArr[i].length()) max = myArr[i];
			if(min.length() > myArr[i].length()) min = myArr[i];
		}
		
		System.out.println("Longest string : " + max);
		System.out.println("Shortest string : " + min);

	}

}
