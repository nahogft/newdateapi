package org.gft.learning.newdateapi.templates;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author naho
 *
 * Get a particular date by means of the new Date API
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

	// TODO
	private static void newAPI() {		

	}
}
