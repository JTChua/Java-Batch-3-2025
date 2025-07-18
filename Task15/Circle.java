public class Circle extends AbstractShape {

  public Circle(String color, double radius) {
    super(color, 0, 0);
    this.radius = radius;
  }

  private double radius;

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }

  @Override
  public void printDetails() {
    System.out.println("== + == Circle Details == + ==");
    System.out.printf("Radius: %.2f%n", getRadius());
    super.printDetails();
  }

}
