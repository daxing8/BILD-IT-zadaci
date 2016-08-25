
/********************************************************************************
 * (Square numbers) Find the first ten square numbers that are greater than
 * Long.MAX_VALUE. A square number is a number in the form of n2. For example,
 * 4, 9, and 16 are square numbers. Find an efficient approach to run your
 * program fast.
 * 
 *********************************************************************************/



package zadaci_24_08_2016;

import java.math.BigInteger;

public class SquareNumbers {

	public static void main(String[] args) {
		
		//Creates a BigInteger object with value of square root of Long.MAX_VALUE 
		BigInteger number = new BigInteger((long)Math.sqrt(Long.MAX_VALUE) + "");
		
		//Counts square numbers
		int counter = 0;
		//Prints a header for 10 square numbers
		System.out.println("Ten square numbers greater than Long.MAX_VALUE: \n");
		
		//While counter is less than 10 loop
		while (counter < 10) {
			
			//Increments number ref.variable by 1
			number = number.add(BigInteger.ONE);
			
			//Multiplies number ref.variable with it self to get the square number larger than Long.MAX_VALUE
			System.out.println(number.multiply(number));
			
			//Increments by one
			counter++;
		}
	}

}
