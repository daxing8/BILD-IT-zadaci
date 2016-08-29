package hangmanAndBattleship;

import java.util.Scanner;

public class Hangman {
	//String array of words made static to be used by methods of a class
	static String[] words = { "programming", "words", "test", "game", "statistics", "power", "solution", "rational" };
	static boolean isCorrect;

	public static void main(String[] args) {
		
		//Scanner for user input
		Scanner input = new Scanner(System.in);
		
		//Defines state of play to true 
		boolean play = true;
		
		//While play is true game is playing
		while (play) {
			
			//Stores the word to be guessed
			String word = getWord();
			
			//Stores the hidden word
			String hiddenWord = getHiddenWord(word);
			
			//Counts missed letters
			int missCount = 0;
			
			//While hidden word is not equal to word ask player to guess 
			while (!word.equals(hiddenWord)) {
				
				//Propts user to input a guess
				System.out.print("\nGuess a letter in word " + hiddenWord + " > ");
				
				//If user inputs more than one character take only first character as input
				char ch = input.next().charAt(0);
				
				//If player guess is not correct or if it is already been guessed print a message
				if (!isAlreadyInWord(hiddenWord, ch)) {

					hiddenWord = getGuess(word, hiddenWord, ch);

					if (!isCorrect) {
						System.out.println(ch + " is not in the word.");
						missCount++;
					}

				} else {
					System.out.println(ch + " is already in word.");
				}

			}
			
			//After the game ends ask player to play again or to leave the game
			System.out.println("The word is " + word + "\nYou missed " + missCount + " time/s");
			System.out.println("Do you want to guess another word? Enter y or n >");
			char playStats = input.next().charAt(0);
			
			//If player inputs y play another game
			if(playStats == 'y' ){
				play = true;
			}else	//else game ends
				play = false;			
		}

	}
	
	//Returns the random word from the array to be guessed
	public static String getWord() {
		return words[(int) (Math.random() * words.length)];
	}
	
	//Creates encripted string word same length as guesing word
	public static String getHiddenWord(String word) {

		String hidden = "";
		for (int i = 0; i < word.length(); i++) {
			hidden += "*";
		}
		return hidden;
	}
	
	//Checks if the user input is correct and adds it to the string
	static public String getGuess(String word, String hiddenWord, char ch) {

		isCorrect = false;
		StringBuilder s = new StringBuilder(hiddenWord);
		for (int i = 0; i < word.length(); i++) {

			if (ch == word.charAt(i) && s.charAt(i) == '*') {
				isCorrect = true;
				s = s.deleteCharAt(i);
				s = s.insert(i, ch);
			}
		}
		return s.toString();
	}
	//Checks if the letter is already in the word string
	public static boolean isAlreadyInWord(String hiddenWord, char ch) {

		for (int i = 0; i < hiddenWord.length(); i++) {

			if (ch == hiddenWord.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}