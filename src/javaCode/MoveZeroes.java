package javaCode;

import java.util.Arrays;

/**
 * <p> Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * <p> Note that you must do this in-place without making a copy of the array.
 * <p>
 * <p> Example 1:
 * <p>
 * <p> Input: nums = [0,1,0,3,12]
 * <p> Output: [1,3,12,0,0]
 * <p> Example 2:
 * <p>
 * <p> Input: nums = [0]
 * <p> Output: [0]
 * <p>
 * <p> Constraints:
 * <p>
 * <p> 1 <= nums.length <= 104
 * <p> -231 <= nums[i] <= 231 - 1
 * <p>
 * <p> Follow up: Could you minimize the total number of operations done?
 */
public class MoveZeroes {
  public void solution1(int[] nums) {
    int len = nums.length;
    if (len < 2) return;
    for (int i=0, j = 0; i < len ; i++) {
      while (nums[j] == 0 && j < len-1) j++;
      if (nums[i] == 0) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
      }
      if (nums[j] != 0 && j < len -1) j++;
    }
  }

  public void solution2(int[] nums) {
    int j = 0; // position to place the next non-zero element

    // First, move all non-zero elements to the front
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[j++] = nums[i];
      }
    }

    // Fill the remaining positions with zeros
    while (j < nums.length) {
      nums[j++] = 0;
    }
  }

  public static void main(String[] args) {
    MoveZeroes t = new MoveZeroes();
    int[] test1 = {0,1,0,3,12};
    int[ ] test2 = {4,2,4,0,0,3,0,5,1,0};
    t.solution1(test1);
    t.solution2(test2);

    System.out.println(Arrays.toString(test1));
    System.out.println(Arrays.toString(test2));
  }
}
