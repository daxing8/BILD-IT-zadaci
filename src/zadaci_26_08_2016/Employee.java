package zadaci_26_08_2016;

public class Employee extends Person {
	
	//Private data fields 
	private int office;
	private double salary;
	private MyDate dateHired;

	//Construct Employee object with specified name, address, phone, email, office and salary
	public Employee(String name, String address, String phone, 
		String email, int office, double salary) {
		
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate();
	}

	/*********************** Getter and Setter methods ***************************/
	
	public int getOffice() {
		return office;
	}

	public String getSalary() {
		return salary + "";
	}

	public String getDateHired() {
		return dateHired.getMonth() + "/" + dateHired.getDay() 
				 + "/" + dateHired.getYear();
	}

	public void setOffice(int office) {
		this.office = office;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDateHired() {
		dateHired = new MyDate();
	}
	
	/*********************** Getter and Setter methods ***************************/
	
	
	// Return a string representation of the class
	public String toString() {
		return super.toString() + "\nOffice: " + office + 
				 "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
	}
}
