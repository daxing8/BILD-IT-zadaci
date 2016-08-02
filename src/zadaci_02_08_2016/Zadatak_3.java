package zadaci_02_08_2016;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Zadatak_3 {

	// Exeption koji se baca je ukoliko neko unese ime fila koji ne postoji
	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(System.in);

		System.out.print("Unesite ime file-a: ");

		// Korisnik unosi ime file-a
		String imeFile = input.next();

		// Kreiranje file-a pomocu kojeg ce se ucitati file koji korisnik unese
		File file = new File(imeFile);

		// Pomocu skenera citamo uneseni file
		Scanner citajFile = new Scanner(file);

		int brojRijeci = 0;
		int brojKaraktera = 0;
		int brojLinija = 0;

		// Pomocu metode hasNextLine provjeravamo koliko ima linija texta u
		// dokumentu i povecavamo brojac za 1
		while (citajFile.hasNextLine()) {
			brojLinija++;

			// Kreiranje Stringa koji ce cuvati text i podatke iz file-a koji se
			// ucitava od korisnika
			String linijeFile = citajFile.nextLine();

			// Provjeravanje karaktera sa izuzetkom whitespace-a koji necemo
			// brojati, za svaki karakter brojac se inkrementuje za 1
			for (int i = 0; i < linijeFile.length(); i++) {
				if (linijeFile.charAt(i) != ' ') {
					brojKaraktera++;
				}
			}
			
			//Array Stringova koji razvaja svaku rijec u poseban string kada naidje na razmak ili whitespace 
			String[] rijeci = linijeFile.split(" ");
			brojRijeci += rijeci.length;
		}
		
		input.close();
		citajFile.close();

		//Ispis broja karaktera, linija i rijecu u konzoli
		System.out.println("Broj karaktera u file-u je: " + brojKaraktera);
		System.out.println("Broj rijeci u file-u je: " + brojRijeci);
		System.out.println("Broj linija u file-u je: " + brojLinija);
	}

}
