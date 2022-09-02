package arrayOpsDemo;

import utility.ArrayUtils;

public class SearchLongestString {

	  public static void main(String[] args) {
	      
		  ArrayUtils au = new ArrayUtils();
		  
		  String[] arr = {"Cheese", "Pepperoni", "Black Olives"};
		  
	      String longestString = au.getLongestString(arr);
	      
	      System.out.format("Longest string: '%s'\n", longestString);
	      
	  }

}
