package interviewQnA;

public class ShiftZerosToRight {

	public static void main(String[] args) {
		
		int[] arr = {9, 0, 3, 7, 0, 0, 1, 4, 0, 2};
		int[] newArr = new int[arr.length];
		int counter = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				newArr[counter] = arr[i];
				counter++;
			}

		}
		
		for (int i : newArr) {
			System.out.print(i+",");
		}

	}

}
