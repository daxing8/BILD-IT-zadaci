package zadaci_25_08_2016;

public class MyString1 {
	//Data field array of characters
	private char[] chars;
	
	//Constructor with specified character array 
	public MyString1(char[] chars) {
		this.chars = chars;
	}
	//Returns character at specified index in array
	public char charAt(int index) {
		return chars[index];
	}
	//Returns length of array 
	public int length() {
		return chars.length;
	}
	//Returns a substring of array as MyString1 object
	public MyString1 substring(int begin, int end) {
		char[] ch = new char[end - begin];

		for (int i = begin, j = 0; i < end; i++, j++) {
			ch[j] = chars[i];
		}
		return new MyString1(ch);
	}
	//Returns array with all characters in lower case as MYString1 object 
	public MyString1 toLowerCase() {

		char[] ch = new char[chars.length];

		for (int i = 0; i < chars.length; i++) {
				ch[i] = Character.toLowerCase(chars[i]);
		}
		return new MyString1(ch);
	}

	// Checks if two strings are equal returns true if they are and false if
	// they are not
	public boolean equals(MyString1 s) {
		if (chars.length != s.length())
			return false;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != s.charAt(i))
				return false;
		}
		return true;
	}

	// Changes value of int to char array and returns MyString object
	public static MyString1 valueOf(int i) {
		String ch = i + "";
		return new MyString1(ch.toCharArray());
	}
	//Returns char array chars as Sting
	@Override
	public String toString() {
		String string = "";
		for (int i = 0; i < this.chars.length; i++) {
			string += this.chars[i];
		}
		return string;
	}

}
