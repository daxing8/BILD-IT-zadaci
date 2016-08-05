
/**************************************************************************************************
 * 
 * Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52 karte. 
 * Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) 
 * te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka). 
 * Primjer: Karta koju ste izvukli je 10 u znaku kocke.
 * 
***************************************************************************************************/

package zadaci_05_08_2016;

public class Zadatak_2 {

	public static void main(String[] args) {

		// Kreiranje niza tipa String koji sadrzava sve velicine karata u spilu
		String[] velicinaKarte = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		// Kreiranje niza tipa String koji sadrzava sve boje karata u spilu
		String[] bojaKarte = { "Pik", "Tref", "Karo", "Herc" };

		System.out.println("Vasa random karta je: \n");

		// Ispis velicine i boje karata upotrebom metode Math.random koja
		// ispisuje velicinu i boju karte na random indeksu niza
		System.out.println("\t" + velicinaKarte[(int) (Math.random() * velicinaKarte.length)] + " "
				+ bojaKarte[(int) (Math.random() * bojaKarte.length)]);
	}
}
