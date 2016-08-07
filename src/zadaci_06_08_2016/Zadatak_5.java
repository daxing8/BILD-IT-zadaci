
/********************************************************************************************************************
 * 
 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeæe v, 
 * možemo izraèunati minimalnu dužinu piste potrebne da avion uzleti koristeæi se sljedeæom formulom: 
 * 
 * dužina = v * v / 2a. 
 * 
 * Napisati program koji pita korisnika da unese v u m/s i a u m/s2 te ispisuje korisniku minimalnu dužinu piste. 
 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje dužina piste je 514.286)
 * 
 ********************************************************************************************************************/


package zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_5 {

	// Main metoda baca Exeption pogresnog unosa podataka od korisnika
	public static void main(String[] args) throws InputMismatchException {

		// try catch block hvata Exeption i ispisuje poruku upozorenja
		try {

			// Kreiranje scanner objekta za unos podataka od korisnika
			Scanner input = new Scanner(System.in);

			// Ispis poruke korisniku da unese brzinu aviona
			System.out.println("Unesite brzinu pri kojoj avion uzlijece u m/s: ");
			double v = input.nextDouble();

			// Pozivanje metode koja provjerava da li je unos negativan broj
			negativeInput(v);

			// Ispis poruke korinsiku da unese
			System.out.println("Unesite ubrzanje aviona u m/s2: ");
			double a = input.nextDouble();

			// Pozivanje metode koja provjerava da li je unos negativan broj

			// Formula za izracunavanje duzine piste pomocu dobijenih podataka
			// od korisnika
			double duzinaPiste = (v * v) / (2 * a);
			
			//Ispisivanje rezultata na konzoli
			System.out.printf("Minimalna duzina piste da avion poleti je: %7.3f", duzinaPiste);

			// Scanner je zatvoren
			input.close();

			// catch blok hvata Exeption, prekida dalji unos i ispisuje poruku
			// upozorenja
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos! Molim vas unesite samo cijele brojeve!");
		}

	}

	// Metoda prima cijeli broj kao argument i provjerava da li je broj
	// negativan ili nula
	public static void negativeInput(double unos) {

		// Ako je broj negativan baca Exeption i vraca unos
		if (unos <= 0) {
			throw new InputMismatchException();
		}

	}
}
