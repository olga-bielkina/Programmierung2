package tic_tac_toe;

/**
 * This class represents a geometric object in 2D space.
 *
 * @author olga.bielkina
 *
 */
public class GeometricObject {

  private int x; // Height.
  private int y; // Width.


  public GeometricObject(final int x, final int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return this.y;
  }

  public void setY(int y) {
    this.y = y;
  }

}
