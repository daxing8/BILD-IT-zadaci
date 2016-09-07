package zadaci_05_09_2016;

public class Zadatak_1_BenefitsOfEncapsulation {

	public static void main(String[] args) {
		
		//Rational object with specified values
		Rational rational = new Rational(5, 6);
		//Divides one rational object with new rational object
        rational = rational.divide(new Rational(7, 4));
        //Prints result
        System.out.println(rational);
	}

}
