package org.learning.newdateapi.templates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * 
 * @author naho
 *
 * Date and time with timezone by means of the new Date API
 * 
 */
public class Exercise_5 {
	public static void main(String[] args) {
		oldAPI();
		newAPI();
	}

	private static void oldAPI() {
		System.out.println("Old Date and Time API");
		Date localTime = new Date();
		DateFormat converter = new SimpleDateFormat("dd/MM/yyyy:HH:mm:ss");
		converter.setTimeZone(TimeZone.getTimeZone("GMT"));

		System.out.println("local time : " + localTime);
		System.out.println("time in GMT : " + converter.format(localTime));

	}

	// TODO
	private static void newAPI() {

	}
}
