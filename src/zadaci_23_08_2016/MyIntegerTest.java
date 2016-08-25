package zadaci_23_08_2016;

import java.util.Scanner;

public class MyIntegerTest {

	public static void main(String[] args) {
		
		//Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		//Prompts user to enter a number
		System.out.println("Enter an integer: ");
		int number1 = input.nextInt();
		
		//New MyInteger object with user input 
		MyInteger integer = new MyInteger(number1);
		
		//Prints the result and calls all methods
		System.out.println("Number " + number1 + " is Even: " + integer.isEven());
		System.out.println("Number " + number1 + " is Odd: " + integer.isOdd());
		System.out.println("Number " + number1 + " is Prime: " + integer.isPrime());
		
		System.out.println();
		
		System.out.println("Number is Even: " + MyInteger.isEven(integer));
		System.out.println("Number is Odd: " + MyInteger.isOdd(integer));
		System.out.println("Number is Prime: " + MyInteger.isPrime(integer));
		
		System.out.println();
		
		System.out.println("Number is Even: " + MyInteger.isEven(7));
		System.out.println("Number is Odd: " + MyInteger.isOdd(7));
		System.out.println("Number is Prime: " + MyInteger.isPrime(7));
		System.out.println();
		
		//Prompts user to enter another number
		System.out.println("Enter an integer: ");
		int number2 = input.nextInt();
		input.close();
		
		System.out.println("Integer is equal to previous number: " + integer.equals(number2));
		System.out.println("Integer input is equal to value of integer object: " + integer.equals(integer));
		System.out.println();
		
		char[] numbers = {'4', '3', '6', '2'};
		
		System.out.println(MyInteger.parseInt(numbers));
		System.out.println();
		String numbers2 = "4362";
		System.out.println(MyInteger.parseInt(numbers2));	}

}
