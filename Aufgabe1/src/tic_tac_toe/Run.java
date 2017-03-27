package tic_tac_toe;

public class Run {

  public static void main(String[] args) {

    Controller game = new Controller();
    game.setCurrentPlayer("X");
    game.play();


  }

}
