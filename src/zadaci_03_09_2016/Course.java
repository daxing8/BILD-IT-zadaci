package zadaci_03_09_2016;

import java.util.Arrays;

public class Course implements Cloneable{
	//Data fields
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	//Constructor with specified course name
	public Course(String courseName) {
		this.courseName = courseName;
	}

	// Adds students to the array
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	/****************** Getter methods **********************/
	
	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}
	
	/****************** End of Getter methods **********************/
	
	
	// Clone method overrided 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	//Overrided toString method
	@Override
	public String toString() {
		return "\nCourse name: " + courseName + "\nstudents: " + Arrays.toString(students) + "\nnumberOfStudents: "
				+ numberOfStudents + "\n";
	}
}
