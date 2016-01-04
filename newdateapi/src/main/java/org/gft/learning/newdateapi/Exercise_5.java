package org.gft.learning.newdateapi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

/**
 * 
 * @author naho
 *
 * Date and time with timezone in Java 8 
 * 
 */
public class Exercise_5 {
	public static void main(String[] args) {
		oldAPI();		
		newAPI();
	}

	private static void oldAPI() {
	     //Date will return local time in Java  
	     Date localTime = new Date(); 
	    
	     //creating DateFormat for converting time from local timezone to GMT
	     DateFormat converter = new SimpleDateFormat("dd/MM/yyyy:HH:mm:ss");
	    
	     //getting GMT timezone, you can get any timezone e.g. UTC
	     converter.setTimeZone(TimeZone.getTimeZone("GMT"));
	    
	     System.out.println("local time : " + localTime);;
	     System.out.println("time in GMT : " + converter.format(localTime));

	
	}

	private static void newAPI() {		
		ZoneId gmtZone = ZoneId.of("GMT"); 
		LocalDateTime localDateAndTime = LocalDateTime.now(gmtZone); 
		ZonedDateTime dateAndTimeInSpain = ZonedDateTime.of(localDateAndTime, gmtZone);
		
		System.out.println("Current date and time in a particular timezone : " + localDateAndTime);	
		System.out.println("Current date and time in a particular timezone : " + dateAndTimeInSpain);		
	}
}
