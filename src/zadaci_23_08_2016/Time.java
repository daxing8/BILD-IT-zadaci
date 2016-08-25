
/*************************************************************************************
 * (The Time class) Design a class named Time. The class contains:
 * - The data fields hour, minute, and second that represent a time.
 * - A no-arg constructor that creates a Time object for the current time. (The
 * values of the data fields will represent the current time.)
 * - A constructor that constructs a Time object with a specified elapsed time
 * since midnight, January 1, 1970, in milliseconds. (The values of the data
 * fields will represent this time.)
 * - A constructor that constructs a Time object with the specified hour, minute,
 * and second.
 * - Three getter methods for the data fields hour, minute, and second,
 * respectively.
 * - A method named setTime(long elapseTime) that sets a new time
 * for the object using the elapsed time. For example, if the elapsed time is
 * 555550000 milliseconds, the hour is 10, the minute is 19, and the second is
 * 10.
 * Draw the UML diagram for the class and then implement the class. Write
 * a test program that creates two Time objects (using new Time() and new
 * Time(555550000)) and displays their hour, minute, and second in the format
 * hour:minute:second.
 **************************************************************************************/


package zadaci_23_08_2016;

import java.util.GregorianCalendar;

public class Time {
	//Private data fields
	private long hour;
	private long minute;
	private long second;
	
	//Default constructor creates current time hour, minute and second
	Time() {
		GregorianCalendar date = new GregorianCalendar();
		
		this.hour = date.get(GregorianCalendar.HOUR_OF_DAY);
		this.minute = date.get(GregorianCalendar.MINUTE);
		this.second = date.get(GregorianCalendar.SECOND);
	}
	
	//Constructs Time object with specified elapsed time
	Time(long elapsedTime) {
		setTime(elapsedTime);
	}
	
	//Constructs Time object with specified hour, minute an second
	Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}	
	
	/********************** Getter methods *******************************/

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}
	
	/********************* End of Getter methods ***************************/
	
	/**
	 * Sets new time based on the elapsed time taken as an argument
	 * @param elapsedTime
	 */
	public void setTime(long elapsedTime) {
		
		//Gets total seconds from elapsed time
		long totalSeconds = elapsedTime / 1000;
		
		//Gets actual seconds 
		this.second = totalSeconds % 60;
		
		//Gets total minutes
		long totalminutes = totalSeconds / 60;
		
		//Gets actual minutes
		this.minute = totalminutes % 60;
		
		//Gets total hours
		long totalHours = totalminutes / 60;
		
		//Gets actual hour 
		this.hour = totalHours % 24;
	}
}
