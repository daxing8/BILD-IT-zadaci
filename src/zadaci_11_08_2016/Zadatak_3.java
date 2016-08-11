
/*******************************************************************************************************************************
 * 
 * Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi od 1. januara 1970 do trenutka pozivanja metode. 
 * Napisati program koji ispisuje trenutaèni datum i vrijeme u formatu "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
 * 
 *******************************************************************************************************************************/

package zadaci_11_08_2016;

import java.util.GregorianCalendar;

public class Zadatak_3 {

	public static void main(String[] args) {

		// Creates a GregorianCalendar class object that creates current time
		GregorianCalendar dateAndTime = new GregorianCalendar();

		// Array of strings representing every month of a year
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"Oktober", "November", "December" };

		// Prints current date and time by invoking methods of GregorianCalendar
		// class that return day, month, year, hours, minutes, and seconds

		System.out.println("Current date and time: " + dateAndTime.get(GregorianCalendar.DATE) + ". "
				+ months[dateAndTime.get(GregorianCalendar.MONTH)] + ", " + dateAndTime.get(GregorianCalendar.YEAR)
				+ " " + dateAndTime.get(GregorianCalendar.HOUR_OF_DAY) + ":" + dateAndTime.get(GregorianCalendar.MINUTE)
				+ ":" + dateAndTime.get(GregorianCalendar.SECOND));

	}
}
