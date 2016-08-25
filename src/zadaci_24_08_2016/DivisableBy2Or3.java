
/*********************************************************************************************
 * (Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are
 * divisible by 2 or 3.
 * 
 ***********************************************************************************************/



package zadaci_24_08_2016;

import java.math.BigInteger;

public class DivisableBy2Or3 {

	public static void main(String[] args) {
		
		//String with value of 1
		String bigNumber = "1";
		
		//Adds 49 zero digits to the string 
		for (int i = 0; i < 49; i++) {
			
			bigNumber += 0;
		}
		//Counter for number of 50 digit numbers divisable with 2 or 3
		int counter = 0;
		
		//Creates a BigInteger object with value of 50 digits
		BigInteger integer = new BigInteger(bigNumber);
		
		//Prints a header for 10 numbers
		System.out.println("\nFirst ten numbers with 50 digits divisable by 2 or 3 are: \n");
		
		//Checks if numbers are divisable by 2 or 3 and prints them
		while(counter < 10){
			
			if(integer.remainder(new BigInteger("2")) == BigInteger.ZERO || integer.remainder(new BigInteger("3")) == BigInteger.ZERO){
				System.out.println(integer);
				counter++;
			}
			//Increments big number by 1
			integer = integer.add(BigInteger.ONE);
		}
	}
}
