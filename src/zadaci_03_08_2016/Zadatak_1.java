
/********************************************************************************************	
 * 																							*	
 * 	Napisati metodu koja prima 2 argumenta: 												*
 * 																							*
 * 	poèetni broj i krajnji broj te printa sve proste brojeve u zadanom rangu.				*
 *	BONUS: metoda može primati i treæi argument, broj brojeva za isprintati po liniji.		*
 *																							*
 *																							*	
 *******************************************************************************************/

package zadaci_03_08_2016;

import java.util.Scanner;

public class Zadatak_1 {

	// Metoda prima tri cijela broja kao argumente
	public static void prostiBrojevi(int broj1, int broj2, int broj3) {

		// Varijabla za brojanje prostih brojeva u jednom redu
		int brojacRedova = 0;

		// Pozivanje metode isPrime koja provjerava da li je neki broj
		// prosti ili nije i vraca boolean vrijednost true ili false.
		// Ispisivanje broja koji je prosti na konzoli
		for (int i = broj1; i <= broj2; i++) {
			if (isPrime(i)) {
				brojacRedova++;
				System.out.print(i + " ");
			}

			// Ako je broj prostih brojeva jednak broju prostih brojeva po redu
			// koje je korisnik unijeo
			// prebaciti u sljedeci red i brojac se ponistava na nulu
			if (brojacRedova == broj3) {
				System.out.println();
				brojacRedova = 0;
			}
		}
	}

	// Metoda prima cijeli broj kao argument
	public static boolean isPrime(int n) {

		// Varijabla je podesena na true
		boolean prostiBroj = true;

		// Ukoliko je broj djeljiv sa nekim drugim brojem osim sa 1 i sa samim
		// sobom onda je false i petlja se prekida
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				prostiBroj = false;
				break;

			}

		}
		// Metoda vraca true ako je broj prost i false ukoliko nije
		return prostiBroj;
	}

	public static void main(String[] args) {

		// Kreiranje Scanner objekta za unos korisnika
		Scanner input = new Scanner(System.in);

		// Unos pocetnog broja od kojeg ce se racunati prosti brojevi od
		// korisnika
		System.out.println("Unesite pocetni broj: ");
		int pocetniBroj = input.nextInt();

		// Unos zavrsnog broja do kojeg ce se racunati prosti brojevi od
		// korisnika
		System.out.println("Unesite zavrsi broj: ");
		int zavrsniBroj = input.nextInt();

		// Unos kolicine prostih brojeva po redu koje korisnik zeli
		System.out.println("Koliko brojeva zelite u jednom redu: ");
		int brojevaURedu = input.nextInt();

		// Pozivanje metode koja ispisuje sve proste brojeve od pocetnog do
		// zeljenog broja
		prostiBrojevi(pocetniBroj, zavrsniBroj, brojevaURedu);

		input.close();
	}
}
