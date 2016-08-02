package zadaci_02_08_2016;

public class Zadatak_1 {

	public static void main(String[] args) {

		int brojac = 0;
		int redovi = 0;

		// Provjera svake godine pojedinacno da li je prestupna
		for (int godina = 101; godina < 2100; godina++) {

			// Odredjivanje da li je godina prestupna formulom za provjeru
			// prestupne godine
			// Ukoliko je godina djeljiva sa 4 i nije djeljiva sa 100 ili ako je
			// djeljiva sa 400, ali ne i sa 100
			if ((godina % 4 == 0) && (godina % 100 != 0) || (godina % 400 == 0)) {

				brojac++; // brojac se povecava svaki puta kada je godina
							// prestupna i daje tacan broj prestupnih godina
				
				redovi++; // broj redova se poveceava svaki puta kada je
							// prestupna godina
				
				System.out.print(godina + " "); //Ispis godine na konzoli sa razmakom
				
			}
			//Kada je broj godina dosegao 10 listanje se prebacuje u sljedeci red 
			if (redovi == 10) {
				System.out.println();
				
				//broj godina po jednom redu se ponistava na nula
				redovi = 0;
			}
		}
		System.out.println();

		//Ispis tacnog broja prestupnih godina od 101 do 2100 godine
		System.out.println("\n Broj prestupnih godina iznosi: " + brojac); 	}

}
