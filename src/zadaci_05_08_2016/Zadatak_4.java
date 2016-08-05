
/*Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu. */


package zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_4 {
	
	// Main metoda baca Exeption pogresnog unosa podataka od korisnika
	public static void main(String[] args) throws InputMismatchException{
		
		// try catch block hvata Exeption i ispisuje poruku upozorenja
		try {
			
			// Kreiranje scanner objekta za unos podataka od korisnika
			Scanner input = new Scanner(System.in);
			
			// Ispis poruke korisniku da unese 10 cijelih brojeva
			System.out.println("Unesite 10 cijelih brojeva: ");
			
			//Kreiranje niza za 10 brojeva tipa int
			int[] nizBrojeva = new int[10];
			
			//Unos podataka od korisnika u niz 
			for (int i = 0; i < nizBrojeva.length; i++) {
				nizBrojeva[i] = input.nextInt();
				//Poziv metode koja provjerava da li je unos negativan broj ili je nula
				negativeInput(nizBrojeva[i]);
			}
			
			//Scanner za unos podataka je zatvoren
			input.close();
			
			//Ispis poruke korisniku na konzoli
			System.out.println("Uneseni brojevi u obrnutom redosljedu: ");
			
			//Poziv metode koja vraca niz brojeva u obrnutom slijedu
			reverseNumbers(nizBrojeva);
			
			//catch blok hvata Exeption, prekida unos i ispisuje poruku upozorenja
		} catch (InputMismatchException e) {
			System.out.println("Greska u unosu! Unesite samo cijele pozitivne brojeve. ");
		}

	}
	
	//Metoda prima jedan niz cjelih brojeva tipa int i ispisuje brojeve u obrnutom redosljedu
	public static void reverseNumbers(int[] niz) {
		
		//Ispis brojeva u obrnutom redosljedu
		for (int i = niz.length - 1; i >= 0; i--) {
			System.out.print(niz[i] + " ");
		}
	}
	
	//Metoda prima cijeli broj kao argument i provjerava da li je broj negativan ili nula
	public static int negativeInput(int unos) {
		
		//Ako je broj negativan baca Exeption i vraca unos
		if (unos <= 0) {
			throw new InputMismatchException();
		}
		return unos;
	}

}
