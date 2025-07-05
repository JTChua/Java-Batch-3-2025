
public class BasicArithmeticOperation {

  private int a;
  private int b;

  public BasicArithmeticOperation(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int sum() {
    return a + b;
  }

  public int difference() {
    return a - b;
  }

  public int product() {
    return a * b;
  }

  public int qoutient() {
    try {
      if (b == 0) {
        throw new ArithmeticException("Cannot divide by zero.");
      }
      if (a == 0) {
        return 0;
      }
      return a / b;
    } catch (ArithmeticException e) {
      System.err.println(e.getMessage());
      return 0;
    }
  }

  @Override
  public String toString() {
    return "Sum of a & b = " + sum()
        + "\nDifference of a & b = " + difference()
        + "\nProduct of a & b = " + product()
        + "\nQoutient of a & b = " + qoutient();
  }

  public static void main(String[] args) {
    BasicArithmeticOperation arithmetic = new BasicArithmeticOperation(100, 10);
    System.out.println(arithmetic);
  }
}
