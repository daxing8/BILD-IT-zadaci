package zadaci_03_09_2016;

public class Rectangle extends GeometricObject{
	 private double width;
     private double height;

     public Rectangle() {
     }

     public Rectangle(
             double width, double height) {
         this.width = width;
         this.height = height;
     }

     public Rectangle(
             double width, double height, String color, boolean filled) {
         this.width = width;
         this.height = height;
         setColor(color);
         setFilled(filled);
     }
     
     /*********************** Getter and Setter methods *****************************/
     
     public double getWidth() {
         return width;
     }

     public void setWidth(double width) {
         this.width = width;
     }

     public double getHeight() {
         return height;
     }

     public void setHeight(double height) {
         this.height = height;
     }
     
     /*********************** End of Getter and Setter methods *****************************/
     
     //Returns area of rectangle
     public double getArea() {
         return width * height;
     }

     //Returns perimeter of rectangle
     public double getPerimeter() {
         return 2 * (width + height);
     }
     //Equals method overrided returns boolean value if two objects are equal or not
     @Override
     public boolean equals(Object obj) {
         return obj instanceof Rectangle && getArea() == ((Rectangle) obj).getArea();
     }
}
