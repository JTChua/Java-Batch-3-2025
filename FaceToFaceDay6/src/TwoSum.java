package FaceToFaceDay6.src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  private int target;
  private int[] numbers;

  public TwoSum(int target, int... numbers) {

    this.target = target;
    this.numbers = numbers.clone();
  }

  public int[] findTwoSumIndices() {
    if (numbers == null || numbers.length < 2) {
      return new int[0];
    }

    Map<Integer, Integer> numToIndex = new HashMap<>();

    for (int i = 0; i < numbers.length; i++) {
      int complement = target - numbers[i];

      if (numToIndex.containsKey(complement)) {
        return new int[] { numToIndex.get(complement), i };
      }

      numToIndex.put(numbers[i], i);
    }

    return new int[0];
  }

  public void printTwoSumResult() {
    int[] indices = findTwoSumIndices();

    if (indices.length == 0) {
      System.out.println("No pair found that sums to " + target);
    } else {
      System.out.println("Target: " + target);
      System.out.println("Input: " + Arrays.toString(numbers));
      System.out.println("Output: index " + indices[0] + ", index " + indices[1]);
      System.out.println("Values: " + numbers[indices[0]] + " + " + numbers[indices[1]] + " = " + target);
    }
  }

  public int getTarget() {
    return target;
  }

  public int[] getNumbers() {
    return numbers.clone();
  }

}
