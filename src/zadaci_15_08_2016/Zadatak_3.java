
/*Napisati program koji sabira sljedeæu seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.*/



package zadaci_15_08_2016;

public class Zadatak_3 {

	public static void main(String[] args) {
		
		//Sums all numbers
		double sum = 0;
		
		//Divides and sums all odd numbers from 1 to 100
		for (double i = 1; i < 97; i += 2) {
			sum += (i / (i + 2));
		}
		
		//Prints a result
		System.out.printf("Sum of numbers in a consecutive series 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99 is: \n%2.2f", sum);
	}
}
