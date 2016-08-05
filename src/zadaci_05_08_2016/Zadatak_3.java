
/***************************************************************************************
 * 
 * Napisati program koji pita korisnika da unese 2 stringa 
 * te ispisuje najveæi zajednièki prefix za ta dva stringa, ukoliko isti postoji. 
 * 
 * Na primjer, ukoliko korisnik unese sljedeæa dva stringa "Dobrodošli u Dubai" i 
 * "Dobrodošli u Vankuver" program treba da ispiše: 
 * Najveæi zajednièki prefix za dva stringa je "Dobrodošli u". 
 * 
 ***************************************************************************************/

package zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_3 {

	// Main metoda baca Exeption pogresnog unosa podataka od korisnika
	public static void main(String[] args) throws InputMismatchException {

		// try catch block hvata Exeption i ispisuje poruku upozorenja
		try {

			// Kreiranje scanner objekta za unos podataka od korisnika
			Scanner input = new Scanner(System.in);

			// Ispis poruke korisniku da unese prvi string
			System.out.println("Unesite prvu recenicu: ");
			String string1 = input.nextLine();

			// Pozivanje metode koja provjerava da li je korisnik greskom unijeo
			// broj, ukoliko jeste salje Exeption i poruku upozorenja, te
			// prekida dalji unos
			wrongInput(string1);

			// Ispis poruke korisniku da unese prvi string
			System.out.println("Unesite drugu recenicu: ");
			String string2 = input.nextLine();

			// Pozivanje metode koja provjerava da li je korisnik greskom unijeo
			// broj, ukoliko jeste salje Exeption i poruku upozorenja, te
			// prekida dalji unos
			wrongInput(string2);

			// Ispisivanje poruke na konzoli
			System.out.println("Najveci zajednicki prefix stringa je: \n");

			// Poziv metode koja provjerava da li dva stringa imaju zajednicki
			// prefix i ispisuje isti
			System.out.println(commonPrefix(string1, string2));

			// Zatvaranje scanner objekta
			input.close();

			// catch block hvata Exeption i ispisuje poruku upozorenja korisniku
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos! Program prima samo slova. ");
		}
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
		return unos1;
	}

	// Metoda prima dva stringa kao argument i poredi svaki karakter posebno te
	// vraca najmanji zajednicki prefix
	public static String commonPrefix(String s1, String s2) {

		// Metodom Math.min se poredi duzina dva stringa i duzina manjeg stringa
		// se dodjeljuje varijabli kao cijeli broj
		int smallString = Math.min(s1.length(), s2.length());

		String s3 = "Stringovi nemaju zajednickog prefiksa!";
		// Petlja se okrece onoliko puta kolika je duzina manjeg stringa
		for (int i = 0; i < smallString; i++) {

			// Ako prvi karakteri u stringovima nisu isti, metoda vraca poruku
			// da stringovi nemaju zajednickog prefiksa
			if (s1.charAt(0) != s2.charAt(0)) {
				return s3;

				// Ako karakter u stringu na zadanom indeksu nije jednak onom na
				// istom indeksu u drugom stringu
				// metoda vraca karaktere koji su isti do posljednjeg zajednickog karaktera
			} else if (s1.charAt(i) != s2.charAt(i)) {
				return s1.substring(0, i);
			}
		}
		return s1.substring(0, smallString);
	}
}
