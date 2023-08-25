package javaCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p> Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p> You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * <p> You can return the answer in any order.
 * <p>
 * <p> Example 1:
 * <p>
 * <p> Input: nums = [2,7,11,15], target = 9
 * <p> Output: [0,1]
 * <p> Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p> Example 2:
 * <p>
 * <p> Input: nums = [3,2,4], target = 6
 * <p> Output: [1,2]
 * <p> Example 3:
 * <p>
 * <p> Input: nums = [3,3], target = 6
 * <p> Output: [0,1]
 * <p>
 * <p> Constraints:
 * <p>
 * <p> 2 <= nums.length <= 104
 * <p> -109 <= nums[i] <= 109
 * <p> -109 <= target <= 109
 * <p> Only one valid answer exists.
 * <p>
 * <p> Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
public class TwoSums {
  public int[] twoSum(int[] nums, int target) {
    int len = nums.length;
    Map<Integer, Integer> m = new HashMap<>();
    for (int i = 0; i < len; i++) {
      m.put(nums[i], i);
    }
    int[] res = new int[2];
    for (int i = 0; i < len; i++) {
      int needToFind = target - nums[i];
      if (m.get(needToFind) != null && m.get(needToFind) != i) {
        res[0] = i;
        res[1] = m.get(needToFind);
        break;
      }
    }
    return res;
  }

    public static void main(String[] args) {
        TwoSums t = new TwoSums();
        int[] test1 = {1,2,3,4,9,55,99,12};
        System.out.println(Arrays.toString(t.twoSum(test1, 67)));
    }
}
