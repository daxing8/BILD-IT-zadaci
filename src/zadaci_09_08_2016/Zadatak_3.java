
/**********************************************************************************************************************
 * 
 * Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po liniji, koji su djeljivi i sa 5 i sa 6. 
 * Razmak izmeðu brojeva treba biti taèno jedan space. 
 * 
 **********************************************************************************************************************/




package zadaci_09_08_2016;

public class Zadatak_3 {

	public static void main(String[] args) {

		// Counts numbers per row
		int counter = 0;

		// Prints all numbers from 100 to 1000 divisible with 5 and 6
		for (int i = 100; i < 1000; i++) {

			// if number is divisible with both 5 and 6 it is printed
			if (i % 5 == 0 && i % 6 == 0) {
				System.out.print(" " + i);// Prints number with one space
				
				counter++;// counter increments by one if number is divisible
			}
			//If count of numbers is equal to ten pass to the next line
			if (counter == 10) {
				System.out.println();//Switches to new line 
				
				counter = 0;//Counter is set to zero
			}
		}
	}

}
