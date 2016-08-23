
/********************************************************************************************
 *
 *(Game: connect four) Connect four is a two-player board game in which the 
 * players alternately drop colored disks into a seven-column, six-row vertically
 * suspended grid, as shown below.
 * The objective of the game is to connect four same-colored disks in a row, a column,
 * or a diagonal before your opponent can do likewise. The program prompts
 * two players to drop a red or yellow disk alternately. In the preceding figure, the
 * red disk is shown in a dark color and the yellow in a light color. Whenever a disk
 * is dropped, the program redisplays the board on the console and determines the
 * status of the game (win, draw, or continue).
 * 
 ***********************************************************************************************/

package connect4AndTicTacToe;

import java.util.Arrays;
import java.util.Scanner;

public class ConnectFour {
	
	////Array and variables made public static so that they can be used by methods in a class
	public static char[][] gameboard = new char[7][7];
	public static char player = 'R';
	public static int column;
	public static String color = "red";
	
	
	/******************************
	 * Main method
	 ***********************************/
	
	public static void main(String[] args) {
		
		//Fills array with empty space
		for (int i = 0; i < gameboard.length; i++) {
			Arrays.fill(gameboard[i], ' ');
		}
		//Sets game status to true if it changes to false the game stops
		boolean play = true;
		
		//While game is true play
		while (play) {
			
			//Prints the game board
			printBoard();
			
			//Calls method to get user input
			getPlayerInput();
			
			//Checks progress of a game
			//if there is 4 in a row, column or diagonal it stops the game and prints a winner
			if (gameOver() == 'R') {
				System.out.println("Red player wins!");
				play = false;
				break;
			} else if (gameOver() == 'Y') {
				System.out.println("Yellow player wins!");
				play = false;
				break;
			} else if (gameOver() == '-') {
				System.out.println("Game is a draw!");
				play = false;
				break;
			}
		}
	}

	/**********************************
	 * End of Main
	 ***********************************/

	
	/**
	 * Method prints game board
	 */
	public static void printBoard() {
		
		//Prints line before and after every cell in array
		System.out.println();
		for (int i = 0; i < gameboard.length; i++) {
			System.out.print(" | ");
			for (int j = 0; j < gameboard[i].length; j++) {
				System.out.print(gameboard[i][j] + "| ");
			}
			System.out.println();
		}
		System.out.println(" -----------------------");
	}
	/**
	 * Method gets player input from the console
	 */
	
	public static void getPlayerInput() {
		
		//Scanner object for user input created
		Scanner input = new Scanner(System.in);
		
		//Changes player color if it is yellows turn
		if (player == 'Y') {
			color = "yellow";
		}
		
		//Prompts user to enter disc location
		System.out.println("Drop a " + color + " disc at column(1-7): ");
		column = input.nextInt() - 1;
		
		//If user input is not valid propts him to keep entering until input is wright
		while (!isValid()) {	
			System.out.println("Invalid move. Try again.");
			column = input.nextInt() - 1;
		}
		//Calls a method to put the disc in it's position in array
		inputDisc();
		
		//Changes players turn to play
		playerTurn();
		
	}
	
	/**
	 * Inputs players disc in correct location on the board
	 */
	public static void inputDisc() {
		
		//If there is a disc already in the column place this players disc on top of it
		for (int i = 0; i < gameboard.length; i++) {
			if (gameboard[i][column] != ' ') {
				gameboard[i - 1][column] = player;
				break;
			}
		}
		
		//Otherwise if there is nothing in the row place the disk on the bottom
		if (gameboard[gameboard.length - 1][column] == ' ') {
			gameboard[gameboard.length - 1][column] = player;
		}
	}
	/**
	 * Changes players turn to play
	 */
	public static void playerTurn() {

		//If player is set for red change it to yellow player
		if (player == 'R') {
			player = 'Y';
		} else				//Otherwise player is red
			player = 'R';
	}

	/**
	 * Checks user input if it is valid or not
	 * @return
	 */
	public static boolean isValid() {

		// If any of the parameters is not correct return false
		if (column < 0 || column > 6 || gameboard[0][column] != ' ') {
			return false;
		}
		// otherwise return true
		return true;
	}
	
	/**
	 * Checks if there is a winner in a row
	 * @return
	 */
	public static char rowWinner() {
		
		//Checks every row at a time
		for (int row = 0; row < 7; row++) {
			int counter = 0;
			// Checks if the gameboard in row is filled
			for (int column = 1; column < 7; column++) {
				if (gameboard[row][column] != ' ' && gameboard[row][column] == gameboard[row][column - 1]) {
					counter++;
				} else {
					counter = 1;
				}
				// if the counterer is bigger three
				if (counter > 3) {
					// returns the color of the winner
					return gameboard[row][column];
				}
			}
		}
		// If there are no winners in rows returns space
		return 'D';
	}

	public static char columnWinner() {

		for (int column = 0; column < 7; column++) {
			int counter = 0;
			// Checks if the gameboard in column is filled
			for (int row = 1; row < 7; row++) {
				if (gameboard[row][column] != ' ' && gameboard[row][column] == gameboard[row - 1][column]) {
					counter++;
				} else {
					counter = 1;
				}
				// If there are 4
				if (counter > 3) {
					// Returns the color of the winner
					return gameboard[row][column];
				}
			}
		}
		// Returns space if nobody won
		return ' ';
	}

	public static char diagonalWinner() {

		// Checks diagonals from left to bottom
		for (int column = 0; column < 7; column++) {
			int counter = 0;
			// Starts with the first row
			for (int row = 1; row < 6; row++) {
				// If its out of range breaks loop for search
				if (column + row >= 7) {
					break;
				}
				// Checks for same letters in diagonal and counters them
				if (gameboard[row][column + row] != ' '
						&& gameboard[row - 1][column + row - 1] == gameboard[row][column + row]) {
					counter++;
				} else {
					counter = 1;
				}
				if (counter > 3)
					return gameboard[row][column + row];
			}
		}

		// Checks diagonals that go left from rows
		for (int row = 0; row < 6; row++) {
			int counter = 0;
			// Starts with first column
			for (int column = 1; column < 7; column++) {
				// Stops if its out of bounds
				if (column + row >= 7) {
					break;
				}
				// Counters and checks the diagonal gameboards
				if (gameboard[row + column][column] != ' '
						&& gameboard[row + column - 1][column - 1] == gameboard[row + column][column]) {
					counter++;
				} else {
					counter = 1;
				}
				if (counter > 3) {
					return gameboard[row + column][column];
				}
			}
		}

		// Checks diagonals from right to bottom
		for (int column = 0; column < 7; column++) {
			int counter = 0;
			// Starts with first row
			for (int row = 1; row < 7; ++row) {
				// Stops if its out of bounds
				if (column - row < 0) {
					break;
				}
				if (gameboard[row][column - row] != ' '
						&& gameboard[row - 1][column - row + 1] == gameboard[row][column - row]) {
					counter++;
				} else {
					counter = 1;
				}
				// Returns the winning colors
				if (counter > 3) {
					return gameboard[row][column - row];
				}
			}
		}

		// Checks for diagonals that start on left of each row
		for (int row = 0; row < 7; row++) {
			int counter = 0;
			for (int column = 5; column >= 0; column--) {
				// Stops when column can get outside of the bounds
				if (column - row <= 0) {
					break;
				}
				if (gameboard[column - row][column] != ' '
						&& gameboard[column - row - 1][column + 1] == gameboard[column - row][column]) {
					counter++;
				} else {
					counter = 1;
				}
				// Returns winning color
				if (counter > 3)
					return gameboard[column - row][column];
			}
		}
		// If it doesn't find winner in diagonals returns space
		return ' ';
	}

	public static int gameOver() {

		// Char that takes the return value of the method for rows
		char winner = rowWinner();
		// If the return value istn space returns winner color
		if (winner != 'D') {
			return winner;
		}
		// Takes the return value of the method for columns
		winner = columnWinner();
		if (winner != 'D') {
			return winner;
		}
		// Takes the return value of the method for diagonals
		winner = diagonalWinner();
		if (winner != 'D') {
			return winner;
		}
		// Checks for empty cells
		for (int i = 0; i < gameboard.length; i++) {
			for (int j = 0; j < gameboard[i].length; j++) {
				if (gameboard[i][j] == ' ') {
					return ' ';
				} else {
					return '-';
				}
			}
		}
		return '-';
	}
}
