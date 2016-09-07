package zadaci_05_09_2016;

public class Zadatak_2_BigIntegerRational {

	public static void main(String[] args) {
		// Rational object with specified values
		Rational rational = new Rational(5, 6);
		// Multiply one rational object with new rational object
		rational = rational.multiply(new Rational(7, 4));
		// Prints result
		System.out.println(rational);
	}
}
