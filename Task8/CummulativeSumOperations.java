
public class CummulativeSumOperations {

  private int[] numbers;
  private int[] cumulativeSums;
  private int totalSum;

  public CummulativeSumOperations(int... numbers) {
    this.numbers = numbers;
    this.cumulativeSums = calculateCumulativeSums();
    this.totalSum = calculateTotalSum();
  }

  private int[] calculateCumulativeSums() {
    if (numbers == null || numbers.length == 0) {
      return new int[0];
    }

    int[] sums = new int[numbers.length];
    sums[0] = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
      sums[i] = sums[i - 1] + numbers[i];
    }

    return sums;
  }

  private int calculateTotalSum() {
    int sum = 0;
    for (int cumSum : getCumulativeSums()) {
      sum += cumSum;
    }
    return sum;
  }

  public int[] getNumbers() {
    return numbers.clone();
  }

  public int[] getCumulativeSums() {
    return cumulativeSums.clone();
  }

  public int getTotalSum() {
    return totalSum;
  }

  public void printCumulativeSums() {
    System.out.println("Original numbers: " + arrayToString(numbers));
    System.out.println("Cumulative sums: " + arrayToString(cumulativeSums));
  }

  public void printSum() {
    System.out.println("Total sum: " + totalSum);
  }

  private String arrayToString(int[] arr) {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i]);
      if (i < arr.length - 1) {
        sb.append(", ");
      }
    }
    sb.append("]");
    return sb.toString();
  }

  public static void main(String[] args) {

    CummulativeSumOperations cs1 = new CummulativeSumOperations(1, 2, 3, 4, 5);
    cs1.printCumulativeSums();
    cs1.printSum();

    CummulativeSumOperations cs2 = new CummulativeSumOperations(10, 20, 30);
    cs2.printCumulativeSums();
    cs2.printSum();

  }

}
