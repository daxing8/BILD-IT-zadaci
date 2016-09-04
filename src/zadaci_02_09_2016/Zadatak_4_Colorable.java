package zadaci_02_09_2016;

public class Zadatak_4_Colorable {

	public static void main(String[] args) {
		//Array stores shape objects
		GeometricObject[] shapes = new GeometricObject[4];
        
		//Shape objects created and added to array
		shapes[0] = new Circle2D();
        shapes[1] = new Circle2D(0, 0, 10);
        shapes[2] = new Square();
        shapes[3] = new Square(1, 2, 20);
        
        //Loops the array and prints area of the shape object
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i + 1) + " area is: " + shapes[i].getArea());
            //If object is instance of Colorable interface call the method hotToColor()
            if (shapes[i] instanceof Colorable) {
                System.out.println("How to color: " + ((Colorable)shapes[i]).howToColor());
            }
        }
	}
}
