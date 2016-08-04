
/************************************************************************************************************
 * 
 * Napisati program koji pita korisnika da unese neki cijeli broj 
 * te ispisuje njegove najmanje faktore u rastuæem redosljedu. 
 * Na primjer, ukoliko korisnik unese 120 program treba da ispiše 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)
 *
 ************************************************************************************************************/

package zadaci_04_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {

		// Kreiranje Scanner objekta za unos broja od korisnika
		Scanner input = new Scanner(System.in);

		// Korisnik unosi cijeli broj
		System.out.println("Unesite cijeli broj: ");

		int cijeliBroj = input.nextInt();

		// Brojevi ce biti pohranjeni u ArrayLisu zbog varirajuceg broja prostih
		// faktora zavisno od broja koji je korisnik unijeo
		ArrayList<Integer> faktori = new ArrayList<>();

		// Petlja krece od broja 2 zato sto su svi brojevi djeljivi sa 1
		for (int i = 2; i < cijeliBroj; i++) {

			// Ako je broj djeljiv sa cijelim brojem ciji se faktori traze
			// dodaje se u Array listu i cijeli broj se dijeli sa tim brojem
			while (cijeliBroj % i == 0) {
				faktori.add(i);
				cijeliBroj /= i;
			}
		}
		// Ostatak od svih djeljenja je posljednji najmanji faktor broja i
		// ukoliko je on veci od 1 dodaje se u ArrayListu
		if (cijeliBroj > 1) {
			faktori.add(cijeliBroj);
		}
		
		input.close();
		
		
		System.out.println("Najmanji faktori broja su: \n");
		
		//Ispis najmanjih faktora datog broja na konzoli
		for (Integer brojevi : faktori) {
			System.out.print(brojevi + " ");
		}
	}
}
