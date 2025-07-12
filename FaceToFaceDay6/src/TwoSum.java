package FaceToFaceDay6.src;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  private int[] nums;
  private int target;

  public TwoSum(int target, int... nums) {

    this.target = target;
    this.nums = nums.clone();
  }

  public int[] findSumIndices(){
    if (nums == null || nums.length < 0) {
      return new int[0];
    }

    Map<Integer, Integer> findSum = new HashMap<>(); 

    return new int[0];
  }
}
