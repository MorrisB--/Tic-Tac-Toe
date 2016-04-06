/**
 * /// ADD PROPER DESCRIPTION OF CLASS HERE \\\
 * 
 * @author Morris Ballenger
 * @author // ADD NAME HERE \\
 * @author // ADD NAME HERE \\
 * @version 1.0
 * @since 03-27-2016
 * 
 */
//Test change 
public class Gameboard {

	char[][] array = new char [3][3];
   public static char winner; 

	// this may not be needed when we're done - MB
	public Gameboard() {
	}

	/**
	 * Finds the location that the user chose, if that location is not taken
	 * then 'X' is played at that location, then we call checkWins(). If there
	 * is value at that location then we tell them to choose a new location.
	 * 
	 * @param l
	 *            The location that the user chose to play
	 */
	public boolean userPlays(int l) {
   
      boolean isValidMove = true; 

		if (l == 0 || l == 1 || l == 2) {
			if (this.array[0][l] == 0)
				this.array[0][l] = 'X';
			else{
				System.out.println("You cannot play there!");
            isValidMove = false; 
            }
			// next the user needs to be prompted to choose another spot - MB
		} else if (l == 3 || l == 4 || l == 5) {
			if (this.array[1][l-3] == 0)
				this.array[1][l-3] = 'X';
			else{
				System.out.println("You cannot play there!");
            isValidMove = false; 
            }
		} else if (l == 6 || l == 7 || l == 8) {
			if (this.array[2][l-6] == 0)
				this.array[2][l-6] = 'X';
			else
				{
				System.out.println("You cannot play there!");
            isValidMove = false; 
            }
		}
		// print the board afterwards, something like printGameBoard() - MB
      return isValidMove; 
	}

	/**
	 * Looks through the entire board. Once it finds an empty location it calls
	 * the bestWins() method. Once it finds the best location for the most
	 * possible wins it will play at that location [bestY][bestX]. Then it will
	 * call the checkWins() function. NOTE. *** This needs to first check for
	 * the location that will allow the computer to win, then, check for the
	 * location with the most possible wins.***
	 */
	public void computerPlays() {
		this.bestWin();

		/*
		 * Old stuff may be needed later int bestX, bestY, chances = 0;
		 * 
		 * for (int i = 0; i < 2; i++) { for (int j = 0; j < 2; j++) { // can
		 * combine these next two statements - MB if (this.array[i][j] == 0) {
		 * if (bestWin(this.array, i, j) > chances) { chances =
		 * bestWin(this.array, i, j); bestX = j; bestY = i; } } } }
		 */
	}

	/**
	 * This method will check the current Gameboard and place an 'O' only if
	 * that will allow the computer to win in its current move. If not then this
	 * method will do nothing.
	 * 
	 */
	public boolean winsNow() {
		/*
		 * Starting with horizontals (or we can make very complicated if
		 * statements, with I would vote against because it may make the code
		 * harder to read)
		 */
		// checking for position 0
		if (this.array[0][1] == 'O' && this.array[0][2] == 'O') {
			this.array[0][0] = 'O';
			return true;
		} // checking for position 1
		else if (this.array[0][0] == 'O' && this.array[0][2] == 'O') {
			this.array[0][1] = 'O';
			return true;
		} // checking for position 2
		else if (this.array[0][0] == 'O' && this.array[0][1] == 'O') {
			this.array[0][2] = 'O';
			return true;
		} // checking for position 3
		else if (this.array[1][1] == 'O' && this.array[1][2] == 'O') {
			this.array[1][0] = 'O';
			return true;
		} // checking for position 4
		else if (this.array[1][0] == 'O' && this.array[1][2] == 'O') {
			this.array[1][1] = 'O';
			return true;
		} // checking for position 5
		else if (this.array[1][0] == 'O' && this.array[1][1] == 'O') {
			this.array[1][2] = 'O';
			return true;
		} // checking for position 6
		else if (this.array[2][1] == 'O' && this.array[2][2] == 'O') {
			this.array[2][0] = 'O';
			return true;
		} // checking for position 7
		else if (this.array[2][0] == 'O' && this.array[2][2] == 'O') {
			this.array[2][1] = 'O';
			return true;
		} // checking for position 8
		else if (this.array[2][0] == 'O' && this.array[2][1] == 'O') {
			this.array[2][2] = 'O';
			return true;
		}
		/*
		 * Checking for vertical wins
		 */
		// checking for position 0
		else if (this.array[1][0] == 'O' && this.array[2][0] == 'O') {
			this.array[0][0] = 'O';
			return true;
		} // checking for position 1
		else if (this.array[1][1] == 'O' && this.array[2][1] == 'O') {
			this.array[0][1] = 'O';
			return true;
		} // checking for position 2
		else if (this.array[1][2] == 'O' && this.array[2][2] == 'O') {
			this.array[0][2] = 'O';
			return true;
		} // checking for position 3
		else if (this.array[0][0] == 'O' && this.array[2][0] == 'O') {
			this.array[1][0] = 'O';
			return true;
		} // checking for position 4
		else if (this.array[0][1] == 'O' && this.array[2][1] == 'O') {
			this.array[1][1] = 'O';
			return true;
		} // checking for position 5
		else if (this.array[0][2] == 'O' && this.array[2][2] == 'O') {
			this.array[1][2] = 'O';
			return true;
		} // checking for position 6
		else if (this.array[0][0] == 'O' && this.array[1][0] == 'O') {
			this.array[2][0] = 'O';
			return true;
		} // checking for position 7
		else if (this.array[0][1] == 'O' && this.array[1][1] == 'O') {
			this.array[2][1] = 'O';
			return true;
		} // checking for position 8
		else if (this.array[0][2] == 'O' && this.array[1][2] == 'O') {
			this.array[2][2] = 'O';
			return true;
		}
		/*
		 * Checking for diagonals
		 */
		// checking for position 0
		else if (this.array[1][1] == 'O' && this.array[2][2] == 'O') {
			this.array[0][0] = 'O';
			return true;
		} // checking for position 2
		else if (this.array[1][1] == 'O' && this.array[2][0] == 'O') {
			this.array[0][2] = 'O';
			return true;
		} // checking for position 4 right
		else if (this.array[0][0] == 'O' && this.array[2][2] == 'O') {
			this.array[1][1] = 'O';
			return true;
		} // checking for position 4 left
		else if (this.array[0][2] == 'O' && this.array[2][0] == 'O') {
			this.array[1][1] = 'O';
			return true;
		} // checking for position 6
		else if (this.array[1][1] == 'O' && this.array[0][2] == 'O') {
			this.array[2][0] = 'O';
			return true;
		} // checking for position 8
		else if (this.array[0][0] == 'O' && this.array[1][1] == 'O') {
			this.array[2][2] = 'O';
			return true;
		}
		return false;
	}

	/**
	 * This method will check the current Gameboard and play an 'O' in the
	 * location that will prevent the user from winning on the next move. Note:
	 * This is essentially the winNow method but instead of looking for two 'X',
	 * we look for two 'O'. Consider finishing winNow() first. - MB
	 */
	public boolean block() {

		if (this.winsNow() == false) {
			/*
			 * Starting with horizontals (or we can make very complicated if
			 * statements, with I would vote against because it may make the
			 * code harder to read)
			 */
			// checking for position 0
			if (this.array[0][1] == 'X' && this.array[0][2] == 'X') {
				this.array[0][0] = 'O';
				return true;
			} // checking for position 1
			else if (this.array[0][0] == 'X' && this.array[0][2] == 'X') {
				this.array[0][1] = 'O';
				return true;
			} // checking for position 2
			else if (this.array[0][0] == 'X' && this.array[0][1] == 'X') {
				this.array[0][2] = 'O';
				return true;
			} 
         
         
         
          else if (this.array[0][2] == 'X' && this.array[1][1] == 'X') {
				this.array[0][2] = 'O';
				return true;
			}
         
         
         
         // checking for position 3
			else if (this.array[1][1] == 'X' && this.array[1][2] == 'X') {
				this.array[1][0] = 'O';
				return true;
			} // checking for position 4
			else if (this.array[1][0] == 'X' && this.array[1][2] == 'X') {
				this.array[1][1] = 'O';
				return true;
			}
          // checking for position 5
			else if (this.array[1][0] == 'X' && this.array[1][1] == 'X') {
				this.array[1][2] = 'O';
				return true;
			} // checking for position 6
			else if (this.array[2][1] == 'X' && this.array[2][2] == 'X') {
				this.array[2][0] = 'O';
				return true;
			} // checking for position 7
			else if (this.array[2][0] == 'X' && this.array[2][2] == 'X') {
				this.array[2][1] = 'O';
				return true;
			} // checking for position 8
			else if (this.array[2][0] == 'X' && this.array[2][1] == 'X') {
				this.array[2][2] = 'O';
				return true;
			}
			/*
			 * Checking for vertical wins
			 */
			// checking for position 0
			else if (this.array[1][0] == 'X' && this.array[2][0] == 'X') {
				this.array[0][0] = 'O';
				return true;
			} // checking for position 1
			else if (this.array[1][1] == 'X' && this.array[2][1] == 'X') {
				this.array[0][1] = 'O';
				return true;
			} // checking for position 2
			else if (this.array[1][2] == 'X' && this.array[2][2] == 'X') {
				this.array[0][2] = 'O';
				return true;
			} // checking for position 3
			else if (this.array[0][0] == 'X' && this.array[2][0] == 'X') {
				this.array[1][0] = 'O';
				return true;
			} // checking for position 4
			else if (this.array[0][1] == 'X' && this.array[2][1] == 'X') {
				this.array[1][1] = 'O';
				return true;
			} // checking for position 5
			else if (this.array[0][2] == 'X' && this.array[2][2] == 'X') {
				this.array[1][2] = 'O';
				return true;
			} // checking for position 6
			else if (this.array[0][0] == 'X' && this.array[1][0] == 'X') {
				this.array[2][0] = 'O';
				return true;
			} // checking for position 7
			else if (this.array[0][1] == 'X' && this.array[1][1] == 'X') {
				this.array[2][1] = 'O';
				return true;
			} // checking for position 8
			else if (this.array[0][2] == 'X' && this.array[1][2] == 'X') {
				this.array[2][2] = 'O';
				return true;
			}
			/*
			 * Checking for diagonals
			 */
			// checking for position 0
			else if (this.array[1][1] == 'X' && this.array[2][2] == 'X') {
				this.array[0][0] = 'O';
				return true;
			} // checking for position 2
			else if (this.array[1][1] == 'X' && this.array[2][0] == 'X') {
				this.array[0][2] = 'O';
				return true;
			} // checking for position 4 right
			else if (this.array[0][0] == 'X' && this.array[2][2] == 'X') {
				this.array[1][1] = 'O';
				return true;
			} // checking for position 4 left
			else if (this.array[0][2] == 'X' && this.array[2][0] == 'X') {
				this.array[1][1] = 'O';
				return true;
			} // checking for position 6
			else if (this.array[1][1] == 'X' && this.array[0][2] == 'X') {
				this.array[2][0] = 'O';
				return true;
			} // checking for position 8
			else if (this.array[0][0] == 'X' && this.array[1][1] == 'X') {
				this.array[2][2] = 'O';
				return true;
			}
		}
		return false;
	}

	/**
	 * Looks in all the locations of the array and determines the best spot to
	 * play, and plays in that spot. If there is not a best spot to play then it
	 * is a stalemate.
	 */
	public void bestWin() {

		if (this.winsNow() == false && this.block() == false) {
			int wins = -1, bestX = -1, bestY = -1;
			/*
			 * If you do not enter any if statements then the board is full,
			 * therefore, stalemate. Not sure if this should be done in this
			 * method or we should create a separate one.
			 */
			// checking location 0
			if (this.array[0][0] == 0) {
				int possibleWins = 0;
				// maybe this can be a switch statement - MB
				if (this.array[0][1] != 'X' && this.array[0][2] != 'X')
					possibleWins++;
				if (this.array[1][1] != 'X' && this.array[2][2] != 'X')
					possibleWins++;
				if (this.array[1][0] != 'X' && this.array[2][0] != 'X')
					possibleWins++;
				if (possibleWins > wins) {
					wins = possibleWins;
					bestY = 0;
					bestX = 0;
				}
			}
			// checking location 1
			if (this.array[0][1] == 0) {
				int possibleWins = 0;
				// maybe this can be a switch statement - MB
				if (this.array[0][0] != 'X' && this.array[0][2] != 'X')
					possibleWins++;
				if (this.array[1][1] != 'X' && this.array[2][1] != 'X')
					possibleWins++;
				if (possibleWins > wins) {
					wins = possibleWins;
					bestY = 0;
					bestX = 1;
				}
			}
			// checking location 2
			if (this.array[0][2] == 0) {
				int possibleWins = 0;
				// maybe this can be a switch statement - MB
				if (this.array[0][0] != 'X' && this.array[0][1] != 'X')
					possibleWins++;
				if (this.array[1][1] != 'X' && this.array[2][0] != 'X')
					possibleWins++;
				if (this.array[1][2] != 'X' && this.array[2][2] != 'X')
					possibleWins++;
				if (possibleWins > wins) {
					wins = possibleWins;
					bestY = 0;
					bestX = 2;
				}
			}
			// checking location 3
			if (this.array[1][0] == 0) {
				int possibleWins = 0;
				// maybe this can be a switch statement - MB
				if (this.array[1][1] != 'X' && this.array[1][2] != 'X')
					possibleWins++;
				if (this.array[0][0] != 'X' && this.array[2][0] != 'X')
					possibleWins++;
				if (possibleWins > wins) {
					wins = possibleWins;
					bestY = 1;
					bestX = 0;
				}
			}
			// checking location 4
			if (this.array[1][1] == 0) {
				int possibleWins = 0;
				// maybe this can be a switch statement - MB
				if (this.array[1][0] != 'X' && this.array[1][2] != 'X')
					possibleWins++;
				if (this.array[0][1] != 'X' && this.array[2][1] != 'X')
					possibleWins++;
				if (this.array[0][0] != 'X' && this.array[2][2] != 'X')
					possibleWins++;
				if (this.array[2][0] != 'X' && this.array[1][2] != 'X')
					possibleWins++;
				if (possibleWins > wins) {
					wins = possibleWins;
					bestY = 1;
					bestX = 1;
				}
			}
			// checking location 5
			if (this.array[1][2] == 0) {
				int possibleWins = 0;
				// maybe this can be a switch statement - MB
				if (this.array[1][0] != 'X' && this.array[1][1] != 'X')
					possibleWins++;
				if (this.array[0][2] != 'X' && this.array[2][2] != 'X')
					possibleWins++;
				if (possibleWins > wins) {
					wins = possibleWins;
					bestY = 1;
					bestX = 2;
				}
			}
			// checking location 6
			if (this.array[2][0] == 0) {
				int possibleWins = 0;
				// maybe this can be a switch statement - MB
				if (this.array[2][1] != 'X' && this.array[1][2] != 'X')
					possibleWins++;
				if (this.array[0][0] != 'X' && this.array[1][0] != 'X')
					possibleWins++;
				if (this.array[0][2] != 'X' && this.array[1][1] != 'X')
					possibleWins++;
				if (possibleWins > wins) {
					wins = possibleWins;
					bestY = 2;
					bestX = 0;
				}
			}
			// checking location 7
			if (this.array[2][1] == 0) {
				int possibleWins = 0;
				// maybe this can be a switch statement - MB
				if (this.array[2][0] != 'X' && this.array[2][2] != 'X')
					possibleWins++;
				if (this.array[0][1] != 'X' && this.array[1][1] != 'X')
					possibleWins++;
				if (possibleWins > wins) {
					wins = possibleWins;
					bestY = 2;
					bestX = 1;
				}
			}
			// checking location 8
			if (this.array[2][2] == 0) {
				int possibleWins = 0;
				// maybe this can be a switch statement - MB
				if (this.array[2][0] != 'X' && this.array[2][1] != 'X')
					possibleWins++;
				if (this.array[0][2] != 'X' && this.array[1][2] != 'X')
					possibleWins++;
				if (this.array[0][0] != 'X' && this.array[1][1] != 'X')
					possibleWins++;
				if (possibleWins > wins) {
					wins = possibleWins;
					bestY = 2;
					bestX = 2;
				}
			}
			/*
			 * If we find a best location to play then we will play at that
			 * location. If wins still equals -1, we have a stalemate.
			 */
			if (wins > -1)
				this.array[bestY][bestX] = 'O';
		}

	}

	// this may need to be boolean - MB
	/**
	 * Check to see if the user or computer won after their current move.
	 */
    
   public void winningPlayer(){
      
      if(winner == 'S')
         System.out.println("This is a stalemate!");
      else if (winner == 'X') 
         System.out.println("Congrats, you win!"); 
      else 
         System.out.println("Sorry, you lose!");  
   }
	public boolean checkWinner() {

		// top row
		if ((this.array[0][0] == this.array[0][1]) && (this.array[0][1] == this.array[0][2])){
         if ( this.array[0][0] == 0)
            return false; 
			winner =( this.array[0][0]);
         return true;}

		// middle row
		if ((this.array[1][0] == this.array[1][1]) && (this.array[1][1] == this.array[1][2])){
         if ( this.array[1][0] == 0)
            return false; 
			winner = ( this.array[1][0]);
         return true; }

		// bottom row
		if ((this.array[2][0] == this.array[2][1]) && (this.array[2][1] == this.array[2][2])){
         if ( this.array[2][0] == 0)
            return false;  
			winner = ( this.array[2][0]);
         return true;}
		// left column
		if ((this.array[0][0] == this.array[1][0]) && (this.array[1][0] == this.array[2][0])){
         if ( this.array[0][0] == 0)
            return false;  
			winner = ( this.array[0][0]);
         return true;}
		// middle column
		if ((this.array[0][1] == this.array[1][1]) && (this.array[1][1] == this.array[2][1])){
         if ( this.array[0][1] == 0)
            return false; 
			winner = ( this.array[0][1]);
         return true; }
		// right column
		if ((this.array[0][2] == this.array[1][2]) && (this.array[1][2] == this.array[2][2])){
			if ( this.array[0][2] == 0)
            return false; 
         winner = ( this.array[0][2]);
         return true; 
         }

		// diagonal down
		if ((this.array[0][0] == this.array[1][1]) && (this.array[1][1] == this.array[2][2])){
			//return this.array[0][0];
			
			if(this.array[0][0] == 0)
				return false;
         winner =(array[0][0]); 
         return true; 
			/*if(this.array[0][0] == 'X')
				return 1;
			if(this.array[0][0] == 'O')
				return 2;*/
		}
		// diagonal up
		if ((this.array[0][2] == this.array[1][1]) && (this.array[1][1] == this.array[2][0])){
         if ( this.array[0][2] == 0)
            return false; 
			winner =( this.array[0][2]);
         return true; 
         }

		for (int i = 0; i < this.array.length; i++) {
			for (int j = 0; j < this.array[i].length; j++) {
				if (this.array[i][j] == 0)
					return false;
			}
		}

		// stalemate
      winner = ('S');
      return true; 
      
	}

	/**
	 * Prints the current state of the Gameboard
	 */
	public void printGameboard() {

		System.out.println("Current Gameboard:");

		for (int i = 0; i < this.array.length; i++) {
			for (int j = 0; j < this.array[i].length; j++) {
				System.out.print(this.array[i][j] + " | ");
			}
         System.out.println(); 
			System.out.println("-------------");
		}

	}

	/**
	 * Prints a board so the user can reference where they want to play each
	 * move.
	 */
	public static void printModelBoard() {
		System.out.println("Model Board:");
		System.out.println("  0 | 1 | 2");
		System.out.println("-------------");
		System.out.println("  3 | 4 | 5");
		System.out.println("-------------");
		System.out.println("  6 | 7 | 8\n");
	}

}
