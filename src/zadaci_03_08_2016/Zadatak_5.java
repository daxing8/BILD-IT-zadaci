
/***************************************************************************************************************************
 * 																														   *	
 * 	Implementirati sljedeæu metodu da sortira redove u 2D nizu.															   *
 *																														   *	
 *	public static double[ ][ ] sortRows(double[ ][ ] array)																   *	
 *																														   *			
 *	Napisati testni program koji pita korisnika da unese 3x3 matricu (ili da pita korisnika koliku matricu želi unijeti)   *
 *	te mu ispisuje na konzoli matricu sa sortiranim redovima - od najmanjeg broja do najveæeg.  						   *	
 * 																														   *		
 * 																														   *			
 ***************************************************************************************************************************/


package zadaci_03_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_5 {

	// Metoda prima 2D niz sa decimalnim vrijednostima kao argument
	public static double[][] sortRows(double[][] array) {

		// Kreiranje jednodimenzionalnog niza velicine 3x3 matrice
		double[] nizZaSortiranje = new double[3 * 3];

		// Indeks kao odrednica za jednodimenzionalni niz koji se povecava za
		// jedan svakom iteracijom petlje
		int index = 0;

		// Prebacivanje decimalnih vrijednosti iz 2D niza u 1D niz
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				nizZaSortiranje[index] = array[i][j];
				index++;
			}
		}

		// Sortiranje 1D niza metodom iz Arrays klase
		Arrays.sort(nizZaSortiranje);

		// Indeks za 1D niz je ponisten na nulu za ponovnu iteraciju
		index = 0;

		// Prebacivanje sortiranih vrijednosti iz 1D niza u 2D niz
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = nizZaSortiranje[index];
				index++;
			}
		}
		// Metoda vraca sortiran 2D niz
		return array;
	}

	public static void main(String[] args) {

		// Kreiranje scanner objekta za unos podataka od korisnika
		Scanner input = new Scanner(System.in);

		double[][] matrica = new double[3][3];

		// Unos brojeva od korisnika u matricu
		System.out.print("Unesite decimalne brojeve u vasu 3x3 matricu: ");

		for (int row = 0; row < matrica.length; row++) {
			for (int column = 0; column < matrica[row].length; column++) {
				matrica[row][column] = input.nextDouble();
			}
		}

		// Ispisivanje nesortirane matrice na konzoli radi uporedbe
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		input.close();

		// Pozivanje metode za sortiranje matrice
		sortRows(matrica);

		System.out.println("Vasa matrica je sortirana: \n");

		// Ispisivanje sortirane matrice na konzoli
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}
}
