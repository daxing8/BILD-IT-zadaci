package zadaci_01_08_2016;

public class Zadatak_4 {

	public static void main(String[] args) {
		// Array koji ce primiti 100 random brojeva
		int[] nizBrojeva = new int[100];

		// Array koji broji koliko puta se koji broj ponovio
		int[] brojacBrojeva = new int[10];

		// Dodjeljivanje random brojeva u Array
		for (int i = 0; i < nizBrojeva.length; i++) {
			nizBrojeva[i] = (int) (Math.random() * 10);

		}
		// Indexi prve petlje sluze kao brojevi od 0-9
		for (int i = 0; i < brojacBrojeva.length; i++) {
			// Kada je broj indexa jednak broju koji se ponavlja brojac se
			// poveceava na tom indexu
			for (int j = 0; j < nizBrojeva.length; j++) {
				if (i == nizBrojeva[j]) {
					brojacBrojeva[i]++;
				}
			}
		}
		//Ispis brojeva i broja ponavljanja
		for (int i = 0; i < brojacBrojeva.length; i++) {
			System.out.println("Broj " + i + " se ponavlja: " + brojacBrojeva[i] + " puta");
		}

	}
}
