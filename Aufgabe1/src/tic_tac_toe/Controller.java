package tic_tac_toe;

import java.util.Scanner;

public class Controller {

  private final GameField spielfeld;
  private String currentPlayer;

  public String getCurrentPlayer() {
    return currentPlayer;
  }

  public void setCurrentPlayer(String currentPlayer) {
    this.currentPlayer = currentPlayer;
  }

  private String winner;

  public Controller() {
    this.spielfeld = new GameField();
  }

  private boolean hasWon() {
    return (checkRow() || checkColumn() || checkDiagonal());
  }

  /**
   *
   * @return
   */
  private boolean checkRow() {
    for (int i = 0; i < 3; i++) {
      if (checkForAWin(spielfeld.getBoard()[i][0], spielfeld.getBoard()[i][1],
          spielfeld.getBoard()[i][2]) == true) {
        return true;
      }
    }

    return false;
  }

  /**
   *
   * @return
   */
  private boolean checkColumn() {
    for (int i = 0; i < 3; i++) {
      if (checkForAWin(spielfeld.getBoard()[0][i], spielfeld.getBoard()[1][i],
          spielfeld.getBoard()[2][i]) == true) {
        return true;
      }
    }

    return false;
  }

  /**
   *
   * @return
   */
  private boolean checkDiagonal() {
    for (int i = 0; i < 3; i++) {
      if (checkForAWin(spielfeld.getBoard()[0][0], spielfeld.getBoard()[1][1],
          spielfeld.getBoard()[2][2]) == true) {
        return true;
      }
    }

    return false;
  }

  private void changePlayer() {

    if (currentPlayer == "X") {
      currentPlayer = "O";
    } else {
      currentPlayer = "X";
    }

  }

  /**
   *
   */
  public void play() {

    System.out.println("User X starts:");

    for (int i = 0; i < 9; i++) { // TODO: Magic number

      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter the row:");
      int row = scan.nextInt();
      System.out.println("Please enter the column:");
      int column = scan.nextInt();
      spielfeld.addSymbol(row, column, this.currentPlayer);
      printBoard();
      if (hasWon()) {
        this.winner = this.currentPlayer;
        System.out.println("The winner:" + this.currentPlayer);

        break;
      }
      changePlayer();
    }

    if (!hasWon()) {
      this.winner = "No winner";
      System.out.println("No winner:");

    }

  }


  /**
   *
   */
  private void printBoard() {

    System.out.println("------BOARD-------");

    for (int i = 0; i < 3; i++) {

      System.out.print("| ");

      for (int j = 0; j < 3; j++) {

        System.out.print(spielfeld.getBoard()[i][j] + " | ");

      }

      System.out.println();

      System.out.println("-------------");

    }

  }

  /**
   *
   * @param symbol_1
   * @param symbol_2
   * @param symbol_3
   * @return
   */
  private boolean checkForAWin(Field symbol_1, Field symbol_2, Field symbol_3) {
    return ((symbol_1.getSymbol() != "") && (symbol_1.getSymbol().equals(symbol_2.getSymbol()))
        && (symbol_2.getSymbol().equals(symbol_3.getSymbol())));
  }
}
