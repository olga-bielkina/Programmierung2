package tic_tac_toe;

/**
 * Through this class will be a field of the game represented.
 *
 * @author olga.bielkina
 *
 */
public class Field extends GeometricObject {

  private String symbol = " "; // "X" or "O"
  private static final String X = "X";
  private static final String O = "O";

  public Field(final int x, final int y, final String symbol) {
    super(x, y);
    this.symbol = symbol;
  }

  public String getSymbol() {
    return this.symbol;
  }

  /**
   * Sets symbol for a field. It checks if the symbol is allowed.
   *
   * @param symbol "X" or "O".
   */
  public void setSymbol(String symbol) {

    if (symbol.equals(X) || symbol.equals(O)) {
      this.symbol = symbol;
    } else {
      System.out.println("Not allowed, please enter X or O !");
    }

  }

  @Override
  public String toString() {
    return (this.symbol );

  }

}
