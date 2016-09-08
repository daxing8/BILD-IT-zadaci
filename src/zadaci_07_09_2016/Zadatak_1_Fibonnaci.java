
/***********************************************************************************
 * (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.
 * Hint: To compute fib(n) without recursion, you need to obtain fib(n - 2)
 * and fib(n - 1) first. Let f0 and f1 denote the two previous Fibonacci
 * numbers. The current Fibonacci number would then be f0 + f1. The algorithm
 * can be described as follows:
 * 
 * f0 = 0; // For fib(0)
 * f1 = 1; // For fib(1)
 * for (int i = 1; i <= n; i++) {
 * currentFib = f0 + f1;
 * f0 = f1;
 * f1 = currentFib;
 * }
 * // After the loop, currentFib is fib(n)
 * Write a test program that prompts the user to enter an index and displays its
 * Fibonacci number.
 ************************************************************************************/


package zadaci_07_09_2016;

import java.util.Scanner;

public class Zadatak_1_Fibonnaci {

	public static void main(String[] args) {
		//Scanner object
		Scanner input = new Scanner(System.in);
		//Prompts user to entera fibonnaci index
		System.out.println("Enter index of fibonnaci number: ");
		int n = input.nextInt();
		//Prints result
		System.out.println("Fibonnaci number on index " + n + " is: " + fibonnaci(n));
		
		//Scanner closed
		input.close();
	}
	//Returns a fibonnaci number for specified index
	public static long fibonnaci(int index) {
		
		//Returns fibonnaci 0 and 1 
		if (index == 0)
			return 0;
		if (index == 1)
			return 1;
		
		//Variables for fibonnaci calculation
		int f0 = 0;
		int f1 = 1;
		int currentFib;
		
		//Calculates fibonnaci on specified index
		for (int i = 2; i <= index; i++) {
			currentFib = f0 + f1;
			f0 = f1;
			f1 = currentFib;
		}//returns fibonnaci number
		return f1;
	}
}
