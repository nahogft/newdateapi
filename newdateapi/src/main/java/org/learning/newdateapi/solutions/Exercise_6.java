package org.learning.newdateapi.solutions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
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
		
		LocalDate newDate = LocalDateTime.ofInstant(oldDate.toInstant(), ZoneId.systemDefault()).toLocalDate();

		System.out.println("Old Date: " + oldDate);
		System.out.println("New Date: " + newDate);

	}

	private static void conversionOldTimeZoneToNewZoneId() {
		System.out.println("\nConversion old TimeZone to new ZoneId");
		TimeZone oldTimeZone = java.util.TimeZone.getDefault();
		
		ZoneId newZoneId = oldTimeZone.toZoneId();
		
		System.out.println("Old TimeZone: " + oldTimeZone);
		System.out.println("New ZoneId: " + newZoneId);

	}

	private static void conversionOldCalendarToNewZonedDateTime() {
		System.out.println("\nConversion old Calendar to new ZonedDateTime");
		GregorianCalendar oldGregorianCalendar = new GregorianCalendar();
		
		ZonedDateTime newZonedDateTimeFromGregorianCalendar = oldGregorianCalendar.toZonedDateTime();

		System.out.println("Old Gregorian Calendar: " + oldGregorianCalendar);
		System.out.println("New ZonedDateTime from Gregorian Calendar: " + newZonedDateTimeFromGregorianCalendar);

	}

}
