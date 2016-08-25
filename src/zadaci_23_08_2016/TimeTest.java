package zadaci_23_08_2016;

public class TimeTest {

	public static void main(String[] args) {
		
		/**
		 * Creates two Time objects first default with current time
		 * second with specified elapsed time in milliseconds returns hours, minutes and seconds
		 */
		Time time1 = new Time();
		Time time2 = new Time(555550000);
		
		//Prints current time in format hh:mm:ss
		System.out.println("Current time is: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
		
		//Prints elapsed time in format hh:mm:ss
		System.out.println("Elapsed time in hh:mm:ss format is: " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
	}

}
