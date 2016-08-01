package zadaci_01_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Unesite String: ");
		String userInput = input.nextLine().toUpperCase();

		// String samoglasnika za uporedjivanje sa unesenim Stringom
		String samoglasnici = "AEIOU";

		// Brojaci samoglasnika i suglasnika koji se pojavljuju
		int brojacSamoglasnika = 0;
		int brojacSuglasnika = 0;

		// Varijabla karakter sluzi kao odrednica za uporedbu sa samoglasnicima
		for (int i = 0; i < userInput.length() - 1; i++) {
			char karakter = userInput.charAt(i);
			if (samoglasnici.indexOf(karakter) >= 0) { // provjerava da li je
														// karakter na tom
														// indexu samoglasnik,
														// ako vrati vrijednost
														// ispod nule znaci da
														// nije samoglasnik
				brojacSamoglasnika++;
			} else if (Character.isLetter(karakter)) {// Ako nije samoglasnik, a
														// slovo je onda mora
														// biti suglasnik
				brojacSuglasnika++;
			}
		}

		System.out.println("Broj samoglasnika u Stringu je: " + brojacSamoglasnika);
		System.out.println("Broj suglasnika u Stringu je: " + brojacSuglasnika);

		input.close();
	}
}
