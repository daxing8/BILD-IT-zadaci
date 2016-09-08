
/*****************************************************************************
 * (Sum series) Write a recursive method to compute the following series:
 * 
 * m(i) = 1 / 3 + 2 / 5 + 3 / 7 + 4 / 9 + 5 / 11 + 6 / 13 + ... + i / 2i + 1
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 ******************************************************************************/

package zadaci_07_09_2016;

public class Zadatak_4_SumSeries {

	public static void main(String[] args) {
		// Prints a calculation result
		System.out.println("Summed series of numbers: ");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%.2f", m(i));
			System.out.println();
		}
	}

	// Sums series of numbers with formula
	public static double m(double i) {
		if (i == 1) // base case
			return 1;
		else
			return 1 / (2 * i + 1) + m(i - 1); // recursive call
	}
}
