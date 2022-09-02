package interviewQnA;

public class MaxMinNumInArray {

	public static void main(String[] args) {
		
		int[] myArr = {87, 34, 12, 44, 56, 29, 75, 63};
		int max = myArr[0], min = myArr[0];
		
		for(int i = 0; i < myArr.length; i++) {
			if(max < myArr[i]) max = myArr[i];
			if(min > myArr[i]) min = myArr[i];
		}

		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
		
	}

}
