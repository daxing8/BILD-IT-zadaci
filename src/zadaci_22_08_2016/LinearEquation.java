
/***************************************************************************************
 * (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
 * 2 * 2 system of linear equations:
 * 
 * The class contains:
 * - Private data fields a, b, c, d, e, and f.
 * - A constructor with the arguments for a, b, c, d, e, and f.
 * - Six getter methods for a, b, c, d, e, and f.
 * - A method named isSolvable() that returns true if ad - bc is not 0.
 * - Methods getX() and getY() that return the solution for the equation.
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that prompts the user to enter a, b, c, d, e, and f and displays the result.
 * If ad - bc is 0, report that “The equation has no solution.” See Programming
 * Exercise 3.3 for sample runs.
 ****************************************************************************************/



package zadaci_22_08_2016;

public class LinearEquation {

	// Data fields
	private double a, b, c, d, e, f;

	// Constructor initialises data fields
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}
	/********************* End of Getters and Setters *****************************/
	
	
	// Method checks if equation is solvable
	public boolean isSolvable() {
		double g = (getA() * getD()) - (getB() * getC());
		if (g != 0) {
			return true;
		} else {
			return false;
		}
	}

	// Method calculates x
	public double getX() {
		double x = (getE() * getD() - getB() * getF()) / (getA() * getD() - getB() * getC());
		return x;
	}

	// Method calculates y
	public double getY() {
		double y = (getA() * getF() - getE() * getC()) / (getA() * getD() - getB() * getC());
		return y;
	}
}
