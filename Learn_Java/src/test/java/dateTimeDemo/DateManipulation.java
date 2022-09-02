package dateTimeDemo;

import utility.DateUtils;

public class DateManipulation {

	public static void main(String[] args) {
        
        DateUtils du = new DateUtils();
        
        String currDate = "14/02/2021";
        
        String twoDaysLater = du.manipulateDate(currDate, "+", 2, 0, 0, 0);
        String threeWeeksLater = du.manipulateDate(currDate, "+", 0, 3, 0, 0);
        String fourMonthsLater = du.manipulateDate(currDate, "+", 0, 0, 4, 0);
        String oneYearLater = du.manipulateDate(currDate, "+", 0, 0, 0, 1);
        
		System.out.println(twoDaysLater);
		System.out.println(threeWeeksLater);
		System.out.println(fourMonthsLater);
		System.out.println(oneYearLater);
		
		String twoDaysEarlier = du.manipulateDate(currDate, "-", 2, 0, 0, 0);
        String threeWeeksEarlier = du.manipulateDate(currDate, "-", 0, 3, 0, 0);
        String fourMonthsEarlier = du.manipulateDate(currDate, "-", 0, 0, 4, 0);
        String oneYearEarlier = du.manipulateDate(currDate, "-", 0, 0, 0, 1);
        
		System.out.println(twoDaysEarlier);
		System.out.println(threeWeeksEarlier);
		System.out.println(fourMonthsEarlier);
		System.out.println(oneYearEarlier);
        
	}

}
