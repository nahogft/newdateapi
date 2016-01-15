package org.gft.learning.newdateapi.solutions;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author naho
 *
 * Get a particular date
 * 
 */
public class Exercise_1 {
	public static void main(String[] args) {
		oldAPI();
		newAPI();
	}

	private static void oldAPI() {
		System.out.println("Old Date and Time API");
		Date dateOfBirth = new Date(90, 7, 2);
		System.out.println("Your Date of birth is : " + dateOfBirth);

		Calendar calendar = Calendar.getInstance();
		calendar.set(1990, 7, 2);
		dateOfBirth = calendar.getTime();
		System.out.println("Your Date of birth is : " + dateOfBirth);
	}

	private static void newAPI() {
		System.out.println("\nNew Date and Time API");
		LocalDate dateOfBirth = LocalDate.of(1990, 8, 2);

		System.out.println("Your Date of birth is : " + dateOfBirth);

	}
}
