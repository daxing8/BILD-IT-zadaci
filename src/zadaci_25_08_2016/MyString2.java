package zadaci_25_08_2016;

public class MyString2 {
	private String s;

	// Constructor creates a new Mystring2 object with speceified string object
	// as argument
	public MyString2(String s) {
		this.s = s;
	}

	//Returns an integer greater than 0, equal to 0, or less than 0 to indicate
	//whether this string is greater than, equal to, or less than this s
	public int compare(String s) {
		return this.s.compareTo(s);
	}

	//Return a new MyString2 object that is a substring with a specified begin
	public MyString2 substring(int begin) {
		String b = "";
		for (int i = begin; i < s.length(); i++) {
			b += s.charAt(i);
		}
		return new MyString2(b);
	}

	//Returns a new MyString2 object with all upper case */
	public MyString2 toUpperCase() {
		String n = "";
		for (int i = 0; i < s.length(); i++) {
			n += Character.toLowerCase(s.charAt(i));
		}
		return new MyString2(n);
	}

	//Return string as a character array */
	public char[] toChars() {
		return this.s.toCharArray();
	}

	//Return the boolean value as a MyString2 object */
	public static MyString2 valueOf(boolean b) {
		return (b ? new MyString2("true") : new MyString2("false"));
	}
	//Returns string representation of a data field s
	@Override
	public String toString() {
		return s;
	}

}
