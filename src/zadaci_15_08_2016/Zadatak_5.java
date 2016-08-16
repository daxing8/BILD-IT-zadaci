
/*********************************************************************************************************************** 
 * 
 * Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim headerom: public static void printMatrix(int n). 
 * Svaki element u matrici je ili 0 ili 1, nasumièno generisana. 
 * Napisati test program koji pita korisnika da unese broj n te mu ispiše n x n matricu u konzoli.
 * 
 ***********************************************************************************************************************/

package zadaci_15_08_2016;

public class Zadatak_5 {

	public static void main(String[] args) {
		
		////Code that can throw an exception
		try {
			
			//Scanner object for user input
			java.util.Scanner input = new java.util.Scanner(System.in);
			
			//Prompts a user to enter a size of the matrix
			System.out.println("Enter number as a size of matrix: ");
			
			int num = input.nextInt();	//user input
			
			input.close();				//Scanner closed
			
			printMatrix(num);			//Prints a matrix 
			
			//Prints a message if exception is caught
		} catch (Exception e) {
			System.out.println("Wrong input. Enter only integer.");
		}
	}
	
	//Creates and print nxn matrix  
	public static void printMatrix(int n) {
		
		//Creates a two dimensional array with nxn size 
		int[][] matrix = new int[n][n];
		
		//Adds random values of 0 and 1 to the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		
		//Prints a matrix on the console
		for (int k = 0; k < matrix.length; k++) {
			for (int l = 0; l < matrix[k].length; l++) {
				System.out.print(matrix[k][l] + " ");
			}
			System.out.println();
		}
	}

}
