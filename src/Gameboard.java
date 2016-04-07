//This is the code used to placed user's selection on the board
//and to optimally select the computer's position to play
public class Gameboard {

    //the "board" for the game is created in the statement below 
	 char[][] array = {{' ', ' ', ' '},
                      {' ', ' ', ' '},
                      {' ', ' ', ' '}};
    //this variable below stores the winning character 
    //this value will end up holding 'O', 'X' or 'S' for stalemate
    public static char winner; 


	public Gameboard() {
	}

	public boolean userPlays(int l) {
   
      boolean isValidMove = true; 

		if (l == 0 || l == 1 || l == 2) 
      {
			if (this.array[0][l] == ' ')
				this.array[0][l] = 'X';
         else
		   {
		      System.out.println("You cannot play there!");
            isValidMove = false; 
         }
         
      } 
      else if (l == 3 || l == 4 || l == 5) 
      {
			if (this.array[1][l-3] == ' ')
				this.array[1][l-3] = 'X';
         else
		   {
		      System.out.println("You cannot play there!");
            isValidMove = false; 
         }
		} 
      else if (l == 6 || l == 7 || l == 8) 
      {
			if (this.array[2][l-6] == ' ')
				this.array[2][l-6] = 'X';
         else
		   {
		      System.out.println("You cannot play there!");
            isValidMove = false; 
         }
		}
      else
		{
		   System.out.println("You cannot play there!");
         isValidMove = false; 
      }
      if(isValidMove)
         printGameboard();
          
      return isValidMove; 
	}//end of userPlays() method

	/**
	 *This method will choose which position the computer should play
    *The computer will first check if a win is possible, if not
    *The computer will check if a block is needed, if not the 
    *The computer will check for the move with the most possibilities to win
    *The gameboard will then print with the computer's move
	 */
	public void computerPlays() {
      if(winsNow() == false)
         if(block() == false) 
            this.bestWin();
      printGameboard(); 
	}

	/**
	 * This method will check the current Gameboard and place an 'O' only if
	 * that will allow the computer to win in its current move. If not then this
	 * method will do nothing
	 */
	public boolean winsNow() {
		
		// checking for position 0
		if (this.array[0][1] == 'O' && this.array[0][2] == 'O' && array[0][0] == ' ') {
			this.array[0][0] = 'O';
			return true;
		} // checking for position 1
		else if (this.array[0][0] == 'O' && this.array[0][2] == 'O' && array[0][1] == ' ') {
			this.array[0][1] = 'O';
			return true;
		} // checking for position 2
		else if (this.array[0][0] == 'O' && this.array[0][1] == 'O' && array[0][2] == ' ') {
			this.array[0][2] = 'O';
			return true;
		} // checking for position 3
		else if (this.array[1][1] == 'O' && this.array[1][2] == 'O' && array[1][0] == ' ') {
			this.array[1][0] = 'O';
			return true;
		} // checking for position 4
		else if (this.array[1][0] == 'O' && this.array[1][2] == 'O' && array[1][1] == ' ') {
			this.array[1][1] = 'O';
			return true;
		} // checking for position 5
		else if (this.array[1][0] == 'O' && this.array[1][1] == 'O' && array[1][0] == ' ') {
			this.array[1][2] = 'O';
			return true;
		} // checking for position 6
		else if (this.array[2][1] == 'O' && this.array[2][2] == 'O' && array[2][0] == ' ') {
			this.array[2][0] = 'O';
			return true;
		} // checking for position 7
		else if (this.array[2][0] == 'O' && this.array[2][2] == 'O' && array[2][1] == ' ') {
			this.array[2][1] = 'O';
			return true;
		} // checking for position 8
		else if (this.array[2][0] == 'O' && this.array[2][1] == 'O'&& array[2][2] == ' ') {
			this.array[2][2] = 'O';
			return true;
		}
		/*
		 * Checking for vertical wins
		 */
		// checking for position 0
		else if (this.array[1][0] == 'O' && this.array[2][0] == 'O'&& array[0][0] == ' ') {
			this.array[0][0] = 'O';
			return true;
		} // checking for position 1
		else if (this.array[1][1] == 'O' && this.array[2][1] == 'O'&& array[0][1] == ' ') {
			this.array[0][1] = 'O';
			return true;
		} // checking for position 2
		else if (this.array[1][2] == 'O' && this.array[2][2] == 'O' && array[0][2] == ' ') {
			this.array[0][2] = 'O';
			return true;
		} // checking for position 3
		else if (this.array[0][0] == 'O' && this.array[2][0] == 'O' && array[1][0] == ' ') {
			this.array[1][0] = 'O';
			return true;
		} // checking for position 4
		else if (this.array[0][1] == 'O' && this.array[2][1] == 'O' && array[1][1] == ' ') {
			this.array[1][1] = 'O';
			return true;
		} // checking for position 5
		else if (this.array[0][2] == 'O' && this.array[2][2] == 'O' && array[1][2] == ' ') {
			this.array[1][2] = 'O';
			return true;
		} // checking for position 6
		else if (this.array[0][0] == 'O' && this.array[1][0] == 'O' && array[2][0] == ' ') {
			this.array[2][0] = 'O';
			return true;
		} // checking for position 7
		else if (this.array[0][1] == 'O' && this.array[1][1] == 'O' && array[2][1] == ' ') {
			this.array[2][1] = 'O';
			return true;
		} // checking for position 8
		else if (this.array[0][2] == 'O' && this.array[1][2] == 'O' && array[2][2] == ' ') {
			this.array[2][2] = 'O';
			return true;
		}
		/*
		 * Checking for diagonals
		 */
		// checking for position 0
		else if (this.array[1][1] == 'O' && this.array[2][2] == 'O' && array[0][0] == ' ') {
			this.array[0][0] = 'O';
			return true;
		} // checking for position 2
		else if (this.array[1][1] == 'O' && this.array[2][0] == 'O' && array[0][2] == ' ') {
			this.array[0][2] = 'O';
			return true;
		} // checking for position 4 right
		else if (this.array[0][0] == 'O' && this.array[2][2] == 'O' && array[1][1] == ' ') {
			this.array[1][1] = 'O';
			return true;
		} // checking for position 4 left
		else if (this.array[0][2] == 'O' && this.array[2][0] == 'O' && array[1][1] == ' ') {
			this.array[1][1] = 'O';
			return true;
		} // checking for position 6
		else if (this.array[1][1] == 'O' && this.array[0][2] == 'O' && array[2][0] == ' ') {
			this.array[2][0] = 'O';
			return true;
		} // checking for position 8
		else if (this.array[0][0] == 'O' && this.array[1][1] == 'O' && array[2][2] == ' ') {
			this.array[2][2] = 'O';
			return true;
		}
		return false;
	}

	/**
	 * This method will check the current Gameboard and play an 'O' in the
	 * location that will prevent the user from winning on the next move.
	 */
	public boolean block() {
         //checking for horizontal wins
			// checking for position 0
			if (this.array[0][1] == 'X' && this.array[0][2] == 'X' && array[0][0] != 'O') {
				this.array[0][0] = 'O';
				return true;
			} // checking for position 1
			else if (this.array[0][0] == 'X' && this.array[0][2] == 'X' && array[0][1] != 'O') {
				this.array[0][1] = 'O';
				return true;
			} // checking for position 2
			else if (this.array[0][0] == 'X' && this.array[0][1] == 'X' && array[0][2] != 'O') {
				this.array[0][2] = 'O';
				return true;
			} 
         // checking for position 3
			else if (this.array[1][1] == 'X' && this.array[1][2] == 'X' && array[1][0] != 'O') {
				this.array[1][0] = 'O';
				return true;
			} // checking for position 4
			else if (this.array[1][0] == 'X' && this.array[1][2] == 'X' && array[1][1] != 'O') {
				this.array[1][1] = 'O';
				return true;
			}
          // checking for position 5
			else if (this.array[1][0] == 'X' && this.array[1][1] == 'X' && array[1][2] != 'O') {
				this.array[1][2] = 'O';
				return true;
			} // checking for position 6
			else if (this.array[2][1] == 'X' && this.array[2][2] == 'X' && array[2][0] != 'O') {
				this.array[2][0] = 'O';
				return true;
			} // checking for position 7
			else if (this.array[2][0] == 'X' && this.array[2][2] == 'X' && array[2][1] != 'O') {
				this.array[2][1] = 'O';
				return true;
			} // checking for position 8
			else if (this.array[2][0] == 'X' && this.array[2][1] == 'X' && array[2][2] != 'O') {
				this.array[2][2] = 'O';
				return true;
			}
			/*
			 * Checking for vertical wins
			 */
			// checking for position 0
			else if (this.array[1][0] == 'X' && this.array[2][0] == 'X' && array[0][0] != 'O') {
				this.array[0][0] = 'O';
				return true;
			} // checking for position 1
			else if (this.array[1][1] == 'X' && this.array[2][1] == 'X' && array[0][1] != 'O') {
				this.array[0][1] = 'O';
				return true;
			} // checking for position 2
			else if (this.array[1][2] == 'X' && this.array[2][2] == 'X' && array[0][2] != 'O') {
				this.array[0][2] = 'O';
				return true;
			} // checking for position 3
			else if (this.array[0][0] == 'X' && this.array[2][0] == 'X' && array[1][0] != 'O') {
				this.array[1][0] = 'O';
				return true;
			} // checking for position 4
			else if (this.array[0][1] == 'X' && this.array[2][1] == 'X' && array[1][1] != 'O') {
				this.array[1][1] = 'O';
				return true;
			} // checking for position 5
			else if (this.array[0][2] == 'X' && this.array[2][2] == 'X' && array[1][2] != 'O') {
				this.array[1][2] = 'O';
				return true;
			} // checking for position 6
			else if (this.array[0][0] == 'X' && this.array[1][0] == 'X' && array[2][0] != 'O') {
				this.array[2][0] = 'O';
				return true;
			} // checking for position 7
			else if (this.array[0][1] == 'X' && this.array[1][1] == 'X' && array[2][1] != 'O') {
				this.array[2][1] = 'O';
				return true;
			} // checking for position 8
			else if (this.array[0][2] == 'X' && this.array[1][2] == 'X' && array[0][2] != 'O') {
				this.array[2][2] = 'O';
				return true;
			}
			/*
			 * Checking for diagonals
			 */
			// checking for position 0
			else if (this.array[1][1] == 'X' && this.array[2][2] == 'X' && array[0][0] != 'O') {
				this.array[0][0] = 'O';
				return true;
			} // checking for position 2
			else if (this.array[1][1] == 'X' && this.array[2][0] == 'X' && array[0][2] != 'O') {
				this.array[0][2] = 'O';
				return true;
			} // checking for position 4 right
			else if (this.array[0][0] == 'X' && this.array[2][2] == 'X' && array[1][1] != 'O') {
				this.array[1][1] = 'O';
				return true;
			} // checking for position 4 left
			else if (this.array[0][2] == 'X' && this.array[2][0] == 'X' && array[1][1] != 'O') {
				this.array[1][1] = 'O';
				return true;
			} // checking for position 6
			else if (this.array[1][1] == 'X' && this.array[0][2] == 'X' && array[2][0] != 'O') {
				this.array[2][0] = 'O';
				return true;
			} // checking for position 8
			else if (this.array[0][0] == 'X' && this.array[1][1] == 'X' && array[2][2] != 'O') {
				this.array[2][2] = 'O';
				return true;
			}
		return false;
	}

	/**
	 * Looks in all the locations of the array and determines the best spot to
	 * play. If there is not an optimal spot the game is a stalemate.
	 */
	public void bestWin() {

         int wins = -1, bestX = -1, bestY = -1;
			// checking location 0
			if (this.array[0][0] == ' ') {
				int possibleWins = 0;
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
			if (this.array[0][1] == ' ') {
				int possibleWins = 0;
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
			if (this.array[0][2] == ' ') {
				int possibleWins = 0;
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
			if (this.array[1][0] == ' ') {
				int possibleWins = 0;
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
			if (this.array[1][1] == ' ') {
				int possibleWins = 0;
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
			if (this.array[1][2] == ' ') {
				int possibleWins = 0;
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
			if (this.array[2][0] == ' ') {
				int possibleWins = 0;
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
			if (this.array[2][1] == ' ') {
				int possibleWins = 0;
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
			if (this.array[2][2] == ' ') {
				int possibleWins = 0;
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
         if ( this.array[0][0] == ' ')
            return false; 
			winner =( this.array[0][0]);
         return true;}

		// middle row
		if ((this.array[1][0] == this.array[1][1]) && (this.array[1][1] == this.array[1][2])){
         if ( this.array[1][0] == ' ')
            return false; 
			winner = ( this.array[1][0]);
         return true; }

		// bottom row
		if ((this.array[2][0] == this.array[2][1]) && (this.array[2][1] == this.array[2][2])){
         if ( this.array[2][0] == ' ')
            return false;  
			winner = ( this.array[2][0]);
         return true;}
		// left column
		if ((this.array[0][0] == this.array[1][0]) && (this.array[1][0] == this.array[2][0])){
         if ( this.array[0][0] == ' ')
            return false;  
			winner = ( this.array[0][0]);
         return true;}
		// middle column
		if ((this.array[0][1] == this.array[1][1]) && (this.array[1][1] == this.array[2][1])){
         if ( this.array[0][1] == ' ')
            return false; 
			winner = ( this.array[0][1]);
         return true; }
		// right column
		if ((this.array[0][2] == this.array[1][2]) && (this.array[1][2] == this.array[2][2])){
			if ( this.array[0][2] == ' ')
            return false; 
         winner = ( this.array[0][2]);
         return true; 
         }

		// diagonal down
		if ((this.array[0][0] == this.array[1][1]) && (this.array[1][1] == this.array[2][2])){
			if(this.array[0][0] == ' ')
				return false;
         winner =(array[0][0]); 
         return true; 
		}
		// diagonal up
		if ((this.array[0][2] == this.array[1][1]) && (this.array[1][1] == this.array[2][0])){
         if ( this.array[0][2] == ' ')
            return false; 
			winner =( this.array[0][2]);
         return true; 
         }

		for (int i = 0; i < this.array.length; i++) {
			for (int j = 0; j < this.array[i].length; j++) {
				if (this.array[i][j] == ' ')
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
      int i,j;
      
		for (i = 0; i < this.array.length; i++) {
			for (j = 0; j < this.array[i].length-1; j++) {
				System.out.print(this.array[i][j] + " | ");
			}
         System.out.print(array[i][j]);
         System.out.println(); 
			System.out.println("----------");
		}

	}
   //print reference board for user
	public static void printModelBoard() {
		System.out.println("Model Board:");
		System.out.println("  0 | 1 | 2");
		System.out.println("-------------");
		System.out.println("  3 | 4 | 5");
		System.out.println("-------------");
		System.out.println("  6 | 7 | 8\n");
	}

}
