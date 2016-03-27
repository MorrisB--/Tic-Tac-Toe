
/** 
 * /// ADD PROPER DESCRIPTION OF CLASS HERE \\\
 * 
 * @author Morris Ballenger
 * @author // ADD NAME HERE \\
 * @author // ADD NAME HERE \\
 * @version 1.5
 * @since 03-27-2016
 * 
 */

import java.util.*;

// There will be an excessive amount of comments so when they start editing the code they can understand what is going on
public class TicTacToe extends Gameboard{
	public static void main(String[] args) {
		try {
			Gameboard gameboard = new Gameboard();
			// This may not make sense once the Gameboard class is complete - MB
			boolean win = false, lose = false;
			Scanner keyboard = new Scanner(System.in);
			int location;
			// Can make this much nicer just trying to get it to work first - MB

			while (!win && !lose) {
				/*
				 * This code is asking the user to choose a location on the
				 * board
				 */
				printModelBoard();
				gameboard.toString();
				System.out.println("Choose a location to play: ");
				location = keyboard.nextInt();
				gameboard.userPlays(location);
				gameboard.computerPlays();
				// Commented this out just in case it breaks something - MB
				// keyboard.close();
			}

			// if win == true print you win - MB
			// if lose == true print you lose - MB
		}

		/*
		 * Instead of declaring each type of exception we want to catch I
		 * figured we can just catch everything
		 */
		catch (Exception e) {
			System.out.println("Congrats, you broke the program.");
		}
	}	
}