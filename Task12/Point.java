
public class Point {

  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void print() {
    System.out.println("(" + x + ", " + y + ")");
  }

  public void scale() {
    this.x = this.x / 2.0;
    this.y = this.y / 2.0;
  }

}
