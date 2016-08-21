
/***********************************************************************************************
 * 
 * (The Location class) Design a class named Location for locating a maximal
 * value and its location in a two-dimensional array. The class contains public data
 * fields row, column, and maxValue that store the maximal value and its indices
 * in a two-dimensional array with row and column as int types and maxValue as a double type.
 * Write the following method that returns the location of the largest element in a
 * two-dimensional array:
 * 
 * public static Location locateLargest(double[][] a)
 * 
 * The return value is an instance of Location. Write a test program that prompts
 * the user to enter a two-dimensional array and displays the location of the largest
 * element in the array.
 * 
 ***********************************************************************************************/

									/************************* UML *************************
									 * 			  			
									 * 						Location
									 * ----------------------------------------------------
									 * - public row: int
									 * - public column: int
									 * - public maxValue: double
									 * ----------------------------------------------------
									 * - Location()
									 * - Location(row: int, column: int, maxValue: double)
									 * - locateLargest(a[][]: double): Location
									 * 
									 ********************************************************/
package zadaci_20_08_2016;

class Location {
	
	//Public data fields for storing row, column and max value
	public int row;
	public int column;
	public double maxValue;
	
	//Default Constructor
	Location() {

	}
	
	//Constructor creates row column and max value with specified value 
	Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	//Method locates largest element in the array and it's row and column index location
	public static Location locateLargest(double[][] a) {
		
		//Store row and column index
		int rowIndex = 0;
		int columnIndex = 0;
		
		//Starting point value 
		double maxNumber = a[0][0];
		
		//Finds largest element in the array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				//If next number is larger than previous store it to the maxNumber
				if (a[i][j] > maxNumber) {
					maxNumber = a[i][j];
					rowIndex = i;	//Updates row index
					columnIndex = j;	//Updates column index

				}
			}
		}
		//Creates new Location object 
		Location location = new Location();
		
		//Stores new values to row column and maxValue
		location.row = rowIndex;
		location.column = columnIndex;
		location.maxValue = maxNumber;
		
		//Returns the instance of a Location object
		return location;
	}
}
