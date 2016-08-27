package zadaci_25_08_2016;

public class MyStringBuilder1 {
	//private data field
	private String s;
	
	//Constructor creates MyS¸tringBuilder1 object with speceified string as argument
	public MyStringBuilder1(String s) {
		this.s = s;
	}
	//Append string to MyStringBuilder object
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		String str  = this.s; 
		str += s;
		return new MyStringBuilder1(str);
	}
	//Append integer to MyStringBuilder object
	public MyStringBuilder1 append(int i) {
		String str  = this.s; 
		str += i + "";
		return new MyStringBuilder1(str);
	}
	//Returns length of a string
	public int length() {
		return s.length();
	}
	//Returns a character at speceified index of a string
	public char charAt(int index) {
		return s.charAt(index);
	}
	//Returns MyStringBuilder1 object as lower case
	public MyStringBuilder1 toLowerCase() {
		String newStr = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				newStr += Character.toLowerCase(s.charAt(i));
			}
		}
		return new MyStringBuilder1(newStr);
	}
	//Returns specified substring from MyStringBuilder1 object
	public MyStringBuilder1 substring(int begin, int end) {
		String str = "";
		for (int i = begin; i < end; i ++) {
			str += s.charAt(i);
		}
		return new MyStringBuilder1(str);
	}
	//MyStringBuilder object as a string
	public String toString() {
		return s;
	}
}
