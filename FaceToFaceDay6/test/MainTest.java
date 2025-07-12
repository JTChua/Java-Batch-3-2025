package FaceToFaceDay6.test;

import FaceToFaceDay6.src.TwoSum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

  @Test
  void testTwoSumFound() {
    TwoSum twoSum = new TwoSum(9, 2, 7, 11, 15);
    int[] result = twoSum.findTwoSumIndices();
    assertNotNull(result);
    assertEquals(2, result.length);
    assertEquals(0, result[0]);
    assertEquals(1, result[1]); // because 2 + 7 = 9
  }

  @Test
  void testTwoSumDifferentOrder() {
    TwoSum twoSum = new TwoSum(26, 15, 11, 7, 3);
    int[] result = twoSum.findTwoSumIndices();
    assertNotNull(result);
    assertEquals(2, result.length);
    assertEquals(0, result[0]);
    assertEquals(1, result[1]); // because 15 + 11 = 26
  }

  @Test
  void testNoTwoSumFound() {
    TwoSum twoSum = new TwoSum(100, 1, 2, 3, 4);
    int[] result = twoSum.findTwoSumIndices();
    assertNotNull(result);
    assertEquals(0, result.length); // No result expected
  }

  @Test
  void testEmptyInput() {
    TwoSum twoSum = new TwoSum(5);
    int[] result = twoSum.findTwoSumIndices();
    assertNotNull(result);
    assertEquals(0, result.length);
  }

  @Test
  void testOneElementOnly() {
    TwoSum twoSum = new TwoSum(10, 10);
    int[] result = twoSum.findTwoSumIndices();
    assertNotNull(result);
    assertEquals(0, result.length);
  }

  @Test
  void testNegativeNumbers() {
    TwoSum twoSum = new TwoSum(-3, -1, -2, -3, -4);
    int[] result = twoSum.findTwoSumIndices();
    assertNotNull(result);
    assertEquals(2, result.length);
    assertEquals(-1 - 2, -3);
    assertEquals(-3, twoSum.getTarget());
    assertEquals(-3, twoSum.getNumbers()[result[0]] + twoSum.getNumbers()[result[1]]);
  }

}
