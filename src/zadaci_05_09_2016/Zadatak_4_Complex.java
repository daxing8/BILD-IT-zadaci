package zadaci_05_09_2016;

import java.util.Scanner;

public class Zadatak_4_Complex {

	public static void main(String[] args) {
	//Scanner object for user input
	Scanner input = new Scanner(System.in);
	
	//Prompts user to enter first complex number 
	System.out.println("Enter first complex number: ");
	double a = input.nextDouble();
	double a1 = input.nextDouble();
	
	//Prompts user to enter second complex number
	System.out.println("Enter second complex number: ");
	double b = input.nextDouble();
	double b1 = input.nextDouble();
	
	// Complex objects with user input value
	Complex c = new Complex(a, a1);
	Complex c1 = new Complex(b, b1);
	
	// Prints all calculator calculation
	System.out.println(c + " + " + c1 + " = " + c.add(c1));
	System.out.println(c + " - " + c1 + " = " + c.subtract(c1));
	System.out.println(c + " * " + c1 + " = " + c.multiply(c1));
	System.out.println(c + " / " + c1 + " = " + c.divide(c1));
	System.out.println("|" + c + "|" + " = " + c.abs());

	input.close();	
	}
}
