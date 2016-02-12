package org.learning.newdateapi.templates;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author naho
 *
 * Calculate number of days between two dates by means of the new Date API
 * 
 */
public class Exercise_2 {

	public static void main(String[] args) {
		oldAPI();
		newAPI();

	}

	private static void oldAPI() {
		System.out.println("Old Date and Time API");
		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		calendar.add(Calendar.DATE, -1);
		Date yesterday = calendar.getTime();

		long diffInMillies = today.getTime() - yesterday.getTime();
		long diffInDays = diffInMillies / (24 * 60 * 60 * 1000); // WTF!!!

		System.out.println(diffInDays);

	}

	// TODO
	private static void newAPI() {
		
	}

}
