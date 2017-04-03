package tic_tac_toe;

/**
 * Runs the game .
 * 
 * @author olga.bielkina
 *
 */
public class Run {

	public static void main(String[] args) {

		Controller game = new Controller();
		game.setCurrentPlayer("X");
		game.play();

	}

}
