
/**************************************************************************
 * (IllegalArgumentException) Modify the Loan class in Listing 10.2 to
 * throw IllegalArgumentException if the loan amount, interest rate, or
 * number of years is less than or equal to zero.
 **************************************************************************/


package zadaci_29_08_2016;

import java.util.Scanner;

public class Zadatak_5_IllegalArgumentException {

	public static void main(String[] args) {
				
				// Scanner object for user input
				Scanner input = new Scanner(System.in);
				
				try {
					// Enter annual interest rate
					System.out.print("Enter annual interest rate, for example, 8.25: ");
					double annualInterestRate = input.nextDouble();
					
					// Enter number of years
					System.out.print("Enter number of years as an integer: ");
					int numberOfYears = input.nextInt();
					
					// Enter loan amount
					System.out.print("Enter loan amount, for example, 120000.95: ");
					double loanAmount = input.nextDouble();
					
					// Create a Loan object
					Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
					
					//Scanner closed
					input.close();
					
					// Display loan date, monthly payment, and total payment
					System.out.printf("The loan was created on %s\n"
							+ "The monthly payment is %.2f\nThe total payment is %.2f\n",
							loan.getLoanDate().toString(), loan.getMonthlyPayment(),
							loan.getTotalPayment());
					
				} catch (IllegalArgumentException e) {
					System.out.println("Illegal Argument. Your value can't be 0 or a negative number.");
				}
	}
}

class Loan {
	// private data fields
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	// Default constructor
	public Loan() {
		this(2.5, 1, 1000);
	}

	// Constructs a Loan object with specified annual interest rate, number of
	// years, and loan amount
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		
		if (annualInterestRate <= 0)
			throw new IllegalArgumentException();
		if (numberOfYears <= 0)
			throw new IllegalArgumentException();
		if (loanAmount <= 0)
			throw new IllegalArgumentException();
		
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	/***********************
	 * Getter and Setter methods
	 *****************************/

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	/***********************
	 * End of Getter and Setter methods
	 *****************************/

	// Calculate monthly payment
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	// Calculate total payment
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	// Return loan date
	public java.util.Date getLoanDate() {
		return loanDate;
	}

	// String representation of a Loan object
	@Override
	public String toString() {
		return "Loan:\nannualInterestRate = " + annualInterestRate + "\nnumberOfYears = " + numberOfYears
				+ "\nloanAmount = " + loanAmount + "\nloanDate = " + loanDate + "]";
	}

}
