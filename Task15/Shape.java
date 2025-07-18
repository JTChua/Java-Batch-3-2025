public interface Shape {

  double calculateArea();

  double calculatePerimeter();

  default void printDetails() {
    System.out.printf("Area: %.2f%n", calculateArea());
    System.out.printf("Perimeter: %.2f%n", calculatePerimeter());
  }
}
