
/*************************************************************************************
 * (The Person, Student, Employee, Faculty, and Staff classes) Design a
 * class named Person and its two subclasses named Student and Employee.
 * Make Faculty and Staff subclasses of Employee. A person has a name,
 * address, phone number, and email address. A student has a class status (freshman,
 * sophomore, junior, or senior). Define the status as a constant. An employee has
 * an office, salary, and date hired. Use the MyDate class defined in Programming
 * Exercise 10.14 to create an object for date hired. A faculty member has office
 * hours and a rank. A staff member has a title. Override the toString method in
 * each class to display the class name and the person’s name.
 * Draw the UML diagram for the classes and implement them. Write a test program
 * that creates a Person, Student, Employee, Faculty, and Staff, and
 * invokes their toString() methods.
 * 
 ************************************************************************************/


package zadaci_26_08_2016;

public class Zadatak_2_PersonTest {

	public static void main(String[] args) {
		
		//Crates Person Student Employee Faculty and Staff objects with specified parameter
		Person person = new Person("Stan", "345 Hudson Street", "258 256 622", "southParkStan@gmail.com");

		Student student = new Student("Kyle", "345 Hudson Street", "258 222 659", "southParkKyle@gmail.com", Student.SOPHOMORE);

		Employee employee = new Employee("Eric", "345 Hudson Street", "258 323 540", "southParkEric@gmail.com", 910, 60000);

		Faculty faculty = new Faculty("Kenny", "345 Hudson Street", "258 112 563", "southParkKenny@gmail.com", 101, 50000, "3pm to 5pm",
				"Professor");

		Staff staff = new Staff("Stuart", "345 Hudson Street", "258 231 677", "southParkStuart@gmail.com", 12, 65000,
				"Executive Assistant");

		// Invoke toString of Person, Student, Employee, Faculty and Staff
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}

}
