package org12.seleniumUtilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static String getRequiredDateBasedOnNumberOfDays(String format,int numberOfDays) {
		 
		Calendar cal  = Calendar.getInstance();	    
	    cal.add(Calendar.DATE, numberOfDays);
	    SimpleDateFormat s = new SimpleDateFormat(format);
	    return s.format(new Date(cal.getTimeInMillis()));
	}
	public static String getRequiredDateBasedOnNumberOfMonths(String format,int numberOfMonths) {
		 
		Calendar cal  = Calendar.getInstance();	    
	    cal.add(Calendar.MONTH, numberOfMonths);
	    SimpleDateFormat s = new SimpleDateFormat(format);
	    return s.format(new Date(cal.getTimeInMillis()));
	}
	public static String getRequiredDateBasedOnNumberOfYears(String format,int numberOfYears) {
		 
		Calendar cal  = Calendar.getInstance();	    
	    cal.add(Calendar.YEAR, numberOfYears);
	    SimpleDateFormat s = new SimpleDateFormat(format);
	    return s.format(new Date(cal.getTimeInMillis()));
	}
}
