package zadaci_22_08_2016;

public class RegularPolygonTest {

	public static void main(String[] args) {
		
		/**
		 * Creates 3 RegularPolygon objects with different features 
		 * 1 is default 
		 * 2 is with sides and positions
		 * 3 is with specified sides and coordinates 
		 */
		RegularPolygon polygon1 = new RegularPolygon();
		RegularPolygon polygon2 = new RegularPolygon(6, 4);
		RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		/**
		 * Prints area and perimeter of each polygon object created
		 */
		System.out.printf("Area of regular polygon 1 is %2.2f \tPerimeter is %2.2f \n", polygon1.getArea(), polygon1.getPerimeter());
		
		System.out.printf("Area of regular polygon 2 is %2.2f \tPerimeter is %2.2f \n", polygon2.getArea(), polygon2.getPerimeter());
		
		System.out.printf("Area of regular polygon 3 is %2.2f \tPerimeter is %2.2f \n", polygon3.getArea(), polygon3.getPerimeter());
	}

}
