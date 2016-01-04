package org.gft.learning.newdateapi;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author naho
 *
 * 1. Get a particular date
 * 2. Format output
 * 
 */
public class Exercise_1 {
	public static void main(String[] args) {
		oldAPI();		
		newAPI();
	}

	private static void oldAPI() {
		Date dateOfBirth = new Date(90, 7, 2);		
		System.out.println("Your Date of birth is : " + dateOfBirth);
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(1990, 7, 2);
		dateOfBirth = calendar.getTime();
		System.out.println("Your Date of birth is : " + dateOfBirth);
	}

	private static void newAPI() {
		// 1. Get a particular date
		LocalDate dateOfBirth = LocalDate.of(1990, 8, 2); 
		
		System.out.println("Your Date of birth is : " + dateOfBirth);	
		

	}
}