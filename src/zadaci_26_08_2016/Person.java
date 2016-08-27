package zadaci_26_08_2016;

public class Person {

	private String name;
	private String address;
	private String phone;
	private String email;

	//Default constructor
	public Person() {
		
	}

	//Construct Person object with specified name, address, phone and email 
	public Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	} 

	/********************** Getter and Setter methods **************************/
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	/********************** End of Getter and Setter methods **************************/
	
	//Return a string representation of the class 
	public String toString() {
		return "\nName: " + name + "\nAddress: " + address + 
				 "\nPhone number: " + phone + "\nEmail address: " + email;
	}
}
