package zadaci_05_09_2016;

public class Complex implements Cloneable{

	private double a;
	private double b;

	
	//Constructor creates Complex object with default value
	public Complex() {
		this(0, 0);
	}

	// Constructor creates a Complex object with specified a and 0 as b
	public Complex(double a) {
		this(a, 0);
	}

	// Constreuctor creates a Complex object with specified a and b 
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	// Returns real part of complex number 
	public double getRealPart() {
		return a;
	}

	// Returns imaginary part of complex number 
	public double getImaginaryPart() {
		return b;
	}

	// Adds a complex number to this complex number 
	public Complex add(Complex secondComplex) {
		return new Complex(a + secondComplex.a, 
			b + secondComplex.b); 
	}

	// Subtract a complex number from this complex number 
	public Complex subtract(Complex secondComplex) {
		return new Complex(a - secondComplex.a,
			b - secondComplex.b);
	}

	// Multiply a complex number by this complex number 
	public Complex multiply(Complex secondComplex) {
		return new Complex(a * secondComplex.a - b * secondComplex.b,
			b * secondComplex.a + a * secondComplex.b);
	}

	// Divides a complex number by this complex number 
	public Complex divide(Complex secondComplex) {
		return new Complex((a * secondComplex.a + b * secondComplex.b) /
			(Math.pow(secondComplex.a, 2) + Math.pow(secondComplex.b, 2)),
			(b * secondComplex.a - a * secondComplex.b) /
			(Math.pow(secondComplex.a, 2) +  Math.pow(secondComplex.b, 2)));
	}

	// Returns the absolute value of this complex number 
	public double abs() {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

	@Override // Override the protectec clone method defined in the Object class
	public Complex clone() throws CloneNotSupportedException {
		return (Complex)super.clone();
	}

	@Override // Retruns a string representation of this complex number 
	public String toString() {
		return b == 0 ? a + "" : "(" + a + " + " + b + "i)";
	}
}
