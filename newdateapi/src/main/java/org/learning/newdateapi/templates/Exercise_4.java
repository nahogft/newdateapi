package org.learning.newdateapi.templates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 
 * @author naho
 *
 * Format current date by means of the new Date API
 * 
 */
public class Exercise_4 {
	public static void main(String[] args) {
		oldAPI();
		newAPI();
	}

	private static void oldAPI() {
		System.out.println("Old Date and Time API");
		Date todayDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		String formattedTodayDate = formatter.format(todayDate);		
		System.out.println("Today is : " + formattedTodayDate);
		
		String todayDateTimeUKLocaleFormatted = new SimpleDateFormat("dd/MM/yyyy hh:mm", Locale.UK).format(todayDate);
		System.out.println("Today is (UK Locale): " + todayDateTimeUKLocaleFormatted);

	}

	// TODO
	private static void newAPI() {

	}
}
