
/******************************************************************************************************************************
 * ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva: 
 * 
 * 		d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. 
 * 
 * Posljednji broj, d10, služi kao checksum i njega izraèunavamo iz prvih devet brojeva koristeæi se sljedeæom formulom: 
 * 
 * 		(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. 
 * 
 * Ukoliko je checksum 10, zadnji broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom. 
 * 
 * Napisati program koji pita korisnika da unese prvih 9 brojeva te ispiše desetocifreni ISBN-10 broj. 
 * 
 * (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj. 
 * 
 * Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)
 * 
 * 
 * ****************************************************************************************************************************/

package zadaci_04_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		// Kreiramo scanner objekt za unos podataka od korisnika
		Scanner input = new Scanner(System.in);
		
		//Ispisujemo korisniku poruku da unese prvih 9 cifri ISBN broja
		System.out.println("Unesite prvih devet cifri ISBN broja kao cijele brojeve: ");
		
		//Kreiramo niz u koji ce se pohranjivati uneseni brojevi
		int[] brojevi = new int[9];
		
		//Varijabla u koju ce se pohraniti 10 cifra ISBN broja
		int desetiBroj = 0;
		
		//Unos brojeva od strane korisnika
		for (int i = 0; i < brojevi.length; i++) {
			brojevi[i] = input.nextInt();
		}
		
		//Zatvaramo scanner objekt
		input.close();
		
		//Dodajemo sve brojeve iz unesenog niza na varijablu za deseti broj koristeci se formulom
		for (int i = 0; i < brojevi.length; i++) {
			desetiBroj += brojevi[i] * (i + 1);
		}
		
		//Formulom zbrojene cifre djelimo pomocu modula sa brojem 11
		desetiBroj %= 11;
		
		System.out.println("Vas ISBN broj je: ");
		
		//Ispis brojeva iz niza i dodjeljivanje 10 ISBN broja
		for (int temp : brojevi) {
			System.out.print(temp);
		}
		//Ukoliko je deseti broj jednak 10 ispisujemo x, u drugom slucaju ispisuje se deseti broj
		if (desetiBroj == 10) {
			System.out.print("X");
		} else
			System.out.println(desetiBroj);
	}

}
