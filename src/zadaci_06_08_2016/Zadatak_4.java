package zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_4 {

	// Metoda main baca Exeption za pogrsan unos od korisnika
	public static void main(String[] args) throws InputMismatchException {

		// try catch block obuhvata dio koda gdje bi se mogla dogoditi greska i
		// hvata Exeption
		try {

			// Kreiran Scanner objekt za unos podataka od korisnika
			Scanner input = new Scanner(System.in);

			// Ispis poruke korisniku da unese podatke tipa string
			System.out.println("Unesite neki string: ");

			// Unos podataka od korisnika u varijablu
			String s = input.nextLine();

			// Poziv metode koja provjerava da li je korisnik greskom unijeo
			// broj umjesto slova
			// i ako jeste baca Exeption
			isNumber(s);
			
			input.close();
			
			// Index stringa se povecava za 2 svakom iteracijom petlje i
			// ispisuje slovo na svakom drugom indeksu stringa
			for (int i = 0; i < s.length(); i += 2) {
				System.out.print(s.charAt(i));
			}

			// catch blok hvata exeption i ispisuje poruku o pogresnom unosu i
			// prekida dalje izvrsenje programa
		} catch (InputMismatchException e) {
			System.out.println("Greska u unosu! Unesite samo slova! ");
		}
	}

	// Metoda prima jedan string kao argument i provjerava da li je korisnik
	// greskom unijeo brojeve umjesto slova u string
	public static void isNumber(String unos) {
		
		
		//Ukoliko je neki od karaktera u stringu broj metoda baca novi Exeption
		for (int j = 0; j < unos.length(); j++) {
			if (Character.isDigit(unos.charAt(j))) {
				throw new InputMismatchException();
			}
		}
	}
}
