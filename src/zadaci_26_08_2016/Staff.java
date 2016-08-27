package zadaci_26_08_2016;

public class Staff extends Employee{
	// Data field
		private String title;

		// Constructors creates a Staff object with specified parameters
		public Staff(String name, String address, String phone,  
			String email, int office, double salary, String title) {
			
			super(name, address, phone, email, office, salary);
			this.title = title;
		}

		/*********************** Getter and Setter methods ***************************/
		
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
		
		/*********************** End of Getter and Setter methods ***************************/
		
		// Returns string representation of the class 
		public String toString() {
			return super.toString() + "\nTitle: " + title;
		}
}
