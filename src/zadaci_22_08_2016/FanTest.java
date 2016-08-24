package zadaci_22_08_2016;

public class FanTest {

	public static void main(String[] args) {
		
		/**
		 * Two Fan objects created for seting up Fan features
		 */
		Fan fanOne = new Fan();
		Fan fanTwo = new Fan();
		
		//Sets speed, radius, color and turns the fan 1 on
		fanOne.setSpeed(fanOne.FAST);
		fanOne.setRadius(10);
		fanOne.setColor("yellow");
		fanOne.setOn(true);
		
		//Sets speed, radius and color to fan 2
		fanTwo.setSpeed(fanTwo.MEDIUM);
		fanTwo.setRadius(5);
		fanTwo.setColor("blue");
		
		//Prints String representation of fan object with new set features
		System.out.println(fanOne.toString());
		System.out.println(fanTwo.toString());
	}
}
