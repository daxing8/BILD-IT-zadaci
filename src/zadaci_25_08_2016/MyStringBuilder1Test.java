
/************************************************************************************
 * (Implement the StringBuilder class) The StringBuilder class is provided
 * in the Java library. Provide your own implementation for the following methods
 * (name the new class MyStringBuilder1):
 * public MyStringBuilder1(String s);
 * public MyStringBuilder1 append(MyStringBuilder1 s);
 * public MyStringBuilder1 append(int i);public int length();
 * public char charAt(int index);
 * public MyStringBuilder1 toLowerCase();
 * public MyStringBuilder1 substring(int begin, int end);
 * public String toString();
 * 
 *************************************************************************************/

package zadaci_25_08_2016;

public class MyStringBuilder1Test {

	public static void main(String[] args) {

		// Create a MyStringBuilder1 object
		MyStringBuilder1 str = new MyStringBuilder1("JAVA");
		
		//String for appending
		String str1 = " is Fun"; 
		
		//test all methods from MyStringBuilder1 class
		System.out.println("\nAppend the string \" JAVA\" to string: "
				+ str.append(new MyStringBuilder1(str1)));
		System.out.println("Append integer 8 to the string: " + str.append(8));
		System.out.println("Length of string: " + str.length());
		System.out.println("Character at index 2: " + str.charAt(2));
		System.out.println("String to lower case: " + str.toLowerCase());
		System.out.println("Substring of string from index 1 to 3: " + str.substring(1, 3));
		System.out.println("Display string: " + str.toString());
	}

}
