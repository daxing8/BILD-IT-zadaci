package zadaci_26_08_2016;

public class Faculty extends Employee{
	// Data field
		private String officeHours;
		private String rank;

		// Constructor creates Faculty object with specified parameters
		public Faculty(String name, String address, String phone, String email, 
			int office, double salary, String officeHours, String rank) {
			
			super(name, address, phone, email, office, salary);
			this.officeHours = officeHours;
			this.rank = rank;
		}

		/*********************** Getter and Setter methods ***************************/
		
		public String getOfficeHours() {
			return officeHours;
		}

		public void setOfficeHours(String officeHours) {
			this.officeHours = officeHours;
		}

		public String getRank() {
			return rank;
		}

		public void setRank(String rank) {
			this.rank = rank;
		}
		
		/*********************** End of Getter and Setter methods ***************************/
		
		// Returns a string representation of the class 
		public String toString() {
			return super.toString() + "\nOffice hours: " + officeHours +
			"\nRank: " + rank;
		}
}
