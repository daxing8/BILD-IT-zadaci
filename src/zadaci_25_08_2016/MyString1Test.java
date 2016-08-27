
/**************************************************************************************
 * (Implement the String class) The String class is provided in the Java library.
 * Provide your own implementation for the following methods (name the new
 * class MyString1):
 * public MyString1(char[] chars);
 * public char charAt(int index);
 * public int length();
 * public MyString1 substring(int begin, int end);
 * public MyString1 toLowerCase();
 * public boolean equals(MyString1 s);
 * public static MyString1 valueOf(int i);
 * 
 ***************************************************************************************/



package zadaci_25_08_2016;

public class MyString1Test {

	public static void main(String[] args) {
		
		//char arrays for creating MyString1 object and testing
		char[] c1 = { 'j', 'a', 'v', 'a' };
		char[] c2 = { 'J', 'A', 'V', 'A' };
		
		//Creates MyString1 object with char array as parameters
		MyString1 ch = new MyString1(c2);
		
		//Testing every method in MyString1 class
		System.out.println("Array is: " + ch.toString());
		System.out.println("\nCharacter at index 1 is: " + ch.charAt(1));
		System.out.println("Lenght of array is: " + ch.length());
		System.out.println("Substring of array: " + ch.substring(1, 3));
		System.out.println("Characters of array to lower case: " + ch.toLowerCase());
		System.out.println("Is MyString object equal to array: " + ch.equals(c1));
		System.out.println("Integer value to char array: " + MyString1.valueOf(5));

	}

}
