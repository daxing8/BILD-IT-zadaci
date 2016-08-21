package zadaci_19_08_2016;


public class Zadatak_5 {

	public static void main(String[] args) {
		
		//Array of random 0s and 1s
		int[][] m = new int[6][6];

		//Stores random 0s and 1s in array
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 2);
			}
		}

		//Prints out the matrix of 0s and 1s
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		//Calls a method to check if rows and columns have even number of 1s
		hasEvenNumbers(m);
	}
	//Counts 1s in rows and columns and checks if there are even number of 1s in rows and columns
	public static void hasEvenNumbers(int[][] m) {

		//Counts 1s in rows
		int rowCounter = 0;
		
		//Counts 0s in rows
		int columnCounter = 0;
		
		//Checks every row and column
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				//Counts 1s in row
				if (m[i][j] == 1) {
					rowCounter++;
				}
				//Counts 1s in column
				if (m[j][i] == 1) {
					columnCounter++;
				}
			}
		}
		//If sum of all 1s in rows is not divisiable with number of rows 
		//number of 1s is not even
		if (rowCounter % 6 != 0) {
			System.out.println("Rows don't have even number of 1s.");
		} else {
			//else it is even
			System.out.println("Rows have even number of 1s.");

		}
		//If sum of all 1s in columns is not divisiable with number of rows 
				//number of 1s is not even
		if (columnCounter % 6 != 0) {
			System.out.println("Columns don't have even number of 1s.");
		} else
			//else it is even
			System.out.println("Columns have even number of 1s.");
	}
}
