package javaCode;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/">link</a>
 * <p> Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 * <p>
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums. Length <= 105
 * -109 <= nums[i] <= 109
 */
public class ContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> s = new HashSet<>();
    for (int num : nums) {
      if (s.contains(num))
        return true;
      s.add(num);
    }
    return false;
  }

  public static void main(String[] args) {
    ContainsDuplicate test = new ContainsDuplicate();

    int[] arr = {1,2,2,2,3};
    System.out.println(test.containsDuplicate(arr));
  }
}
