package zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void brojOdgovora(int brojPitanja) { // Metoda prima jedan
														// argument, broj
														// pitanja

		Scanner input = new Scanner(System.in);

		int broj1;
		int broj2;

		int tacniOdgovori = 0;
		int netacniOdgovori = 0;

		// Kreiranje dva random broja metodom Math.random
		for (int i = 0; i < brojPitanja; i++) {
			broj1 = (int) (Math.random() * 10);
			broj2 = (int) (Math.random() * 10);

			// Zamjena brojeva ukliko je prvi manji od drugog, zbog izbjegavanja
			// negativnih brojeva i gresaka u oduzimanju
			if (broj1 < broj2) {
				int temp = broj1;
				broj1 = broj2;
				broj2 = temp;
			}

			// Ispis pitanja korisniku
			System.out.print("Koliko je " + broj1 + " - " + broj2 + " ? ");

			// Unos odgovora od korisnika
			int odgovor = input.nextInt();

			// Ako je odgovor tacan povecati brojac tacnih odgovora za 1
			if (broj1 - broj2 == odgovor) {
				tacniOdgovori++;
			} else

				// U drugom slucaju odgovor je netacan i brojac za netacne
				// odgovore se povecava za 1
				netacniOdgovori++;
		}

		// Ispis tacnih i netacnih brojeva
		System.out.println("Broj tacnih odgovora je: " + tacniOdgovori);
		System.out.println("Broj netacnih odgovora je: " + netacniOdgovori);

		input.close();
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite broj pitanja koje zelite: ");

		//Korisnik unosi broj pitanja koji zeli
		int brojPitanja = input.nextInt(); 
		
		//Poziva se metoda koja racuna postavlja pitanja te ispisuje broj tacnih i netacnih odgovora
		brojOdgovora(brojPitanja);

		input.close();
	}
}
