
/**********************************************************************************
 * (Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
 * to add a clone method to perform a deep copy on the students field.
 **********************************************************************************/

package zadaci_03_09_2016;

public class Zadatak_5_EnableCourseClass {

	public static void main(String[] args) throws CloneNotSupportedException{
		//Course object instance with course name
		Course course = new Course("Fundamentals of Programming");
		
		//Adds one student name to the student array
		for (int i = 0; i < 100; i++) {
			course.addStudent("John Doe");
		}
		//Clones first clone object
		Course clone = (Course)course.clone();
		
		//Prints both Course objects
		System.out.println("First course: " + course.toString());
		System.out.println("Cloned course: " + clone.toString());
	}

}
