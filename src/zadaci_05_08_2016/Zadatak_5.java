package zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_5 {

	// Main metoda baca Exeption pogresnog unosa podataka od korisnika
	public static void main(String[] args) throws InputMismatchException {

		// try catch block hvata Exeption i ispisuje poruku upozorenja
		try {

			// Kreiranje scanner objekta za unos podataka od korisnika
			Scanner input = new Scanner(System.in);

			// Ispis poruke korisniku da unese string
			System.out.println("Unesite neki string: ");
			String stringKorisnika = input.nextLine();

			// Pozivanje metode koja provjerava da li je korisnik greskom unijeo
			// broj, ukoliko jeste salje Exeption i poruku upozorenja, te
			// prekida dalji unos
			wrongInput(stringKorisnika);
			
			// Zatvaranje scanner objekta
			input.close();
			
			//Pozivanje metode koja broji slova u stringu i ispisivanje rezultata na konzoli
			System.out.println("Broj slova u vasem stringu iznosi: " + countLetters(stringKorisnika));
			
			// catch block hvata Exeption i ispisuje poruku upozorenja korisniku
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos! Program prima samo slova. ");
		}

	}
	//Metoda prima string kao argument i broji slova u stringu
	public static int countLetters(String s) {
		
		//Brojac slova u stringu
		int brojacSlova = 0;
		
		//Ako je karakter na datom indeksu slovo brojac se povecava za 1
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				brojacSlova++;
			}
		}
		//Metoda vraca broj slova
		return brojacSlova;
	}

	// Metoda prima jedan string kao argument i provjerava da li je unos
	// pogresan
	public static String wrongInput(String unos1) {

		// Ukoliko string korisnika sadrzi broj kao karakter metoda baca novi
		// Exeption
		for (int i = 0; i < unos1.length(); i++) {
			if (Character.isDigit(unos1.charAt(i))) {
				throw new InputMismatchException();
			}
		}
		//Metoda vraca unos 
		return unos1;
	}
}
