
/****************************************************************************************************************	
 * 
 * Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji ima godišnju interesnu stopu od 5%. 
 * Mjeseèna interesna stopa je stoga 0.05 / 12 = 0.00417. 
 * Nakon prvog mjeseca vrijednost na raèunu postaje 100 * (1 + 0.00417) = 100.417. 
 * Nakon drugog mjeseca, vrijednost na raèunu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. 
 * Nakon treæeg mjeseca, vrijednost na raèunu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
 * Napisati program koji pita korisnika 
 * da unese mjeseèni iznos štednje te broj mjeseci nakon kojeg bi želio znati stanje raèuna.
 *  
****************************************************************************************************************/


package zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_1 {
	
	public static void main(String[] args) throws InputMismatchException {
		
		//Kreiranje scanner objekta za unos podataka od korisnika
		Scanner input = new Scanner(System.in);
		
		//Try catch blok prihvata gresku u unosu podataka od korisnika
		try {
			//Unos podataka od korisnika, iznos mjesecne stednje
			System.out.println("Unesite iznos vase mjesecne stednje: ");
			int mjesecnaUplata = input.nextInt();
			
			//Metoda provjerava da li je korisnik unjeo negativan broj i salje poruku o greski
			pogresanUnos(mjesecnaUplata);
			
			//Unos podataka od korisnika, broj mjeseci 
			System.out.println("Unesite broj mjeseci nakon kojih zelite znati stanje vaseg racuna: ");
			int brojMjeseci = input.nextInt();
			
			//Metoda provjerava da li je korisnik unjeo negativan broj i salje poruku o greski
			pogresanUnos(brojMjeseci);
			
			//Zatvaranje Scanner objekta
			input.close();
			
			//Racunanje mjesecne kamate djeljenjem kamatne stope sa brojem mjeseci
			double mjesecnaKamata = 0.05 / brojMjeseci;
			
			//Varijabla za pohranjivanje ukupnog iznosa
			double ukupanIznos = 0;
			
			
			//Pohranjivanje mjesecne uplate za svaki mjesec posebno pomocu formule
			for (int i = 0; i < brojMjeseci; i++) {
				ukupanIznos = (mjesecnaUplata + ukupanIznos) * (1 + mjesecnaKamata);

			}
			//Ispis formatire cifre ukupnog iznosa kamate za korisnika
			System.out.printf("Iznos na vasem racunu ce iznositi: %7.2f", ukupanIznos);
		
			//Catch blok hvata mogucu gresku u unosu podataka i ispisuje poruku upozorenja
		} catch (InputMismatchException e) {
			System.out.println("Vas unos nije tacan. Pokusajte ponovo. ");
		}

	}
	//Metoda provjerava da li je uneseni broj negativan broj ili nula i baca novi exeption
	public static int pogresanUnos(int unos) {
		if (unos <= 0) {
			throw new InputMismatchException();
		}
		return unos;
	}
}
