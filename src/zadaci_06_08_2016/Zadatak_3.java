
/********************************************************************************************************************************** 
 * 
 * Napisati metode sa sljedeæim headerima: public static int reverse(int number) i public static boolean isPalindrome(int number). 
 * Prva metoda prima cijeli broj kao argument i vraæa isti ispisan naopako. (npr. reverse(456) vraæa 654.) 
 * Druga metoda vraæa true ukoliko je broj palindrom a false ukoliko nije. 
 * Koristite reverse metodu da implementirate isPalindrome metodu. 
 * Napišite program koji pita korisnika da unese broj te mu vrati da li je broj palindrome ili ne. 
 * 
 *********************************************************************************************************************************/

package zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_3 {

	// Metoda main baca Exeption za pogrsan unos od korisnika
	public static void main(String[] args) throws InputMismatchException {

		// try catch block obuhvata dio koda gdje bi se mogla dogoditi greska i
		// hvata Exeption
		try {

			// Kreiran Scanner objekt za unos podataka od korisnika
			Scanner input = new Scanner(System.in);

			// Ipsis poruke korisniku da unese trocifreni broj
			System.out.println("Unesite trocifreni broj: ");

			int number = input.nextInt();// unos podataka od korisnika

			// Poziv metode koja provjerava da li je broj 0, ako jeste ona baca
			// Exeption i ispisuje poruku o greski
			isZero(number);

			// Ispisuje na konzoli da li je broj palindrome ili nije pozivajuci
			// metodu koja provjerava i vraca true ili false
			System.out.println("Broj koji ste unijeli " + (isPalindrome(number) ? "je" : "nije") + " palindrom.");
			
			
			//Scanner objekt je zatvoren
			input.close();
			
			// catch blok hvata exeption i ispisuje poruku o pogresnom unosu i
			// prekida dalje izvrsenje programa
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos! Unesite samo cijele brojeve!");
		}

	}

	// Metoda prima jedan broj tipa int kao argument i provjerava da li je
	// uneseni broj 0
	public static void isZero(int number) {

		// Ako je broj 0 baci Exeption
		if (number == 0) {
			throw new InputMismatchException("Unos ne moze biti nula!");
		}
	}

	// Metoda reverse prima broj tipa int i okrece cifre broja u obrnuti
	// redosljed
	public static int reverse(int number) {

		// Varijable koje ce pohranjivati ostatak broja i konacni rezultat
		int remainingNumber = 0;
		int result = 0;

		// Petlja se vrti sve dok broj ne bude nula
		while (number != 0) {

			// Posljednja cifra broja se pohranjuje na varijablu remainingNumber
			remainingNumber = number % 10;

			// Varijabli result se dodjeljuje jedna po jedna cifra broja u
			// obrnutom redosljedu
			result = result * 10 + remainingNumber;

			// Broj se smanjuje za jednu cifru broja dok ne postane 0
			number /= 10;
		}
		// Metoda vraca rezultat
		return result;

	}

	// Metoda prima cijeli broja kao argument i provjerava da li je broj
	// palindrome
	public static boolean isPalindrome(int number) {

		// Ako broj u obrnutom redosljedu nije isti kao broj uneseni broj onda
		// nije palindrome i vraca se false
		if (reverse(number) != number) {
			return false;

			// Ukoliko jeste onda metoda vraca true
		} else {

			return true;
		}
	}
}
