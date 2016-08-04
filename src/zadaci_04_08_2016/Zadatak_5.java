
/************************************************************************************************
 * 
 * 	Napisati program koji uèitava neodreðeni broj cijelih brojeva (nula prekida unos) 
 * 	te ispisuje koliko je brojeva bilo iznad ili jednako prosjeku svih unešenih brojeva 
 * 	a koliko je bilo brojeva ispod prosjeka. 
 * 	
 * Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti 100.
 * 
 * 
 ************************************************************************************************/


package zadaci_04_08_2016;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		
		//Kreiran Scanner objekt za unos podataka od korisnika 
		Scanner input = new Scanner(System.in);
		
		//Ispis poruke korisniku da unese niz cijelih brojeva 
		System.out.println("Unesite niz cijelih brojeva (0 prekida unos): ");
		
		//Kreiranje niza u koji ce se pohraniti svi brojevi max 100
		int[] array = new int[100];
		
		//Varijabla u koju ce se sabrati svi uneseni brojevi
		int prosjek = 0;
		
		//Varijabla koja broji koliko je brojeva uneseno 
		int djelilac = 0;
		
		//Unos brojeva u niz (0 prekida unos)
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			if (array[i] == 0) {
				break;
			}
			//Svaki broj se sabira sa sljedecim i pohranjuje u varijablu prosjek
			prosjek += array[i];
			
			//Djelilac se inkrementuje za 1
			djelilac++;

		}
		
		input.close();
		
		
		//Brojac brojeva ispod prosjeka
		int brojacIspod = 0;
		
		//Brojac brojeva jednako i iznad prosjeka
		int brojacIznad = 0;
		
		//Racunanje prosjeka zbir svih brojeva podjeljen sa brojem cifara
		prosjek /= djelilac;
		
		//Ako je broj manji od prosjeka, brojac brojeva ispod prosjeka se povecava za 1
		for (int i = 0; i < djelilac; i++) {
			if (array[i] < prosjek) {
				brojacIspod++;
				
				//Ukoliko je broj veci ili jednak prosjeku brojac brojeva jednakih ili vecih od prosjeka se povecava
			} else if (array[i] >= prosjek) {
				brojacIznad++;
			}
		}
		
		//Ispis svih rezultata na konzoli
		System.out.println("Prosjek brojeva iznosi: " + prosjek);
		System.out.println("Kolicina brojeva iznad ili jednaki prosjeku: " + brojacIznad);
		System.out.println("Kolicina brojeva ispod prosjeka iznosi: " + brojacIspod);
	}
}
