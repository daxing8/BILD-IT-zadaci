
/******************************************************************************************
 * (Algebra: quadratic equations) Design a class named QuadraticEquation for
 * a quadratic equation ax2 + bx + x = 0. The class contains:
 * - Private data fields a, b, and c that represent three coefficients.
 * - A constructor for the arguments for a, b, and c.
 * - Three getter methods for a, b, and c.
 * - A method named getDiscriminant() that returns the discriminant, which is
 * b2 - 4ac.
 * - The methods named getRoot1() and getRoot2() for returning two roots of 
 * the equation
 * 
 * These methods are useful only if the discriminant is nonnegative. Let these methods
 * return 0 if the discriminant is negative.
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that prompts the user to enter values for a, b, and c and displays the result
 * based on the discriminant. If the discriminant is positive, display the two roots. If
 * the discriminant is 0, display the one root. Otherwise, display “The equation has
 * no roots.” See Programming Exercise 3.1 for sample runs.
 ******************************************************************************************/


package zadaci_22_08_2016;

public class QuadraticEquation {
	
	//data fields
	private double a;
	private double b;
	private double c;

	// Constructor to initialize data fields
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/********************* Getters and Setters *****************************/
	
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	/********************* End of Getters and Setters *****************************/
	
	
	// Method to calculate discriminant
	public double getDiscriminant() {
		double discriminant = (getB() * getB()) - (4 * (getA() * getC()));
		return discriminant;
	}

	// Method to calculate root1
	public double getRoot1() {
		double root1 = (-getB() + Math.sqrt(getDiscriminant())) / 2 * getA();
		
		//If disccriminant is negative number return 0
		if (getDiscriminant() < 0) {
			return 0;
		}
		return root1;
	}

	// Method to calculate root2
	public double getRoot2() {
		double root2 = (-getB() - Math.sqrt(getDiscriminant())) / 2 * getA();
		
		//If disccriminant is negative number return 0
		if (getDiscriminant() < 0) {
			return 0;
		}
		return root2;
	}
}
