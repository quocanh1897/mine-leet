package javaCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/">link</a>
 * <p> Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,2,1]
 * Output: 1
 * Example 2:
 * <p>
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * Example 3:
 * <p>
 * Input: nums = [1]
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104
 * Each element in the array appears twice except for one element which appears only once.
 */
public class SingleNumber {
  public int singleNumber(int[] nums) {
    Set<Integer> s = new HashSet<>();

    for (int temp : nums) {
      if (s.contains(temp))
        s.remove(temp);
      else s.add(temp);
    }
    Iterator<Integer> i = s.iterator();
    return i.next();
  }

  public static void main(String[] args) {
    SingleNumber test = new SingleNumber();

    int[] test1 = {1, 3, 3, 4, 4, 5, 5};
    int[] test2 = {91, 93, 4, 1, 4, 91, 93};
    assert test.singleNumber(test1) == 10;
    System.out.println(test.singleNumber(test1));
    assert test.singleNumber(test2) == 10;
  }
}
