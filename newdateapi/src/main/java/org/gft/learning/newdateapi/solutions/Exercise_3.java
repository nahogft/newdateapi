package org.gft.learning.newdateapi.solutions;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

/**
 * 
 * @author naho
 *
 * Calculate the second Saturday of current month by means of the new Date API
 * 
 */
public class Exercise_3 {
	public static void main(String[] args) {
		oldAPI();
		newAPI();
	}

	private static void oldAPI() {
		System.out.println("Old Date and Time API");
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		calendar.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2);

		System.out.println(calendar.getTime());
	}

	private static void newAPI() {
		System.out.println("\nNew Date and Time API");
		LocalDate today = LocalDate.now();
		LocalDate secondSaturdayOfThisMonth = today.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SATURDAY));

		System.out.println(secondSaturdayOfThisMonth);
	}

}
