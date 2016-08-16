
/**********************************************************************************************************************
 * Napisati program koji pita korisnika da unese cijeli trocifreni broj te provjerava da li je unijeti broj palindrom. 
 * Broj je palindrom ukoliko se èita isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131, itd.
 * 
 **********************************************************************************************************************/



package zadaci_16_08_2016;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		
		try {				//Code that can throw exception
				
			java.util.Scanner input = new java.util.Scanner(System.in);		//Scanner for user input
			
			System.out.println("Enter three digit integer: ");		//Prompts user to enter a number
				
			int integer = input.nextInt();					//User input
			
			input.close();					//Scanner closed
			
			
			//Outputs a confirmation that a number is palindrome or not
			System.out.println("Number entered " + (isPalindrome(integer) ? "is" : "is not") + " a palindrome.");
			
			//Cathces an exception and prints a message
		} catch (Exception e) {
			System.out.println("Wrong input. Enter only integers.");
		}
	}
	public static boolean isPalindrome(int n) {			//If a number is palindrome it returns true or false if it is not

		int reversed = 0;			//Stores reversed number
		
		int digit = 0;			//Stores a last digit of number
		
		int num = n;		//Stores a number passed to the method	

		
		while (n != 0) {								//Takes digit by digit from the number in reversed order and 
			digit = num % 10;							//adds it to the variable reversed	
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		if (n != reversed) {						//Return false if reversed number is not equal to n
			return false;
		}
		return true;								//Number is palindrome return true
	}
}
