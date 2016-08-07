
/***************************************************************************************************************
 * 
 * Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u rasponu godina koje korisnik unese. 
 * Program pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu. 
 * Razmak izmeðu godina treba biti jedan space. 
 * 
 ***************************************************************************************************************/


package zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_2 {
	
	// Main metoda baca Exeption pogresnog unosa podataka od korisnika
	public static void main(String[] args) throws InputMismatchException {
		
		// try catch block hvata Exeption i ispisuje poruku upozorenja
		try {
			
			// Kreiranje scanner objekta za unos podataka od korisnika
			Scanner input = new Scanner(System.in);
			
			//Ispis poruke korinsiku da unese pocetnu godinu za racunanje
			System.out.println("Unesite pocetnu godinu: ");
			int pocetnaGodina = input.nextInt();

			//Pozivanje metode koja provjerava da li je unos negativan broj 
			negativeInput(pocetnaGodina);
			
			//Ispis poruke korinsiku da unese zavrsnu godinu za racunanje
			System.out.println("Unesite zavrsnu godinu: ");
			int zavrsnaGodina = input.nextInt();
			
			//Pozivanje metode koja provjerava da li je unos negativan broj
			negativeInput(zavrsnaGodina);
			
			//Pozivanje metode koja ispisuje sve prestupne godine u zadanom rasponu
			prestupneGodine(pocetnaGodina, zavrsnaGodina);
			
			//Scanner je zatvoren
			input.close();
			
			//catch blok hvata Exeption, prekida dalji unos i ispisuje poruku upozorenja
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos! Molim vas unesite samo cijele brojeve!");
		}

	}

	// Metoda prima cijeli broj kao argument i provjerava da li je broj
	// negativan ili nula
	public static void negativeInput(int unos) {

		// Ako je broj negativan baca Exeption i vraca unos
		if (unos < 0) {
			throw new InputMismatchException();
		}
	}

	public static void prestupneGodine(int godina1, int godina2) {
		
		
		//Brojac prestupnih godina 
		int redovi = 0;
		
		//Ispis naslova na konzoli
		System.out.println("Sve prestupne godine od " + godina1 + " do " + godina2 + " godine su: ");
		
		// Provjera svake godine pojedinacno da li je prestupna
		for (int i = godina1; i < godina2; i++) {

			// Odredjivanje da li je godina prestupna formulom za provjeru
			// prestupne godine
			// Ukoliko je godina djeljiva sa 4 i nije djeljiva sa 100 ili ako je
			// djeljiva sa 400, ali ne i sa 100
			if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) {
				
				System.out.print(i + " "); // Ispis godine na konzoli sa
				// razmakom

				redovi++; // broj redova se poveceava svaki puta kada je
							// prestupna godina


			}
			// Kada je broj godina dosegao 10 listanje se prebacuje u sljedeci
			// red
			if (redovi == 10) {
				System.out.println();

				// broj godina po jednom redu se ponistava na nula
				redovi = 0;
			}
		}
		System.out.println();
	}
}
