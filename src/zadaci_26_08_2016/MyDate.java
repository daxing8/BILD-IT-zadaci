package zadaci_26_08_2016;

import java.util.GregorianCalendar;

public class MyDate {
	
	//Data field
	private int year;
	private int month;
	private int day;
	
	//Constructor creates current date
	public MyDate() {
		GregorianCalendar cal = new GregorianCalendar();
		year = cal.get(GregorianCalendar.YEAR);
		month = cal.get(GregorianCalendar.MONTH);
		day = cal.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	//Constructor creates GregorianCalendar object with specified time parameter
	public MyDate(long time) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTimeInMillis(time);
		year = cal.get(GregorianCalendar.YEAR);
		month = cal.get(GregorianCalendar.MONTH);
		day = cal.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	//Constructor creates MyDate objects with specified parameters of year, month and day
	public MyDate(int year, int month, int day) {

		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	/*********************** Getter methods ***************************/
	
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
	
	/*********************** End of Getter methods ***************************/
	
	//Sets date with specified elapsed time
	public void setDate(long elapsedTime) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTimeInMillis(elapsedTime);
		year = cal.get(GregorianCalendar.YEAR);
		month = cal.get(GregorianCalendar.MONTH);
		day = cal.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	//Returns string representation of a MyDate object
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

}
