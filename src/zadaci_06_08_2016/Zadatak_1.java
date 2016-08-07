
/*********************************************************************************************************************
 * 
 * Napisati program koji uèitava iznos investicije, 
 * godišnju interesnu stopu i broj godina te vraæa buduæu vrijednost investicije koristeæi se sljedeæom formulom: 
 * 
 * buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. 
 * 
 * Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godišnju interesnu stopu i 
 * 1 kao broj godina program vam vraæa 1032.98 kao buducu vrijednost investicije.
 * 
 *********************************************************************************************************************/



package zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) throws InputMismatchException {

		// Kreiranje scanner objekta za unos podataka od korisnika
		Scanner input = new Scanner(System.in);

		// Try catch blok prihvata gresku u unosu podataka od korisnika
		try {
			// Unos podataka od korisnika, iznos investicije
			System.out.println("Unesite iznos vase investicije: ");
			int iznosInvesticije = input.nextInt();

			// Metoda provjerava da li je korisnik unjeo negativan broj i salje
			// poruku o greski
			pogresanUnos(iznosInvesticije);

			// Unos podataka od korisnika, broj mjeseci
			System.out.println("Unesite godisnju kamatnu stopu: ");
			double godisnjaKamatnaStopa = input.nextDouble() / 100;

			// Unos podataka od korisnika, iznos investicije
			System.out.println("Unesite broj godina: ");
			int brojGodina = input.nextInt();

			// Metoda provjerava da li je korisnik unjeo negativan broj i salje
			// poruku o greski
			pogresanUnos(brojGodina);

			// Zatvaranje Scanner objekta
			input.close();

			// Racunanje mjesecne kamatne stope
			double mjesecnaKamatnaStopa = godisnjaKamatnaStopa / 12;

			// Varijabla za pohranjivanje ukupnog iznosa
			double buducaVrijednostInvesticije = iznosInvesticije
					* Math.pow((1 + mjesecnaKamatnaStopa), (brojGodina * 12));

			// Ispis rezultata na konzoli
			System.out.printf("Buduca vrijednost vase investicije iznosi: %7.2f", buducaVrijednostInvesticije);

			// Catch blok hvata mogucu gresku u unosu podataka i ispisuje poruku
			// upozorenja
		} catch (InputMismatchException e) {
			System.out.println("Vas unos nije tacan. Pokusajte ponovo. ");
		}

	}

	// Metoda provjerava da li je uneseni broj negativan broj ili nula i baca
	// novi exeption
	public static void pogresanUnos(int unos) {
		if (unos <= 0) {
			throw new InputMismatchException();
		}

	}
}
