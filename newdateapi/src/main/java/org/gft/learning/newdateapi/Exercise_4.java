package org.gft.learning.newdateapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * 
 * @author naho
 *
 *         Format current date
 * 
 */
public class Exercise_4 {
	public static void main(String[] args) {
		oldAPI();
		newAPI();
	}

	private static void oldAPI() {

	}

	private static void newAPI() {
		LocalDateTime todayDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		String formattedTodayDateTime = formatter.format(todayDateTime);
		System.out.println("Today is : " + formattedTodayDateTime);

		String todayDateTimeUKLocaleFormatted = formatter.withLocale(Locale.UK).format(todayDateTime);
		System.out.println("Today is : " + todayDateTimeUKLocaleFormatted);

	}
}
