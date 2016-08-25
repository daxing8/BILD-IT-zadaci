
/**************************************************************************************
 * (Displaying the prime numbers) Write a program that displays all the prime
 * numbers less than 120 in decreasing order. Use the StackOfIntegers class
 * to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
 * reverse order.
 **************************************************************************************/



package zadaci_23_08_2016;

import java.util.ArrayList;

public class PrimeNumbers {

	public static void main(String[] args) {
			
			//List to store the prime numbers
			ArrayList<Integer> primes = new ArrayList<>();
			
			//StackOfIntegers object to stack the primes
			StackOfIntegers stack = new StackOfIntegers();
			
			// Adds prime numbers from the method
			for (int i = 0; i < 120; i++) {
				if (isPrime(i)) {
					primes.add(i);
					stack.push(i);
				}
			}
			// Displays primes in decreasing order
			for (int i = primes.size() - 1; i >= 0; i--) {
				System.out.print(primes.get(i).intValue() + " ");
			}
			System.out.println();
			
			// Crates new object
			StackOfIntegers stack2 = new StackOfIntegers();
			
			// Moves the elements and reverses them
			for (int i = stack.getSize(); i >= 0; i--) {
				while (!stack.empty()) {
					stack2.push(stack.pop());
				}
			}
			// Prints numbers in increasing order
			for (int i = 0; i < stack2.getSize(); i++) {
				while (!stack2.empty()) {
					System.out.print(stack2.pop() + " ");
				}
			}

		}

	// Method calculates prime numbers
	public static boolean isPrime(int n) {
		int c = 0;
		for (int i = n; i >= 1; i--) {
			if (n % i == 0) {
				c++;
			}
		}
		// returns true if number is prime
		if (c == 2) {
			return true;
		}
		return false;
	}

}
