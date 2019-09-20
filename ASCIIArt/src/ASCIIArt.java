/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

public class ASCIIArt {
	public static void main(String[] args) {
		System.out.println("\nA Spectacular Checkmate by White");
		printGridLines();
		printWhiteKing();
		printGridLines();
		printWhiteRook();
		printGridLines();
		printEmptyRows();
		printGridLines();
		printEmptyRows();
		printGridLines();
		printBlackRook();
		printGridLines();
		printWhiteRook2();
		printGridLines();
		printWhiteQueen();
		printGridLines();
		printBlackKing();
		printGridLines();

	}

	// Print empty rows
	public static void printEmptyRows() {
		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           |\n");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           |\n");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           |\n");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           |\n");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           |\n");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           |\n");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           |\n");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           |\n");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           |\n");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           |\n");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           |\n");

	}

	// Print the 2nd chess piece White Rook
	public static void printWhiteRook2() {
		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|     ___    ___    ___     |");
		/* adds the grid lines for the other squares */
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|    |   |__|   |__|   |    |");
		/* adds the grid lines for the other squares */
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|    |                 |    |");
		/* adds the grid lines for the other squares */
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|    |                 |    |");
		/* adds the grid lines for the other squares */
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|     \\               /     |");
		/* adds the grid lines for the other squares */
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|      |             |      |");
		/* adds the grid lines for the other squares */
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|      |             |      |");
		/* adds the grid lines for the other squares */
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|      |             |      |");
		/* adds the grid lines for the other squares */
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|     /               \\     |");
		/* adds the grid lines for the other squares */
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|    |                 |    |");
		/* adds the grid lines for the other squares */
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|    |_________________|    |");
		/* adds the grid lines for the other squares */
		System.out.println("                           |");
	}

	// Print the chess piece White Queen
	public static void printWhiteQueen() {

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|             _             ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|    _      (   )      _    ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|  (   )     | |     (   )  ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|   \\  \\    |   |    /  /   ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|    \\  \\ _|     |_ /  /    ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|     |               |     ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|     |_______________|     ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|     |_______________|     ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|      \\_____________/      ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|       \\___________/       ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|                           |");

	}

	// Print the chess piece White King
	public static void printWhiteKing() {
		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|             __            ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|          __|  |__         ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|         |__    __|        ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|            |__|           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|        __ (    ) __       ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|      (    \\    /    )     ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|       \\    \\  /    /      ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|        \\__________/       ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|        |__________|       ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|                           |");
	}

	// Print the chess piece Black King
	public static void printBlackKing() {
		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|             __            |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|          __|..|__         |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|         |__....__|        |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|            |__|           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|        __ (....) __       |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|      (....\\..../....)     |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|       \\....\\../..../      |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|        \\__________/       |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|        |__________|       |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.println("|                           |");

	}

	// Print the chess piece Black Rook
	public static void printBlackRook() {
		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|     ___    ___    ___     |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|    |...|__|...|__|...|    |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|    |.................|    |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|    |.................|    |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|     \\.............../     |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|      |.............|      |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|      |.............|      |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|      |.............|      |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|     /...............\\     |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|    |.................|    |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.println("                           |");

		System.out.print("|                          ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|                           ");
		System.out.print("|    |_________________|    |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.println("                           |");
	}

	// Print the chess piece White Rook
	public static void printWhiteRook() {
		// Lines for the chess piece
		System.out.print("|    ___    ___    ___     |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.println("                           |");

		// Lines for the chess piece
		System.out.print("|   |   |__|   |__|   |    | ");
		/* adds the grid lines for the other squares */
		System.out.print("                          |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.println("                           |");

		// Lines for the chess piece
		System.out.print("|   |                 |    |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.println("                           |");

		// Lines for the chess piece
		System.out.print("|   |                 |    |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.println("                           |");

		// Lines for the chess piece
		System.out.print("|    \\               /     |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.println("                           |");

		// Lines for the chess piece
		System.out.print("|     |             |      |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.println("                           |");

		// Lines for the chess piece
		System.out.print("|     |             |      |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.println("                           |");

		// Lines for the chess piece
		System.out.print("|     |             |      |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.println("                           |");

		// Lines for the chess piece
		System.out.print("|    /               \\     |");
		/* adds the grid lines for the other squares */
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.println("                           |");

		// Lines for the chess piece
		System.out.print("|   |                 |    | ");
		/* adds the grid lines for the other squares */
		System.out.print("                          |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.println("                           |");

		// Lines for the chess piece
		System.out.print("|   |_________________|    | ");
		/* adds the grid lines for the other squares */
		System.out.print("                          |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.print("                           |");
		System.out.println("                           |");
	}

	// Print the chess game board lines
	public static void printGridLines() {
		System.out.print("____________________________");
		System.out.print("____________________________");
		System.out.print("____________________________");
		System.out.print("____________________________");
		System.out.print("____________________________");
		System.out.print("____________________________");
		System.out.print("____________________________");
		System.out.print("____________________________");
		System.out.println();
		System.out.println();
	}

}