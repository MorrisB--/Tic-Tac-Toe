/** 
 * Tic Tac Toe Game
 */
import java.util.*;

public class TicTacToe extends Gameboard {

	public static void main(String[] args) {
		try {
			
			Gameboard gameboard = new Gameboard();
			Scanner keyboard = new Scanner(System.in);

			int location;
			gameboard.printGameboard();

			while (gameboard.checkWinner() == false) {

				printModelBoard();				
				System.out.println("Choose a location to play: ");
				location = keyboard.nextInt();
				
				System.out.println("YOUR MOVE...");
				boolean validMove = gameboard.userPlays(location);
				
				System.out.println();
				if (validMove && gameboard.checkWinner() == false) {
					System.out.println("COMPUTER'S MOVE...");
					gameboard.computerPlays();
					System.out.println();
				}
			}
			gameboard.winningPlayer();
		}

		// Can you figure out a way to break our program?
		catch (Exception e) {
			System.out.println("Congrats, you broke the program.");
		}
	}
}
