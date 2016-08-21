
/******************************************************************************************
 * 
 * (Compute the weekly hours for each employee) Suppose the weekly hours for all
 * employees are stored in a two-dimensional array. Each row records an employee’s
 * seven-day work hours with seven columns. For example, the following
 * array stores the work hours for eight employees. Write a program that displays
 * employees and their total hours in decreasing order of the total hours.
 * 			Su M T W Th F Sa
 * 	Employee 0 2 4 3 4 5 8 8
 * 	Employee 1 7 3 4 3 3 4 4
 * 	Employee 2 3 3 4 3 3 2 2
 * 	Employee 3 9 3 4 7 3 4 1
 * 	Employee 4 3 5 4 3 6 3 8
 * 	Employee 5 3 4 4 6 3 4 4	
 * 	Employee 6 3 7 4 8 3 8 4
 * 	Employee 7 6 3 5 9 2 7 9
 * 
 *****************************************************************************************/

package zadaci_19_08_2016;

import java.util.Arrays;
import java.util.Comparator;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		//2-D array with work hours for employees
		int[][] workHours = { { 2, 4, 3, 4, 5, 8, 8 }, 
								{ 7, 3, 4, 3, 3, 4, 4 }, 
								{ 3, 3, 4, 3, 3, 2, 2 },
								{ 9, 3, 4, 7, 3, 4, 1 }, 
								{ 3, 5, 4, 3, 6, 3, 8 }, 
								{ 3, 4, 4, 6, 3, 4, 4 }, 
								{ 3, 7, 4, 8, 3, 8, 4 },
								{ 6, 3, 5, 9, 2, 7, 9 } };
		
		//Prints a header for weekday table
		System.out.println("\t\tSu " + " Mo " + " Tu " + " We " + " Th " + " Fr " + " Sat ");
		System.out.println("\t\t---------------------------");
		
		//Prints employees and their working hours by day
		for (int i = 0; i < workHours.length; i++) {
			System.out.print("Employee " + i + "\t");
			for (int j = 0; j < workHours[i].length; j++) {
				System.out.print(workHours[i][j] + "   ");
			}
			System.out.println();
		}
		//Calls a method that sums rows of work hours for each employee and add it to 2-D array totalSum 
		int[][] totalSum = sumRows(workHours);
		
		//Sorts summed work hours
		sort(totalSum);
		
		//Prints sorted work hours
		print(totalSum);
	}
	//Sums work hours for every employee and returns them in an 2-D array
	public static int[][] sumRows(int[][] m) {
		
		//2-D array to store employees and their working hours
		int[][] sum = new int[m.length][2];
		
		//Adds work hours and index of employee to the columns
		for (int i = 0; i < m.length; i++) {
			sum[i][0] = i;						//index of employee added to first column
			for (int j = 0; j < m[i].length; j++) {
				sum[i][1] += m[i][j];		//Sums work hours for certain employee
			}
		}
		return sum;	
	}
	//Sorts work hours by comparing employee with work hours
	public static void sort(int[][] m) {
		
		//Uses sort method with Comparator to sort two arrays in descending order
		Arrays.sort(m, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return Integer.compare(b[1], a[1]);
			}
		});
	}
	//Prints employee's and their work hours in descending order
	public static void print(int[][] m) {
		
		//Prints header for sorting result
		System.out.println("\nEmployee      Hours");
		System.out.println("---------------------");
		
		//Prints formated numbers in the array
		for (int i = 0; i < m.length; i++) {
			System.out.printf("%4d%14d\n", m[i][0], m[i][1]);
		}
	}
}
