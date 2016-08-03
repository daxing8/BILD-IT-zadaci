
/********************************************************************************************************************
 * 																													*	
 * Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi elementi na istim pozicijama jednaki. 			*
 * Napisati metodu koja vraæa true ukoliko su nizovi niz1 i niz2 striktno identièni. Koristiti sljedeæi header:		*
 *																													*
 *	public static boolean equals(int[ ] niz1, int[ ] niz2)															*	
 *																													*
 *	Napisati testni program koji pita korisnika da unese dva niza cijelih brojeva 									*	
 *	te provjerava da li su striktno identièni.   																	*	
 *																													*
 *******************************************************************************************************************/
 

package zadaci_03_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_3 {
	
	//Metoda prima dva niza cjelih brojeva kao argument
	public static boolean equals(int[] niz1, int[] niz2) {
		
		//Metoda vraca true ako su niz1 i niz2 identicni i false ako nisu
		return Arrays.equals(niz1, niz2);
	}

	public static void main(String[] args) {
		
		//Korisnik unosi prvi niz cjelobrojnih vrijednosti
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite prvi niz od 5 cijelih brojeva: ");
		
		//Kreiranje niza za unos elemenata od korisnika
		int[] niz1 = new int[5];
		
		//Unos cijelobrojnih vrijednosti od korisnika u niz
		for (int i = 0; i < niz1.length; i++) {
			niz1[i] = input.nextInt();
		}
		
		//Korisnik unosi drugi niz cjelih brojeva
		System.out.println("Unesite drugi niz od 5 cijelih brojeva: ");
		
		//Kreiranje drugog niza za unos korisnika
		int[] niz2 = new int[5];
		
		//Unos cjelobrojnih vrijednosti od korisnika u niz
		for (int i = 0; i < niz2.length; i++) {
			niz2[i] = input.nextInt();
		}
		
		//Ispisivanje rezultata na konzoli pozivom na metodu equals(niz1, niz2) te koristenjem ternarnog operatora 
		System.out.println("Dva niza koje ste unijeli " + (equals(niz1, niz2) ? "su" : "nisu") + " identicni");
		
		
		input.close();
	}

}
