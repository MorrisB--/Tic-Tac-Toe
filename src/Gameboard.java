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

public class Gameboard {

	char[][] array = new char[3][3];

	// this may not be needed when we're done - MB
	public Gameboard() {
	}

	public void userPlays(int l) {

		if (l == 0 || l == 1 || l == 2) {
			if (this.array[0][l] == 0)
				this.array[0][l] = 'X';
			else
				System.out.println("You cannot play there!");
			// next the user needs to be prompted to choose another spot - MB
		} else if (l == 3 || l == 4 || l == 5) {
			if (this.array[1][l] == 0)
				this.array[1][l] = 'X';
			else
				System.out.println("You cannot play there!");
		} else if (l == 6 || l == 7 || l == 8) {
			if (this.array[1][l] == 0)
				this.array[1][l] = 'X';
			else
				System.out.println("You cannot play there!");
		}
		this.checkWins();
		// print the board afterwards, something like printGameBoard() - MB
	}

	// MB
	// 1) Check if location is empty
	// 2) If the location is empty call checkNeighboors()
	// 3) Play 'O' at [bestY][bestX]
	public void computerPlays() {

		int bestX, bestY, chances = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				// can combine these next two statements - MB
				if (this.array[i][j] == 0) {
					if (bestWin(this.array, i, j) > chances){
						chances = bestWin(this.array, i, j);
						bestX = j;
						bestY = i;
					}
				}
			}
		}
		
		this.checkWins();
	}

	public static int bestWin(char[][] a, int i, int j) {

		return 0;

	}

	// this may need to be boolean - MB
	public void checkWins() {

	}

	public static void printModelBoard() {
		System.out.println("Model Board:");
		System.out.println("  0 | 1 | 2");
		System.out.println("-------------");
		System.out.println("  3 | 4 | 5");
		System.out.println("-------------");
		System.out.println("  6 | 7 | 8\n");
	}

}
