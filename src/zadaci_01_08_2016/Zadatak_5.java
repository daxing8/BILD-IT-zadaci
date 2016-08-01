package zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Unesite niz brojeva (0 prekida unos): ");
		int unosBrojeva;
		// ArrayLista u koju ce biti pohranjeni brojevi, jer broj unosa nije
		// poznat

		ArrayList<Integer> brojevi = new ArrayList<>();

		// Varijable za brojanje najveceg broja i koliko se on puta ponavlja
		int count = 0;
		int max = 0;

		// Unos brojeva u ArrayListu, nula prekida unos
		do {
			unosBrojeva = input.nextInt();
			brojevi.add(unosBrojeva);

		} while (unosBrojeva != 0);

		// Kreiranje novog Array-a za prebacivanje brojeva
		Integer[] array = new Integer[brojevi.size()];

		// Prebacivanje brojeva iz ArrayListe u Array zbog lakseg manipulisanja
		// brojevima putem petlje
		brojevi.toArray(array);

		// Ukoliko je svaki sljedeci broj veci od prethodnog dodjeliti ga max, a
		// ukoliko je isti povecati brojac za 1
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} else if (array[i] == max) {
				count++;
			}
		}
		input.close();

		// Ispis rezultata u konzoli
		System.out.println("Najveci broj u nizu je: " + max);
		System.out.println("Broj ponavljanja najveceg broja je: " + count);
	}
}
