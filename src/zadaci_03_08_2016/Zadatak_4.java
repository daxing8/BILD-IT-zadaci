
/*****************************************************************************************************************
 * 																												 *	
 * 	Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu. 											 *	
 * 																												 *
 * 	Metoda treba da koristi sljedeæi header:																	 *
 *																												 *			
 * 	public static int[ ] locateLargest(double[ ][ ] a)															 *
 *																												 *				
 * 	Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje lokaciju najveæeg elementa u nizu.	 *
 *																												 *
 *****************************************************************************************************************/


package zadaci_03_08_2016;

import java.util.Scanner;

public class Zadatak_4 {
	//Metoda prima niz decimalnih vrijednosti kao argument
	public static int[] locateLargest(double[][] a) {
		
		//Dodjeljivanje varijabli najveciBroj prvi element niza kao odrednicu
		double najveciBroj = a[0][0];
		
		//Kreiranje dvije varijable u koje ce se pohraniti 
		//indeks reda i kolone najveceg elementa u 2D nizu
		int indeksReda = 0;
		int indeksKolone = 0;
		
		//
		for (int row = 0; row < a.length; row++) {
			double iduciBroj = 0;
			
			//Dodjeljivanje svakog zasebno elementa u 2D nizu na varijablu iduciBroj
			for (int column = 0; column < a[row].length; column++) {
				iduciBroj = a[row][column];
				
				//Ako je element na toj lokaciji u 2D nizu veci od predhodnog elementa
				//onda se ta vrijednost dodjeljuje varijabli najveciBroj
				//kao i indeksima reda i kolone 
				if (iduciBroj > najveciBroj) {
					najveciBroj = iduciBroj;
					indeksReda = row;
					indeksKolone = column;

				}
			}
		}
		//Metoda vraca novi niz sa indeksom reda i kolone najveceg elementa u nizu
		return new int[] { indeksReda, indeksKolone };
	}

	public static void main(String[] args) {
		
		//Kreiranje scanner objekta za unos podataka od korisnika
		Scanner input = new Scanner(System.in);
		
		//Korisnik unosi broj redova i kolona koje zeli na sadrzi njegov 2D niz
		System.out.println("Unesite broj redova i broj kolona koje zelite: ");
		
		//
		int brojRedova = input.nextInt();
		int brojKolona = input.nextInt();

		double[][] matrica = new double[brojRedova][brojKolona];
		
		//Unos brojeva od korisnika u niz
		System.out.println("Unesite decimalne brojeve u vas niz: ");
		for (int row = 0; row < matrica.length; row++) {
			for (int column = 0; column < matrica[row].length; column++) {
				matrica[row][column] = input.nextDouble();
			}
		}
		input.close();
		//Ispisivanje 2D niza na konzoli radi bolje preglednosti za korisnika
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//Dodjeljivanje rezultata metode nakon sto je pozvana u 1D niz
		int[] najveci = locateLargest(matrica);
		
		
		//Ispisivanje rezultata koji metoda vraca na konzoli
		System.out.println("Lokacija najveceg elementa u 2D nizu je: " + " Index reda: " + najveci[0] + "\t Index kolone: " + najveci[1]);
	}
}
