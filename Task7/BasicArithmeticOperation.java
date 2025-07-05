
public class BasicArithmeticOperation {

  int a;
  int b;

  public BasicArithmeticOperation(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int sum() {
    int s = a + b;
    return s;
  }

  public int difference() {
    int d = a - b;
    return d;
  }

  public int product() {
    int p = a * b;
    return p;
  }

  public int qoutient() {
    int q;
    q = a / b;
    return q;
    // try {
    // if (b > a) {
    // throw new ArithmeticException("Cannot divide by zero.");
    // }
    // double q = a / b;
    // return q;
    // } catch (ArithmeticException e) {
    // System.err.println(e.getMessage());
    // }
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
