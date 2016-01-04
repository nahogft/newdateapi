package org.gft.learning.newdateapi;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author naho
 *
 * Calculate number of days between two dates new Java 8 old API
 * 
 */
public class Exercise_2 {

	public static void main(String[] args) {
		oldAPI();
		newAPI();

	}

	private static void oldAPI() {
		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		calendar.add(Calendar.DATE, -1);
		Date yesterday = calendar.getTime();

		long diffInMillies = today.getTime() - yesterday.getTime();
		long diffInDays = diffInMillies / (24 * 60 * 60 * 1000); // WTF!!!

		System.out.println(diffInDays);

	}

	private static void newAPI() {
		LocalDate today = LocalDate.now();
		LocalDate yesterday = today.minusDays(1);

		long days = Period.between(yesterday, today).getDays();

		System.out.println(days);
	}

}