package zadaci_02_09_2016;

public class Zadatak_2_GeometricObjectComparable {

	public static void main(String[] args) {
	//Two Circle objects for comapring 	
	GeometricObject c1 = new Circle(1);
	GeometricObject c2 = new Circle(3);
	
	//Two Rectangle objects for comparing
	GeometricObject r1 = new Rectangle(2, 2);
	GeometricObject r2 = new Rectangle(3, 3);
	
	//Prints result of max object from GeometricObject class
	System.out.println("Max object is: "+ GeometricObject.max(c1, c2).toString());
	System.out.println("Max object is: "+ GeometricObject.max(r1, r2).toString());
	}
}
