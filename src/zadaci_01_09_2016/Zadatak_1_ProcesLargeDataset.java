
/*****************************************************************************************
 * (Process large dataset) A university posts its employees’ salaries at http://
 * cs.armstrong.edu/liang/data/Salary.txt. Each line in the file consists of a faculty
 * member’s first name, last name, rank, and salary (see Programming Exercise
 * 12.24). Write a program to display the total salary for assistant professors,
 * associate professors, full professors, and all faculty, respectively, and display
 * the average salary for assistant professors, associate professors, full professors,
 * and all faculty, respectively.
 *****************************************************************************************/

package zadaci_01_09_2016;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Zadatak_1_ProcesLargeDataset {
	
	public static void main(String[] args){
		
		//Counters for assistant associate and professor count
		int assistantCounter  = 0;
		int associateCounter = 0;
		int fullCounter = 0;
		
		//Variables for suming totals
		double totalAssistant = 0;
		double totalAssociate = 0;
		double totalFull = 0;
		
		//Coda that can throw an exception
		try {
			
			//Creates URL object with url as argument
			URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
			
			//Scanner object to read from url
			Scanner input = new Scanner(url.openStream());
			
			//Reads all data from the url source
			while(input.hasNextLine()){
				String firstName = input.next();
				String lastName = input.next();
				String rank = input.next();
				String salary = input.next();
				
				//If rank equals to any of the ranks rank counter increments and adds sum to total
				if(rank.equals("assistant")){
					assistantCounter++;
					totalAssistant += Double.parseDouble(salary);
				}else if(rank.equals("associate")){
					associateCounter++;
					totalAssociate += Double.parseDouble(salary);
				}else {
					fullCounter++;
					totalFull += Double.parseDouble(salary);
				}
			}
			//Prints result of calculations on the console
			System.out.println("\n\t\t\tSalary data");
			System.out.println("-------------------------------------------------------------------");
			System.out.printf("Assistant professors total salary: %.2f", totalAssistant);
			System.out.printf("\nAssociate professors total salary: %.2f", totalAssociate);
			System.out.printf("\nFull professors total salary: %.2f", totalFull);
			System.out.printf("\nFaculty total salary: %.2f", getTotalFaculty(totalAssistant, totalAssociate, totalFull));
			System.out.printf("\n\nAssistant professors average salary: %.2f", getAverage(totalAssistant, assistantCounter));
			System.out.printf("\nAssociate professors average salary: %.2f", getAverage(totalAssociate, associateCounter));
			System.out.printf("\nFull professors average salary: %.2f", getAverage(totalFull, fullCounter));
			System.out.printf("\nFaculty average salary: %.2f", getAverage(getTotalFaculty(totalAssistant, totalAssociate, totalFull),getTotalCount(assistantCounter, associateCounter, fullCounter)));
			
			//Scanner closed
			input.close();
			
			//Cathces an exception and prints a stack trace
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}
	//Calculates average
	public static double getAverage(double total, int counter){	
		return total / counter;
	}
	//Sums all ranks total salaries 
	public static double getTotalFaculty(double t1, double t2, double t3){
		return t1 + t2 + t3;
	}
	//Returns summed rank counters
	public static int getTotalCount(int c1, int c2, int c3){
		return c1 + c2 + c3;
	}
}
