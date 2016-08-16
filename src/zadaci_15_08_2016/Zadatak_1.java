
/*************************************************************************************************************
 * Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 te ispisuje ime mjeseca za taj broj. 
 * (Januar za 1, Ferbruar za 2....)
 * 
 *************************************************************************************************************/


package zadaci_15_08_2016;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		//Generates random number between 1 and 12
		int random = 1 + (int) (Math.random() * 12);
		
		//String of month names
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
			
		//Prints a month of the year randomly generated 
		System.out.println("Random generated month of the year is: \n" + months[random - 1]);//random number - 1 to get the correct index of the month 
	}
}
