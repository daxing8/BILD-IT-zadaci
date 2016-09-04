package zadaci_02_09_2016;

public abstract class GeometricObject implements Comparable<GeometricObject> {
	//private data fields hold color, filled and date created
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	//Default constructro creates default GeometricObject object and sets date of creation
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	//Constructor creates GeometricObject with specified color and sets date of creation
	public GeometricObject(String color){
		dateCreated = new java.util.Date();
		this.color = color;
	}

	/****************** Getter and Setter methods **********************/
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public boolean getFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDate() {
		return dateCreated;
	}
	
	/******************** End of Getter and Setter methods **********************/
	
	
	//Returns String representation of a Geometric object
	@Override
	public String toString(){
		return "color is " + color + "\ncreation date at " + dateCreated; 
	}
	
	public abstract double getArea();
	
	//compareTo method implemented
	public int compareTo(GeometricObject g) {
		if (this.getArea() > g.getArea())
			return 1;
		else if (this.getArea() < g.getArea())
			return -1;
		else
			return 0;
	}

	// Compares two GeometricObjects and returns max object
	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		if (o1.compareTo(o2) == 1)
			return o1;
		else
			return o2;
	}
	
}
