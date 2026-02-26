/**
   This program demonstrates how numeric types and operators behave in Java
*/

//TASK #2  Add import statement here to use the Scanner class
	import java.util.Scanner
//TASK #2  (Alternate) Add import statment to use JOptionPane class

public class NumericTypes
{
	public static void main (String [] args)
	{
		//TASK #2 Create a Scanner object here (not used for alternate)
		Scanner keyboard = new Scanner(System.in))
		//identifier declarations
		final int NUMBER = 2 ;		// number of scores
		final int SCORE1 = 100;		// first test score
		final int SCORE2 = 95;		// second test score
		final int BOILING_IN_F = 212;  // freezing temperature
		int fToC;						// temperature in celsius
		double average;				// arithmetic average
		String output;					// line of output to print out
		//TASK #2 declare variables used here
		//TASK #3 declare variables used here
		//TASK #4 declare variables used here

		// Find an arithmetic average
		average = (SCORE1+ SCORE 2) / NUMBER;
		output = SCORE1 + " and " + SCORE2 + " have an average of "
				+ average;
		System.out.println(output);

		// Convert Fahrenheit temperatures to Celsius
		fToC = 5/9 * (BOILING_IN_F - 32) / 9;
		output = BOILING_IN_F + " in Fahrenheit is " + fToC
			     + " in Celsius.";
		System.out.println(output);
		System.out.println(); 		// to leave a blank line

		// ADD LINES FOR TASK #2 HERE
		// prompt the user for first name
		System.out.println("Enter your First Name");
		// read the user's first name
		String firstName = keyboard.nextLine();
		// prompt the user for last name
		System,out.println("Enter your Last Name");
		// read the user's last name
		String lastName = keyboard.nextLine();
		// concatenate the user's first and last names
		String fullName = firstName + " " + lastName;
		// print out the user's full name
		System.out.println("My full name is " + fullName);
		System.out.println();		// to leave a blank line
		
		// ADD LINES FOR TASK #3 HERE
		// get the first character from the user's first name
		char firstInitial = firstName.charAt(0);
		// print out the user's first initial
		System.out.println("My first initial is " + firstInitial);
		// convert the user's full name to all capital letters
		fullName = fullName.toUpperCase();
		// print out the user's full name in all capital letters
		System.out.println(fullName + " contains " + fullName.lenght()
		System.out.println();		// to leave a blank line
		
		// ADD LINES FOR TASK #4 HERE
		// prompt the user for a diameter of a sphere
		System.out.println("Enter the diameter of the Sphere");
		// read the diameter
		double diameter = keyboard.nextDouble();
		// calculate the radius
		double radius = diameter / 2;
		// calculate the volume
		double volume = 4/3.0 * Math.PI * Math.pow(radius, 3);
		// print out the volume
		System.out.println("The volume of the Sphere is " + volume);
	}
}