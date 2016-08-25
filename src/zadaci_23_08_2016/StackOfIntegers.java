package zadaci_23_08_2016;

public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	// Default constructor with default capacity of 16
	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}

	// Constructor with the specified maximum capacity
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	// Checks if the stack is empty
	public boolean empty() {
		return size == 0;
	}

	// Returns the top element from the stack
	public int peek() {
		return elements[size - 1];
	}

	// Pushes integers to top off the stack
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = value;
	}

	// Returns and removes the top element from the stack
	public int pop() {
		return elements[--size];
	}

	public int getSize() {
		return size;
	}
}
