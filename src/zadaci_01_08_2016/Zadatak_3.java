package zadaci_01_08_2016;

import java.util.Scanner;

public class Zadatak_3 {

	public static int zajednickiDjelilac(int djelilac1, int djelilac2) {
		int rezultat = 0;

		// petlja radi sve dok drugi djelilac ne postane 0
		while (djelilac2 != 0) {
			// Ukoliko je drugi djelilac veci broj od prvog djelioca onda se
			// zamjene mjesta
			if (djelilac2 < djelilac1) {

				int temp = djelilac1;
				djelilac1 = djelilac2;
				djelilac2 = temp;
			}

			// metodom uzastopnog djeljenja gdje se podjeli prvo veci broj sa
			// manjim, zatim manji broj iz prvog djeljenja sa ostatkom djeljenja
			// cime se dobija najveci djelilac dva broja
			
			rezultat = djelilac1 % djelilac2;
			djelilac2 %= rezultat;

		}
		return rezultat;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Unesite prvi djelilac: ");
		int broj1 = input.nextInt();
		System.out.print("Unesite drugi djelilac: ");
		int broj2 = input.nextInt();

		// ispis metode na konzoli
		System.out.println("Najveci zajednicki djelilac brojeva " + broj1 + " i " + broj2 + " jeste "
				+ zajednickiDjelilac(broj1, broj2));

		input.close();
	}
}
