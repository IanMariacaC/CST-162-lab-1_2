// ****************************************************************
// NumberExceptions.java
//
// Reads the dividend and divisor 
// Calculates the quotient by dividing the dividend by the divisor
// Outputs the result         
// ****************************************************************
import java.util.Scanner;


public class NumberExceptions {

	/**
	 * Chapter 11 Lab part 2
	 */
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int dividend, divisor, quotient;
		
		System.out.println("Enter the dividend ");
		dividend = keyboard.nextInt();
		System.out.println("Enter the divisor");
		divisor = keyboard.nextInt();
			
		quotient = dividend / divisor;
			
		System.out.print("\nDividend = " + dividend + "\nDivisor = " + divisor +
					         "\nQuotient = " + quotient);

	}

}