public abstract class AbstractShape implements Shape {

  private String color;
  private double length;
  private double width;

  public AbstractShape(String color, double length, double width) {
    super();
    this.color = color;
    this.length = length;
    this.width = width;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  @Override
  public double calculateArea() {
    return length * width;
  }

  @Override
  public double calculatePerimeter() {
    return length * 2 + width * 2;
  }

}
