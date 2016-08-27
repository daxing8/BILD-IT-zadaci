
/**************************************************************************************
 * (Implement the String class) The String class is provided in the Java library.
 * Provide your own implementation for the following methods (name the new
 * class MyString2):
 * 
 * public MyString2(String s);
 * public int compare(String s);
 * public MyString2 substring(int begin);
 * public MyString2 toUpperCase();
 * public char[] toChars();
 * public static MyString2 valueOf(boolean b);
 * 
 **************************************************************************************/


package zadaci_25_08_2016;

public class MyString2Test {
	public static void main(String[] args) {
		
		// String for creating MyString2 object and testing
		String s = "Java";

		// Creates MyString2 object with String as parameter
		MyString2 str = new MyString2(s);

		// Testing every method in MyString1 class
		System.out.println("Compared string is: " + str.compare(s));
		System.out.println("Substring of array: " + str.substring(1));
		System.out.println("Characters of array to lower case: " + str.toUpperCase());
		System.out.println("Integer value to char array: " + MyString2.valueOf(true));
		
		//String to char Array
		char[] ch = str.toChars();
		System.out.println("\nString to char array: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(ch[i] + " ");
		}

	}
}
