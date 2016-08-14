package zadaci_13_08_2016;

public class Zadatak_5 {

	public static void main(String[] args) {
		
		//Scanner object created for user input
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//If the exception occurr's in the try block it is sent to catch block
		try {
			
			//Prompts a user to input weight and price of a package
			System.out.println("Enter weight and price of first package: ");
			
			double weightPackage1 = input.nextDouble();			//User input of weight for package 1
			
			double pricePackage1 = input.nextDouble();			//User input of price package 1
			
			//Prompts a user to input weight and price of a package
			System.out.println("Enter weight and price of second package: ");
			
			double weightPackage2 = input.nextDouble();			//User input of weight for package 2
			
			double pricePackage2 =  input.nextDouble();			//User input of weight for package 2
			
			input.close();										//Scanner closed
			
			//Calculates a price of package per weight unit(grams, ounces...) for package 1
			double pricePerUnitPackage1 = pricePackage1 / weightPackage1;
			
			//Calculates a price of package per weight unit(grams, ounces...) for package 1
			double pricePerUnitPackage2 = pricePackage2 / weightPackage2;
			
			//If package 1 price per unit is smaller it has a better price
			if(pricePerUnitPackage1 < pricePerUnitPackage2){
				System.out.println("\nFirst package has a better price.");		//Prints a message
			
				//If package 2 price per unit is smaller it has a better price
			}else if(pricePerUnitPackage2 < pricePerUnitPackage1){
				System.out.println("\nSecond package has a better price."); 	//Prints a message
			
				//If package 1 and package 2 prices per unit is are equal 
			}else {
				System.out.println("\nPackages have an equal price.");			//Prints a message
			}
			
			//Catches an exception and prints a message
		} catch (Exception e) {
			System.out.println("Wrong input. Enter only numbers.");
		}
			
	}
}
