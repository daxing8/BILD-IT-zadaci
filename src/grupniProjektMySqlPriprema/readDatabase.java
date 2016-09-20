package grupniProjektMySqlPriprema;

import java.sql.*;
import java.util.Scanner;

public class readDatabase {

	public static void main(String[] args) throws Exception{
		
		try {
			//Stores location of drivers to connect to MySQL server
			String driver = "com.mysql.jdbc.Driver";
			
			//Makes connection with MySQL server
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?useSSL=false", "root",
					"");
			//Creates statment
			Statement stat = conn.createStatement();
			
			Class.forName(driver);
			
			String query = "";
			
			//Prompts user to enter his option fo searching database
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your option bellow for searching database: \n");
			System.out.println("1. Search database by country name");
			System.out.println("2. Search database by city name");
			System.out.println("3. Search database by country population number");

			int option = input.nextInt();
			
			//Checks which option user entered and prints result of database search
			if (option == 1) {
				System.out.println("Enter a country name: ");
				String country = userInput();
				query = "SELECT * FROM country WHERE Name = '" + country + "';";
				ResultSet rs = stat.executeQuery(query);
				System.out.format("%17s%20s%22s%16s\n", "Name", "Region", "Population", "GNP");
				System.out.println("\t   ___________________________________________________________________");
				while (rs.next()) {
					System.out.format("%20s%22s%16s%19s\n", rs.getString("Name"), rs.getString("Region"),
							rs.getString("Population"), rs.getString("GNP"));
				}
			} else if (option == 2) {
				System.out.println("Enter a city name: ");
				String city = userInput();
				query = "SELECT * FROM city WHERE Name ='" + city + "';";
				ResultSet rs = stat.executeQuery(query);
				System.out.format("%20s%22s%16s%19s\n", "Name", "Country Code", "District", "Population");
				System.out.println("\t   ___________________________________________________________________");
				while (rs.next()) {
					System.out.format("%20s%22s%16s%19s\n", rs.getString("Name"), rs.getString("CountryCode"),
							rs.getString("District"), rs.getString("Population"));
				}
			} else if (option == 3) {
				System.out.println("Enter a country population: ");
				String population = userInput();
				query = "SELECT * FROM country WHERE Population <=" + population;
				ResultSet rs = stat.executeQuery(query);
				System.out.format("%20s%22s%16s%19s\n", "Name", "Region", "Population", "GNP");
				System.out.println("\t   ___________________________________________________________________");
				while (rs.next()) {
					System.out.format("%20s%22s%16s%19s\n", rs.getString("Name"), rs.getString("Region"),
							rs.getString("Population"), rs.getString("GNP"));
				}
				
			} else if (option < 1 || option > 3) {
				System.out.println("Wrong input. Enter only integer options from 1 - 3.\n");
				main(args);
			}
			input.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	//Takes input from user
	public static String userInput() {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))){
				System.out.println("Wrong input. Enter only String type data.");
			}
		}
		input.close();
		return str;
	}

}
