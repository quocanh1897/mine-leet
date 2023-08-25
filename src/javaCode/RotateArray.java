package javaCode;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/">link</a>
 * <p> Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * <p>
 * Output: [5,6,7,1,2,3,4]
 * <p>
 * Explanation:
 * <p>
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * <p>
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * <p>
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [-1,-100,3,99], k = 2
 * <p>
 * Output: [3,99,-1,-100]
 * <p>
 * Explanation:
 * <p>
 * rotate 1 steps to the right: [99,-1,-100,3]
 * <p>
 * rotate 2 steps to the right: [3,99,-1,-100]
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 * 0 <= k <= 105
 * <p>
 * Follow up:
 * <p>
 * Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 */
public class RotateArray {
  public void rotate(int[] nums, int k) {
    int len = nums.length;
    k = k % len; // This ensures k is within the bounds of the array length
    int m = len - k;
    int[] res = new int[len];

    for (int i = 0; i < len; i++) {
      if (m + i > len - 1)
        m = -i;
      res[i] = nums[m + i];
    }

    // Copy the elements from res back to nums
    System.arraycopy(res, 0, nums, 0, len);
  }

  public static void main(String[] args) {
    RotateArray test = new RotateArray();

    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;

    test.rotate(nums, k);
    System.out.println(Arrays.toString(nums));
  }
}
