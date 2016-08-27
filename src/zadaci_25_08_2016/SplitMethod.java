
/******************************************************************************************
 * (New string split method) The split method in the String class returns an
 * array of strings consisting of the substrings split by the delimiters. However, the
 * delimiters are not returned. Implement the following new method that returns
 * an array of strings consisting of the substrings split by the matching delimiters,
 * including the matching delimiters.
 * public static String[] split(String s, String regex)
 * For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an
 * array of String, and split("a?b?gf#e", "[?#]") returns a, b, ?, b, gf,
 * #, and e in an array of String.
 * 
 ******************************************************************************************/


package zadaci_25_08_2016;

import java.util.ArrayList;

public class SplitMethod {

	public static void main(String[] args) {
			
		//Calls split method
		String[] array = split("ab#12#453", "#");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static String[] split(String s, String regex) {

		// ArrayList to store split strings and regex
		ArrayList<String> stringList = new ArrayList<>();

		// String object to store strings
		String string = "";

		// Counts split strings
		int counter = 0;

		// char array to store regex
		char[] regex2 = new char[regex.length()];

		// Adds regex to array
		for (int i = 0; i < regex2.length; i++) {
			char ch = regex.charAt(i);
			regex2[i] = ch;
		}
		// Splits charachters from string
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			for (int j = 0; j < regex2.length; j++) {
				// Comparing characters with regex
				if (ch == regex2[j]) {

					// Splits the string before regex
					string = s.substring(counter, i);

					// Adds string to a list
					stringList.add(string);

					// Adds regex to list
					stringList.add(regex2[j] + "");

					counter = i + 1;
				}
			}

			// Adds remaining strings
			if (i == s.length() - 1) {
				string = s.substring(counter, s.length());
				stringList.add(string);
			}

		}

		// Returns array of split strings
		String[] stringSplit = new String[stringList.size()];
		for (int i = 0; i < stringSplit.length; i++) {
			stringSplit[i] = stringList.get(i);
		}
		return stringSplit;
	}

}
