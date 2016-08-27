package zadaci_26_08_2016;

public class Loan {
	//private data fields
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	// Default constructor 
	public Loan() {
		this(2.5, 1, 1000);
	}

	//Constructs a Loan object with specified annual interest rate, number of years, and loan amount
	public Loan(double annualInterestRate, int numberOfYears,
		double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}
	
	/*********************** Getter and Setter methods *****************************/
	
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
	
	/*********************** End of Getter and Setter methods *****************************/
	
	//Calculate monthly payment
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
			(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	//Calculate total payment
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	//Return loan date 
	public java.util.Date getLoanDate() {
		return loanDate;
	}
	//String representation of a Loan object
	@Override
	public String toString() {
		return "Loan:\nannualInterestRate = " + annualInterestRate + "\nnumberOfYears = " + numberOfYears + "\nloanAmount = "
				+ loanAmount + "\nloanDate = " + loanDate + "]";
	}

	
}
