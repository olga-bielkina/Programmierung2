package tic_tac_toe;

/**
 * Here will be a board of the game represented.
 *
 * @author olga.bielkina
 *
 */
public class GameField {

  private Field[][] board = new Field[3][3];

  public GameField() {

    initializeFields();

  }

  /**
   * Add a symbol to the specified field.
   *
   * @param x Column.
   * @param y Row.
   * @param symbol "X" or "Y".
   */
  public void addSymbol(int x, int y, String symbol) {
    this.board[x][y].setSymbol(symbol);
  }

  public boolean isFinish() {

    boolean isFull = false;

    for (int i = 0; i < this.board[0].length; i++) {
      for (int j = 0; i < this.board[1].length; i++) {
        if (board[i][j].getSymbol() != " ") {

          isFull = true;

        }

      }
    }

    return isFull;
  }

  /**
   *
   */
  private void initializeFields() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[j][i] = new Field(j, i, "");
      }
    }

  }

  /**
   *
   * @return
   */
  public Field[][] getBoard() {
    return this.board;
  }


}
