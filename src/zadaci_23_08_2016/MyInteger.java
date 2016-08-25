
/**************************************************************************************
 * (The MyInteger class) Design a class named MyInteger. The class contains:
 * ■ An int data field named value that stores the int value represented by this
 * object.
 * ■ A constructor that creates a MyInteger object for the specified int value.
 * ■ A getter method that returns the int value.
 * ■ The methods isEven(), isOdd(), and isPrime() that return true if the
 * value in this object is even, odd, or prime, respectively.
 * ■ The static methods isEven(int), isOdd(int), and isPrime(int) that
 * return true if the specified value is even, odd, or prime, respectively.
 * ■ The static methods isEven(MyInteger), isOdd(MyInteger), and
 * isPrime(MyInteger) that return true if the specified value is even, odd,
 * or prime, respectively.
 * ■ The methods equals(int) and equals(MyInteger) that return true if
 * the value in this object is equal to the specified value.
 * ■ A static method parseInt(char[]) that converts an array of numeric
 * characters to an int value.
 * ■ A static method parseInt(String) that converts a string into an int
 * value.
 * Draw the UML diagram for the class and then implement the class. Write a client
 * program that tests all methods in the class.
 ****************************************************************************************/



package zadaci_23_08_2016;

public class MyInteger {
	//data field
	private int value;

	
	//Constructor creates object with specified value
	MyInteger(int value) {
		this.value = value;
	}
	//Getter method for value
	public int getValue() {
		return value;
	}
	//Checks if value is even number
	public boolean isEven() {
		if (this.value % 2 == 0) {
			return true;
		} else
			return false;
	}
	//Checks if value is odd number
	public boolean isOdd() {
		if (this.value % 2 != 0) {
			return true;
		} else
			return false;
	}
	
	//Checks if value is prime number
	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if (this.value % i == 0) {
				return false;
			}
		}
		return true;
	}
	//Checks if value is even number
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
		return false;
	}
	//Checks if value is odd number
	public static boolean isOdd(int value) {
		if (value % 2 == 0) {
			return false;
		}
		return true;
	}
	//Checks if value is prime number
	public static boolean isPrime(int value) {
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
	//Checks if MyInteger type object value is even number
	public static boolean isEven(MyInteger value) {
		if (value.getValue() % 2 == 0) {
			return true;
		} else
			return false;
	}
	//Checks if MyInteger type object value is odd number
	public static boolean isOdd(MyInteger value) {
		if (value.getValue() % 2 == 0) {
			return false;
		} else
			return true;
	}
	//Checks if MyInteger type object value is prime number
	public static boolean isPrime(MyInteger value) {
		int number = value.value;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	//Checks if value number is equal to number
	public boolean equals(int number) {
		if (value == number) {
			return true;
		}
		return false;
	}
	//Checks if MyInteger type object value is equal to value
	public boolean equals(MyInteger value) {
		if (value.value == this.value) {
			return true;
		} else
			return false;
	}
	//Returns a String representation of char array
	public static int parseInt(char[] value) {
		return Integer.parseInt(new String(value));
	}
	//Returns a integer representation of String value
	public static int parseInt(String value) {
		return Integer.parseInt(value);		
	}
}
