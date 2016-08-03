
/************************************************************************************
 * Napisati metodu koja nalazi najmanji element u nizu decimalnih					*
 * vrijednosti koristeæi se sljedeæim headerom:										*		
 * 																					*
 * public static double min(double[ ] array)										*
 * 																					*
 * Napišite potom test program koji pita korisnika da unese deset brojeva te		*	
 * poziva ovu metodu da vrati najmanji element u nizu. 								*
 * 																					*
 ***********************************************************************************/


package zadaci_03_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_2 {

	// Metoda kao argument prima Array decimalnih vrijednosti
	public static double min(double[] array) {

		// Metoda u klasi sort iz klase Arrays sortira niz od najmanjeg do
		// najveceg
		Arrays.sort(array);

		// Metoda vraca broj na prvom indexu niza, koji je ujedno i namjanji
		// nakon sortiranja
		return array[0];
	}

	public static void main(String[] args) {
		
		//Kreiranje objekta klase scanner
		Scanner input = new Scanner(System.in);

		// Korisnik unosi 10 decimalnih brojeva
		System.out.print("Unesite deset decimalnih brojeva: ");

		// Pravimo niz koji u koji cemo pohraniti unos od korisnika
		double[] brojevi = new double[10];

		// Unos brojeva od korisnika u prethodno kreirani niz decimalnih vrijednosti
		for (int i = 0; i < brojevi.length; i++) {
			brojevi[i] = input.nextDouble();
		}
		input.close();

		// Ispis najmanjeg elementa u nizu pozivom na metodu min(double[] array)
		System.out.println("Najmanji element u nizu je: " + min(brojevi));
	}

}
