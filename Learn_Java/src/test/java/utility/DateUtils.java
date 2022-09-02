package utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

	public String manipulateDate(String date, String plusMinusIndicator, int days, int weeks, int months, int years) {

		// split date with / from the format 14/02/2021
		String dateArr [] = date.split("/");
        
		// change the format of the date in string as 2021-02-14
        String beforeDate = dateArr[2] + "-" + dateArr[1] + "-" + dateArr[0];
        
        // parse the date to local date format
        LocalDate oldDate = LocalDate.parse(beforeDate);
        
        // define the output format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // declare after date variable
        String afterDate = null;
        
        // operation whether plus or minus needed and store it to after date
        if(plusMinusIndicator.equalsIgnoreCase("Plus") || plusMinusIndicator.equals("+"))
        	afterDate = formatter.format(oldDate.plusDays(days).plusWeeks(weeks).plusMonths(months).plusYears(years));
        else if(plusMinusIndicator.equalsIgnoreCase("Minus") || plusMinusIndicator.equals("-"))
        	afterDate = formatter.format(oldDate.minusDays(days).minusWeeks(weeks).minusMonths(months).minusYears(years));
        
		return afterDate;

	}
	
}
