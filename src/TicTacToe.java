
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
public class TicTacToe extends Gameboard {
	public static void main(String[] args) {

		try {
			Gameboard gameboard = new Gameboard();
			// This may not make sense once the Gameboard class is complete - MB
			// boolean win = false, lose = false;
			Scanner keyboard = new Scanner(System.in);
			int location;
			// Can make this much nicer just trying to get it to work first - MB

			// keep messing around with this if your having issues - MB
			while (gameboard.checkWinner() == false) {
				/*
				 * This code is asking the user to choose a location on the
				 * board
				 */
				printModelBoard();
				gameboard.printGameboard();
				System.out.println("Choose a location to play: ");
				location = keyboard.nextInt();
				gameboard.userPlays(location);
				gameboard.computerPlays();
				gameboard.printGameboard();
				//System.out.println(gameboard.checkWinner());

				// Commented this out just in case it breaks something - MB
				// keyboard.close();
			
			
			
	}
			
		gameboard.winningPlayer();}
			//int winnerIs = gameboard.checkWinner();
			/*
			* I added these case statements because I wanted to know exactly what
			* was being returned. This can be shortened when we're finished. - MB
			*/
		/*	switch (winnerIs) {
			case 1:
				System.out.println("You win!");
				break;
			case 2:
				System.out.println("You lose.");
				break;
			case 3:
				System.out.println("Stalemate! Nobody wins.");
				break;
			case 79:
				System.out.println("Returned O");
				break;
			case 88:
				System.out.println("Returned X");
				break;
			default:
				System.out.println("Did not return correct number: " + gameboard.checkWinner());
				break;
			}
			// if win == true print you win - MB
			// if lose == true print you lose - MB
		}*/

		/*
		 * Instead of declaring each type of exception we want to catch I
		 * figured we can just catch everything
		 */
		catch (Exception e) {
			System.out.println("Congrats, you broke the program.");
		}
	}
}
