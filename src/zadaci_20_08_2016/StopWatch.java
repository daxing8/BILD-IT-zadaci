
/**************************************************************************************
 * (Stopwatch) Design a class named StopWatch. The class contains:
 * - Private data fields startTime and endTime with getter methods.
 * - A no-arg constructor that initializes startTime with the current time.
 * - A method named start() that resets the startTime to the current time.
 * - A method named stop() that sets the endTime to the current time.
 * - A method named getElapsedTime() that returns the elapsed time for the
 * stopwatch in milliseconds.
 * 
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that measures the execution time of sorting 100,000 numbers using
 * selection sort.
 * 
 ***************************************************************************************/

/************ UML *************
 * 			StopWatch
 * ****************************
 * + startTime: long
 * + endTime: long
 * ----------------------------
 * - StopWatch()
 * - start(): void
 * - stop(): void
 * - getElapsedTime(): long
 * - getStartTime(): long
 * - getEndTime(): long 
 * 							
 *******************************/

package zadaci_20_08_2016;

class StopWatch {

	// Private data fields of type long to store start and end time
	private long startTime;
	private long endTime;

	// No args constructor to initialize start time with current time
	StopWatch() {
		startTime = System.currentTimeMillis();
	}

	// Method start() that resets the startTime to the current time
	public void start() {
		startTime = System.currentTimeMillis();
	}

	// Method stop() sets end time to current time
	public void stop() {
		endTime = System.currentTimeMillis();
	}

	// Subtracts end time from start time to get amount of milliseconds
	public long getElapsedTime() {
		return (endTime - startTime) / 1000;// divides ti by 1000 to get the
											// number in seconds format
	}

	// Getter for start time
	public long getStartTime() {
		return startTime;
	}

	// Getter for end time
	public long getEndTime() {
		return endTime;
	}

}
