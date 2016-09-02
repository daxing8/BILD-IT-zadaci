
/****************************************************************************************
 * (Reformat Java source code) Write a program that converts the Java source
 * code from the next-line brace style to the end-of-line brace style. For example,
 * the following Java source in (a) uses the next-line brace style. Your program
 * converts it to the end-of-line brace style in (b).
 * 
 * public class Test{
 * public static void main(String[] args)
 * {
 * // Some statements
 * 		}
 * }
 * (a) Next-line brace style
 * 
 * public class Test {
 * public static void main(String[] args) {
 * // Some statements
 * 		}
 * }
 * (b) End-of-line brace style
 * Your program can be invoked from the command line with the Java sourcecode
 * file as the argument. It converts the Java source code to a new format. For
 * example, the following command converts the Java source-code file Test.java
 * to the end-of-line brace style.
 * java Exercise12_12 Test.java
 ****************************************************************************************/


package zadaci_31_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak_1_ReformatSourceCode {

	public static void main(String[] args) {
		//If Comand line argument length is not 1 end the programe
		if (args.length != 1) {
            System.out.println("Invalid argument.");
            System.out.println("Usage: java zadaci_31_08_2016 Test.java");
            System.exit(1);
        }
		//Creates File object with command line argument as a file name 
        File file = new File(args[0]);
        //If the file doesn't exist end the program
        if (!file.exists()) {
            System.out.println(file + " does not exist.");
            System.exit(2);
        }
        //Creates a StringBuilder object to store reformated source code
        StringBuilder str = new StringBuilder();
        //Code that can throw an exception
        try {
        	//Scanner for reading the input from file
            Scanner input = new Scanner(file);
            
            //While there is tokens in file add them to the string
            while (input.hasNext()) {
                String s = input.nextLine();
                
                //If it contains next-line style change to end-line style
                if (s.contains("{")) {
                    str.append(" {");
                } else {
                	str.append("\n" + s );
                }
            }
            //Catches an exception and prints a stack trace
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        //Code that can throw an exception
        try {
        	//Writes a content of str to file
            PrintWriter output = new PrintWriter(file);
            output.print(str.toString());
            output.close();
          //Catches an exception and prints a stack trace
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Prints content of StringBuilder object to console
        System.out.println(str);
    }

    public static int getIndex(String s, char ch) {

        for (int i = 0; i < s.length(); i++) {
            if (ch == s.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

}
