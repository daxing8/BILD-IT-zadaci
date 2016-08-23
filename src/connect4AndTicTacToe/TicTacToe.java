
/**********************************************************************************************
 * (Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
 * marking an available cell in a 3 * 3 grid with their respective tokens (either X or O). 
 * When one player has placed three tokens in a horizontal, vertical, 
 * or diagonal row on the grid, the game is over and that player has won. 
 * A draw (no winner) occurs when all the cells on the grid have been filled with tokens and
 * neither player has achieved a win. Create a program for playing tic-tac-toe.
 * The program prompts two players to enter an X token and O token alternately.
 * Whenever a token is entered, the program redisplays the board on the
 * console and determines the status of the game (win, draw, or continue).
 * 
 ************************************************************************************************/



package connect4AndTicTacToe;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
	
	//Array and variables made public static so that they can be used by methods in a class
	public static char[][] grid = new char[3][3];
	public static int row;
	public static int column;
	public static char playerTurn = 'X';


	/************************* Main method ******************************/
	
	public static void main(String[] args) {
		
		//Fills the array with empty space
		for (int i = 0; i < grid.length; i++) {
			Arrays.fill(grid[i], ' ');
		}
		//Calls a method to play a game
		playGame();
	}
	
	/************************* End of main ******************************/
	
	/**
	 * Method updates grid and prompts players to play their move until someone wins or if game is a draw 
	 */
	public static void playGame() {
		
		//Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		//Game is in progress set to true
		boolean play = true;
		
		//Counts number of moves
		int counter = 0;
		
		//Loops until someone wins or all cells are filled
		while (play) {
			
			counter++;
			//Prints a grid for player preview 
			printGrid();
			
			//When number of moves reaches 9 game is a draw, game ends
			if (counter % 10 == 0) {
				System.out.println("Game is a draw.");
				play = false;
				break;
			}
			
			//Prompts user to enter row and column number as a move
			System.out.println("Enter a row(1, 2, or 3) for player " + playerTurn + ": ");
			row = input.nextInt() - 1;
			System.out.println("Enter a column(1, 2, or 3) for player " + playerTurn + ": ");
			column = input.nextInt() - 1;
			
			//Checks if user input is valid if not prompts player to enter again
			if (!isValid(row, column)) {
				System.out.println("Wrong number or that cell is taken. Try again. Enter row and column: ");
				row = input.nextInt();
				column = input.nextInt();
			}
			
			//Adds X or O to the grid
			grid[row][column] = playerTurn;
			
			//Checks if there is a winner
			if (gameEnd()) {
				play = false;
				printGrid();
				System.out.println(playerTurn + " player won!");
			}
			
			//Checks which players turn it is
			if (playerTurn == 'X') {
				playerTurn = 'O';
			} else
				playerTurn = 'X';
		}

		input.close();
	}

	/**
	 * Method prints gameboard grid for player preview
	 */
	public static void printGrid() {
		
		//Outer loop displays top of the grid and inner loop displays the walls of the grid
		for (int i = 0; i < grid.length; i++) {
			System.out.println("\n --------------");
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(" | " + grid[i][j]);

				if (j == 2) {
					System.out.print(" |");
				}
			}
			if (i == 2) {
				System.out.println("\n --------------");
			}
		}
	}
/**
 * Method checks every posible solution for a win(horisontal, vertical and diagonal
 */
	public static boolean gameEnd() {
		
		//Checks for vertical 3 of the same in a column
		if (grid[0][column] == grid[1][column] && grid[0][column] == grid[2][column]) {
			return true;
		}
		//Checks for horisontal 3 in a row
		if (grid[row][0] == grid[row][1] && grid[row][0] == grid[row][2]) {
			return true;
		}
		//Checks for both diagonal 3 in a row
		if (grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2] && grid[1][1] != ' ') {
			return true;
		}
		if (grid[0][2] == grid[1][1] && grid[0][2] == grid[2][0] && grid[1][1] != ' ') {
			return true;
		}
		
		//If every of the checks is false, return false
		return false;
	}

	/**
	 * 
	 * Method checks if user input of row and column is correct
	 * or if the cell is empty for user input
	 */
	public static boolean isValid(int r, int c) {
		
		//If any of the parameters is not correct return false
		if (row < 0 && row > 2 && column < 0 && column > 2 || grid[r][c] != ' ') {
			return false;
		}
		//otherwise return true
		return true;
	}
}
