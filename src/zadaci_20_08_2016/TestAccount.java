package zadaci_20_08_2016;

public class TestAccount {

	public static void main(String[] args) {
		
		//Creates Account object with id and balance
		Account account = new Account(1122, 20000);
		
		//Sets annual interest rate 
		account.setAnnualInterestRate(4.5);

		//Withdraws the amount from account
		account.withdraw(2500);
		
		//Deposits the amount to the account
		account.deposit(3000);
		
		//Prints account information: id, balance, monthly interest and date it was created
		System.out.println("\n\t  Account Information\n" 
		+ ("------------------------------------------\n" 
		+ "Account ID: " + account.getId() 
		+ "\nDate created: " + account.getDateCreated()));
		
		System.out.printf("Balance: $%.2f\n", account.getBalance()); 
		System.out.printf("Monthly interest: $%.2f\n", account.getMonthlyInterest());

	}

}
