package zadaci_23_08_2016;

public class MyPointTest {

	public static void main(String[] args) {
		
		//New MyPoint objects to calculate distance between
		MyPoint point1 = new MyPoint(0, 0);
		MyPoint point2 = new MyPoint(10, 30.5);

		// Prints the distance between two points
		System.out.println(point1.distance(point2));
	}

}
