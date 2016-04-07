/** 
 * /// Tic Tac Toe Game \\\
 */
import java.util.*;

public class TicTacToe extends Gameboard {
	
   public static void main(String[] args) {

   
		try {
			Gameboard gameboard = new Gameboard();
		
			Scanner keyboard = new Scanner(System.in);
			
         //create a variable for the user's location below
         int location;
		   gameboard.printGameboard();
			//We are going to keep going through this loop as long as we do not have a winner
			while (gameboard.checkWinner() == false) {
			
				printModelBoard();
				System.out.println("Choose a location to play: ");
				location = keyboard.nextInt();
            System.out.println("YOUR MOVE..."); 
				boolean validMove = gameboard.userPlays(location);
            System.out.println(); 
            if (validMove && gameboard.checkWinner() == false)
            {
			      System.out.println("COMPUTER'S MOVE...");
               gameboard.computerPlays();
               System.out.println();   
            }		

			}//end of while loop
         //this statement will print out the winner or if the game is a stalemate			
		   gameboard.winningPlayer();
      }//end of try statement

	   //if an error occurs in the program, an exception statment will be thrown
		catch (Exception e) {
			System.out.println("Congrats, you broke the program.");
		}
	}//end main method
}//end tic tac toe class
