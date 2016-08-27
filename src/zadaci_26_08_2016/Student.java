package zadaci_26_08_2016;

public class Student extends Person {
	//data fields holding status of a student
	private int status;
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 2;
	public final static int JUNIOR = 3;
	public final static int SENIOR = 4;

	//Constructor creates Student object with specified parameters
	public Student(String name, String address,  
		String phone, String email, int status) {
		super(name, address, phone, email);
		this.status = status;
	}

	/*********************** Getter and Setter methods ***************************/
	
	public void setStatus(int status) {
		this.status = status; 
	}

	public String getStatus() {
		switch (status) {
			case 1 : return "freshman"; 
			case 2 : return "sophomore"; 
			case 3 : return "junior"; 
			case 4 : return "senior";
			default : return "Unknown"; 
		}
	}
	
	/********************* End of Getter and Setter methods ************************/

	// Return a string representation of the class
	public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	}
}
