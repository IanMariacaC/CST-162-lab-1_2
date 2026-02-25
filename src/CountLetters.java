// ****************************************************************
// CountLetters.java
//
// Reads a words from the standard input and prints the number of 
// occurrences of each letter in that word.
//          
// ****************************************************************
import java.util.Scanner;
public class CountLetters
{    
	/**
	 *  Chapter 11 Lab part 1
	 */

    public static void main(String[] args)
    {
    	Scanner keyboard = new Scanner(System.in);
    	int[] counts = new int[26];

    	//get word from user
    	System.out.print("Enter a single word (letters only, please): ");
    	String word = keyboard.nextLine();

    	//convert to all upper case
    	word = word.toUpperCase();

    	//count frequency of each letter in string
    	for (int i=0; i < word.length(); i++)
    		counts[word.charAt(i)-'A']++;

    	//print frequencies
    	System.out.println();
    	for (int i=0; i < counts.length; i++)
    		if (counts [i] != 0)
		System.out.println((char)(i +'A') + ": " + counts[i]);

    }


}
