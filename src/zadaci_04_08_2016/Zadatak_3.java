
/***************************************************************************************************************
 * Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u rastuæem redosljedu: 
 * 
 * public static void displaySortedNumbers(double num1, double num2, double num3). 
 * 
 * Napisati program koji pita korisnika da unese tri broja te ispiše ta tri broja u rastuæem redosljedu. 
 * 
 **************************************************************************************************************/

package zadaci_04_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_3 {

	// Metoda prima 3 decimalna broja kao argumente
	public static void displaySortedNumbers(double num1, double num2, double num3) {

		// Tri broja pohranjujemo u niz radi lakseg manipulisanja
		double[] listaBrojeva = { num1, num2, num3 };

		// Metodom sort iz Arrays klase sortiramo brojeve u uzlaznom nizu
		Arrays.sort(listaBrojeva);

		System.out.println("Vasi brojevi sortirani u rastucem redosljedu: ");

		// Sortirani brojevi se ispisuju jedan po jedan na konzoli
		for (int i = 0; i < listaBrojeva.length; i++) {
			System.out.println(listaBrojeva[i] + " ");
		}

	}

	public static void main(String[] args) {

		// Kreiranje Scanner objekta za unos podataka od korisnika
		Scanner input = new Scanner(System.in);

		// Unos prvog decimalnog broja od korisnika
		System.out.println("Unesite prvi decimalni broj: ");
		double broj1 = input.nextDouble();

		// Unos drugog decimalnog broja od korisnika
		System.out.println("Unesite drugi decimalni broj: ");
		double broj2 = input.nextDouble();

		// Unos treceg decimalnog broja od korisnika
		System.out.println("Unesite treci decimalni broj: ");
		double broj3 = input.nextDouble();
		
		//Zatvaranje Scanner objekta
		input.close();
		
		// Razmak izmedju unosa i ispisa radi citljivosti
		System.out.println();

		// Poziv metode za sortiranje kojoj se proslijedjuju 3 broja
		displaySortedNumbers(broj1, broj2, broj3);

	}
}
