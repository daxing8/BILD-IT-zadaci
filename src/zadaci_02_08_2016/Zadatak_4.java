package zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak_4 {

	public static void printMatrix(int n) {

		// Kreiranje dvodimenzionalnog niza ili matrice prema broju od korisnika
		int[][] matrix = new int[n][n];

		// Dvostruka petlja prolazi kroz citavu matricu i dodjeljuje random broj
		// 0 ili 1 na svaki index matrice
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 2);
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();

		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite jednocifren broj: ");

		// Unos jednocifrenog broja od korisnika koji ce odrediti velicinu matrice
		int unos = input.nextInt();

		// Poziv metode koja kreira, popunjava i ispisuje matricu random brojevima
		printMatrix(unos);

		input.close();
	}
}
