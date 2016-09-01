
/************************************************************************
 * (OutOfMemoryError) Write a program that causes the JVM to throw an
 * OutOfMemoryError and catches and handles this error.
 ************************************************************************/


package zadaci_30_08_2016;

public class Zadatak_2_OutOfMemoryError {

	public static void main(String[] args) {
		//Code that can throw an exception
		try {
			//Array of type short that exceeds memory capacity and makes an exception
			short[] sh = new short[1000000000];
			//Adds exceeded value to array
			sh[0] = (short)120000;
			
			//Catches an exception and prints a message
		} catch (OutOfMemoryError e) {
			System.out.println("Out of memory.");
		}
		//Prints a message
		System.out.println("Your program is terminated.");
	}
	

}
