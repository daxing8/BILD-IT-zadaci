package zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Zadatak_1 {
	public static Integer max(ArrayList<Integer> list) {
		// ukoliko lista sadrzi 0 elemenata ili je prazna vratiti null
		if (list.isEmpty() || list == null) {
			return null;
			// vraca najveci broj u ArrayListi upotrebom metode max() u klasi
			// Collections
		} else
			return Collections.max(list);
	}

	public static void main(String[] args) {

		// kreiranje Array-a radi lakseg unosa brojeva u ArrayListu
		Integer[] array = { 21, 15, 22, 12, 4, 8, 44, 45, 32, 56, 56, 33,56 };

		// kreiranje ArrayListe te prenosenje brojeva iz Array-a u ArrayListu
		// upotrebom metode asList() koja se nalazi u Arrays klasi
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

		// ispis najvece vrijednosti u ArrayListi
		System.out.println("Najveci broj u listi je: " + max(list));
	}
}
