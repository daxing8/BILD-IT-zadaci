
/***************************************************************************************
 * (Displaying the prime factors) Write a program that prompts the user to enter
 * a positive integer and displays all its smallest factors in decreasing order. For
 * example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
 * 2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
 * retrieve and display them in reverse order.
 ****************************************************************************************/


package zadaci_23_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		
		//Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		//List to store prime factors 
		ArrayList<Integer> list = new ArrayList<>();
		
		int factor = 0;
		
		//Code that can throw an exception
		try {
			
			//Prompts user to enter a number
			System.out.println("Enter a number:");
			int n = input.nextInt();
			
			//StackOfIntegers object to stack factors
			StackOfIntegers stack = new StackOfIntegers();
			
			//Finds factors
			for (int i = 2; i <= n; i++) {
				// If number is divisable with i it is stored as a factor
				while (n % i == 0) {
					factor = i;
					// Stores the number in the list
					list.add(factor);
					
					//Pushes factor to stack
					stack.push(factor);
					n = n / i;

				}
			}
			// Prints factors in decreasing order
			for (int i = list.size() - 1; i >= 0; i--) {
				System.out.print(list.get(i).intValue() + " ");
			}
			System.out.println();
			
			// Crates new object to store reversed numbers
			StackOfIntegers stack2 = new StackOfIntegers();
			// Moves the elements and reverses them
			for (int i = stack.getSize(); i >= 0; i--) {
				while (!stack.empty()) {
					stack2.push(stack.pop());
				}
			}
			// Pints the numbers 
			for (int i = 0; i < stack2.getSize(); i++) {
				while (!stack2.empty()) {
					System.out.print(stack2.pop() + " ");
				}
			}

			input.close();
			
			//Cathces a exception and prints a message
		} catch (Exception e) {
			System.out.println("Invalid input. Enter a valid format of number.");
		}

	}

}
