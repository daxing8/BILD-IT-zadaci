
/***************************************************************************************
 * (Largest row and column) Write a program that randomly fills in 0s and 1s into
 * a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
 * most 1s. Here is a sample run of the program:
 * 0011
 * 0011
 * 1101
 * 1010
 * 
 * The largest row index: 2
 * The largest column index: 2
 ***************************************************************************************/

package zadaci_19_08_2016;

public class Zadatak_3 {
	public static void main(String[] args) {

		// Stores random 0s and 1s
		int[][] matrix = new int[4][4];

		// Storing random 0s and 1s in 2-D array and printing a matrix on
		// console
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 2);

				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();

		}
		// Prints a result and calls methods to calculate largest column and row
		System.out.println();
		System.out.println("The largest row index: " + largestRow(matrix));
		System.out.println("The largest column index: " + largestColumn(matrix));
	}

	// Finds largest row in a matrix
	public static int largestRow(int[][] array) {

		// Stores max row
		int maxRow = 0;

		// Stores index of max row
		int indexOfRow = 0;

		// Adding first row to max row for comparison with other rows
		for (int column = 0; column < array[0].length; column++) {
			maxRow += array[0][column];
		}
		// Finding largest row and adding it to max row variable
		for (int row = 1; row < array.length; row++) {
			int thisRow = 0;
			for (int column = 0; column < array[0].length; column++) {
				thisRow += array[row][column];

				// If next row is larger update max row and max row index
				if (thisRow > maxRow) {
					maxRow = thisRow;
					indexOfRow = row;
				}
			}

		}
		return indexOfRow;
	}
	//Finds largess column and returns index of it
	public static int largestColumn(int[][] array) {
		
		//Stores max column
		int maxColumn = 0;
		
		//Stores index of max column
		int indexOfColumn = 0;

		// Adding first row to max column for comparison with other columns
		for (int row = 0; row < array.length; row++) {
			maxColumn += array[row][0];
		}
		// Finding largest column and adding it to max column variable
		for (int column = 1; column < array[0].length; column++) {
			int thisColumn = 0;
			for (int row = 0; row < array.length; row++) {
				thisColumn += array[row][column];
				
				// If next column is larger update max column and max column index
				if (thisColumn > maxColumn) {
					maxColumn = thisColumn;
					indexOfColumn = column;
				}
			}

		}
		return indexOfColumn;

	}

}
