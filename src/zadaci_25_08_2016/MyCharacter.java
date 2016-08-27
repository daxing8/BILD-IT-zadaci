package zadaci_25_08_2016;

public class MyCharacter {
	//data field
	char ch;
	
	//Constructor creates MyCharacter object with speceified char value
	public MyCharacter(char ch) {
		this.ch = ch;
	}
	
	//Returns true or false if character is letter or not
	public static boolean isLetter(MyCharacter ch) {
		String c = ch + "";  
		return Character.isLetter(c.charAt(0));

	}
	//Returns true or false if character is digit or not
	public static boolean isDigit(MyCharacter ch) {
		String c = ch + "";  
		return Character.isDigit(c.charAt(0));
	}
	//Returns true if character is letter or digit and false if it is neither
	public static boolean isLetterOrDigit(MyCharacter ch) {
		String c = ch + "";  
		return Character.isLetterOrDigit(c.charAt(0));
	}
	//Returns upper case character if it is lower case
	public MyCharacter toUpperCase() {
		String s = ch + "";
		char c = s.charAt(0);
		return new MyCharacter(Character.toUpperCase(c));	
		}
	//Returns lower case character if it is upper case
	public MyCharacter toLowerCase() {
		String s = ch + "";
		char c = s.charAt(0);
		return new MyCharacter(Character.toLowerCase(c));
	}

	// Method converts character to string
	public String toString() {
		String str = "";
		str += this.ch;
		return str;
	}
}
