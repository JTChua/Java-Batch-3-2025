public class Rectangle extends AbstractShape {

  public Rectangle(String color, double length, double width) {
    super(color, length, width);
  }

  @Override
  public double calculateArea() {
    return getLength() * getWidth();
  }

  @Override
  public double calculatePerimeter() {
    return 2 * (getLength() + getWidth());
  }

  @Override
  public void printDetails() {
    System.out.println("== + == Rectangle Details == + ==");
    System.out.printf("Length: %.2f%n", getLength());
    System.out.printf("Width: %.2f%n", getWidth());
    super.printDetails();
  }

}
