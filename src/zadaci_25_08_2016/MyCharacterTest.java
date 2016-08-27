
/*********************************************************************************
 * (Implement the Character class) The Character class is provided in the Java
 * library. Provide your own implementation for this class. Name the new class
 * MyCharacter.
 * 
 *********************************************************************************/


package zadaci_25_08_2016;

public class MyCharacterTest {

	public static void main(String[] args) {
		
		//char type variables for creating MyCharacter objects and testing methods 
		char a = 'a';
		char b = '8';
		
		//Two MyCharacter objects created
		MyCharacter ch = new MyCharacter(a);
		MyCharacter ch1 = new MyCharacter(b);

		// Testing every method in MyCharacter class
		System.out.println("Character is letter: " + MyCharacter.isLetter(ch1));
		System.out.println("Character is digit: " + MyCharacter.isDigit(ch));
		System.out.println("Character is letter or a digit: " + MyCharacter.isLetterOrDigit(ch1));
		System.out.println("Character to lower case: " + ch.toLowerCase());
		System.out.println("Character to upper case: " + ch.toUpperCase());
	}

}
