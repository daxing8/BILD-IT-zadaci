package hangmanAndBattleship;

import java.util.Random;
import java.util.Scanner;

public class Battleship {

	public static void main(String[] args) {

		// 2-D arrays that will store game board and position of ships and 1-D
		// array that stores position of shots
		int[][] board = new int[5][5];
		int[][] ships = new int[3][2];
		int[] shoot = new int[2];

		// Variables store atempt number and hit number
		int attempts = 0;
		int shotHit = 0;

		// Prints empty board with 0s values
		emptyBoard(board);

		// Calls a method to place ships in positions
		initShips(ships);

		System.out.println();

		do {
			// Prints game board
			showBoard(board);

			// Prompts user to enter his move
			shoot(shoot);
			attempts++; // increments number of attempts by one

			// If ship is hit print hint and increment number of hits by one
			if (hit(shoot, ships)) {
				hint(shoot, ships, attempts);
				shotHit++;
			} else
				hint(shoot, ships, attempts);

			// Updates game board with player move
			updateBoard(shoot, ships, board);

			// When player gets 3 hits game is over
		} while (shotHit != 3);

		// Prints game result
		System.out.println("\n\n\nBattleship Java game finished! You hit 3 ships in " + attempts + " attempts");
		showBoard(board);
	}

	// Fills the board with 0 values
	public static void emptyBoard(int[][] board) {
		for (int row = 0; row < 5; row++)
			for (int column = 0; column < 5; column++)
				board[row][column] = 0;
	}

	// Prints the game board
	public static void showBoard(int[][] board) {
		System.out.println("\t1 \t2 \t3 \t4 \t5");
		System.out.println();

		for (int row = 0; row < 5; row++) {
			System.out.print((row + 1) + "");
			for (int column = 0; column < 5; column++) {
				if (board[row][column] == 0) {
					System.out.print("\t" + "-");
				} else if (board[row][column] == 1) {
					System.out.print("\t" + "o");
				} else if (board[row][column] == 2) {
					System.out.print("\t" + "X");
				}

			}
			System.out.println();
		}

	}

	// Randomly selects 3 numbers to be the position of the ships on the board
	public static void initShips(int[][] ships) {

		Random random = new Random();

		for (int ship = 0; ship < 3; ship++) {
			ships[ship][0] = random.nextInt(5);
			ships[ship][1] = random.nextInt(5);

			// If the shot was already made continue the game
			for (int last = 0; last < ship; last++) {
				if ((ships[ship][0] == ships[last][0]) && (ships[ship][1] == ships[last][1]))
					do {
						ships[ship][0] = random.nextInt(5);
						ships[ship][1] = random.nextInt(5);
					} while ((ships[ship][0] == ships[last][0]) && (ships[ship][1] == ships[last][1]));
			}

		}
	}

	// Prompts user for input of row and column for his move
	public static void shoot(int[] shoot) {
		Scanner input = new Scanner(System.in);

		System.out.print("\nRow: ");
		shoot[0] = input.nextInt() - 1;

		System.out.print("Column: ");
		shoot[1] = input.nextInt() - 1;

	}

	// Checks if the ship has been hit
	public static boolean hit(int[] shoot, int[][] ships) {

		// If user input position match ships position it is a hit return true
		for (int ship = 0; ship < ships.length; ship++) {
			if (shoot[0] == ships[ship][0] && shoot[1] == ships[ship][1]) {
				System.out.printf("You hit a ship located in (%d,%d)\n", shoot[0]++, shoot[1]++);
				return true;
			}
		}
		return false;
	}

	// Gives player a hint about amount of ships in row and column he just
	// guessed
	public static void hint(int[] shoot, int[][] ships, int attempt) {
		int row = 0, column = 0;

		for (int line = 0; line < ships.length; line++) {
			if (ships[line][0] == shoot[0])
				row++;
			if (ships[line][1] == shoot[1])
				column++;
		}

		System.out.printf("\nHint %d: \nRow %d -> %d ships\n" + "Column %d -> %d ships\n", attempt, shoot[0] + 1, row,
				shoot[1] + 1, column);
	}

	// Updates the game board every time a move has been made
	public static void updateBoard(int[] shoot, int[][] ships, int[][] board) {
		// If it is a hit or not add the value
		if (hit(shoot, ships))
			board[shoot[0]][shoot[1]] = 2;
		else
			board[shoot[0]][shoot[1]] = 1;
	}
}
