/** 
 * /// ADD PROPER DESCRIPTION OF CLASS HERE \\\
 * 
 * @author Morris Ballenger
 * @author // ADD NAME HERE \\
 * @author // ADD NAME HERE \\
 * @version 1.0
 * @since 03-19-2016
 * 
 */

import java.util.*;

// There will be an excessive amount of comments so when they start editing the code they can understand what is going on
public class TicTacToe {
	public static void main(String[] args) {
		try {
			/*
			 * This code is asking the user to choose a location on the board
			 */
			System.out.println("Please choose a location to play: \n");
			printModelBoard();
			Scanner keyboard = new Scanner(System.in);
			// need to handle exceptions for when they try to break the program
			System.out.print("Enter choice here:");
			int location = keyboard.nextInt();
			keyboard.close();
		}

		/*
		 * Instead of declaring each type of exception we want to catch I
		 * figured we can just catch everything
		 */
		catch (Exception e) {
			
			System.out.println("Congrats, you broke the program");

		}
	}

	public static void printModelBoard() {
		System.out.println("  0 | 1 | 2");
		System.out.println("-------------");
		System.out.println("  3 | 4 | 5");
		System.out.println("-------------");
		System.out.println("  6 | 7 | 8\n");
	}
}
