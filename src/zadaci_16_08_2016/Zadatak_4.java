package zadaci_16_08_2016;

import java.util.Date;


public class Zadatak_4 {

	public static void main(String[] args) {
		
		//Calls a method to output actual date and time
		System.out.println(dateAndTime());
		
	}
	//Creates Date object and returns actual date and time
	public static String dateAndTime(){
		
		//Creates Date object
		Date actualTime = new Date();
				
		//Returns actual date and time calling toString method
			return actualTime.toString();
	}
}
