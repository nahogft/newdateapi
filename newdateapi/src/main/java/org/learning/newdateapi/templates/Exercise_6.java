package org.learning.newdateapi.templates;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * 
 * @author naho
 *
 * Interoperability with Legacy Code <br>
 * 6.1. Convert java.util.Date to java.time.LocalDate/LocalDateTime <br>
 * 6.2. Convert java.util.TimeZone to java.time.ZoneId <br>
 * 6.3. Convert java.util.Calendar to java.time.ZonedDateTime <br>
 * 
 */
public class Exercise_6 {
	public static void main(String[] args) {
		conversionOldDateToNewDate();
		conversionOldTimeZoneToNewZoneId();
		conversionOldCalendarToNewZonedDateTime();
	}

	private static void conversionOldDateToNewDate() {
		System.out.println("Conversion old to new Date");
		Date oldDate = new Date();

		// TODO: print new LocalDate

	}

	private static void conversionOldTimeZoneToNewZoneId() {
		System.out.println("\nConversion old TimeZone to new ZoneId");
		TimeZone oldTimeZone = java.util.TimeZone.getDefault();

		// TODO: print new ZoneId

	}

	private static void conversionOldCalendarToNewZonedDateTime() {
		System.out.println("\nConversion old Calendar to new ZonedDateTime");
		GregorianCalendar oldGregorianCalendar = new GregorianCalendar();
		
		// TODO: print new ZonedDateTime
	}

}
