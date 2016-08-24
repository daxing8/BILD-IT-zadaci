
/*****************************************************************************************
 * (The Fan class) Design a class named Fan to represent a fan. The class contains:
 * - Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to 
 * denote the fan speed.
 * - A private int data field named speed that specifies the speed of the fan (the
 * default is SLOW).
 * - A private boolean data field named on that specifies whether the fan is on (the
 * default is false).
 * - A private double data field named radius that specifies the radius of the fan
 * (the default is 5).
 * - A string data field named color that specifies the color of the fan (the default
 * is blue).
 * - The accessor and mutator methods for all four data fields.
 * - A no-arg constructor that creates a default fan.
 * - A method named toString() that returns a string description for the fan. If 
 * the fan is on, the method returns the fan speed, color, and radius in one combined 
 * string. If the fan is not on, the method returns the fan color and radius
 * along with the string “fan is off” in one combined string.
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that creates two Fan objects. Assign maximum speed, radius 10, color
 * yellow, and turn it on to the first object. Assign medium speed, radius 5, color
 * blue, and turn it off to the second object. Display the objects by invoking their
 * toString method.
 ******************************************************************************************/



package zadaci_22_08_2016;

public class Fan {
	//data filds with specifications of a fan
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	
	//Default constructor
	public Fan() {
		
	}
/********************** Getters and Setters *************************/
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
/**************** End of Getters and Setters ********************/
	
	//Overided method that returns string representation of Fan object with specified features
	@Override
	public String toString() {
		if(on){
			String print = "speed: "+ getSpeed() + "\tcolor: " + getColor() + "\tradius: " + getRadius();
			return print;
		}else
		return "color: " + getColor() + "\tradius: " + getRadius() + "\tFan is off ";
	}
	
	
}
