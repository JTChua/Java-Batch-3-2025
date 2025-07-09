public class Task9 {

  public static int add(int a, int b) {
    return Math.addExact(a, b);
  }

  public static int subtraction(int a, int b) {
    return Math.subtractExact(a, b);
  }

  public static int multiply(int a, int b) {
    return Math.multiplyExact(a, b);
  }

  public static float divide(int a, int b) {
    return Math.floorDiv(a, b);
  }

  public static void main(String[] args) {

    int add = Task9.add(100, 00);
    int subtract = Task9.subtraction(100, 10);
    int multiply = Task9.multiply(100, 10);
    float divide = Task9.divide(100, 10);

    System.out.println("Additional of a & b: " + add);
    System.out.println("Subtract of a & b: " + subtract);
    System.out.println("Multiply of a & b: " + multiply);
    System.out.println("Divide of a & b: " + divide);
  }

}
