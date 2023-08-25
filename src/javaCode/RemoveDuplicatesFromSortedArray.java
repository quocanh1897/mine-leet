package javaCode;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/">link</a>
 * <p> Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 *
 * <p> Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 *
 * <p> Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * <p> Return k.
 * <p> Custom Judge:
 *
 * <p> The judge will test your solution with the following code:
 *
 * <p> int[] nums = [...]; // Input array
 * <p> int[] expectedNums = [...]; // The expected answer with correct length
 *
 * <p> int k = removeDuplicates(nums); // Calls your implementation
 *
 * <p> assert k == expectedNums.length;
 * <p> for (int i = 0; i < k; i++) {
 * <p>     assert nums[i] == expectedNums[i];
 * <p> }
 * <p> If all assertions pass, then your solution will be accepted.
 *
 *
 *
 * <p> Example 1:
 *
 * <p> Input: nums = [1,1,2]
 * <p> Output: 2, nums = [1,2,_]
 * <p> Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * <p> It does not matter what you leave beyond the returned k (hence they are underscores).
 * <p> Example 2:
 *
 * <p> Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * <p> Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * <p> Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * <p> It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 *
 * <p> Constraints:
 *
 * <p> 1 <= nums.length <= 3 * 104
 * <p> -100 <= nums[i] <= 100
 * <p> nums is sorted in non-decreasing order.
 */
public class RemoveDuplicatesFromSortedArray {
  public int removeDuplicates(int[] nums) {
    Set<Integer> set = new LinkedHashSet<>();
    for (int i = 0, j = 0; i < nums.length; ) {
      if (set.contains(nums[i]))
        i++;
      else {
        nums[j] = nums[i];
        j++;
        set.add(nums[i]);
      }

    }

    return set.size();
  }

  public static void main(String[] args) {
    RemoveDuplicatesFromSortedArray t = new RemoveDuplicatesFromSortedArray();
    int[] m = {1, 1, 1, 1, 2, 3, 4, 5, 1, 22, 22, 33323, 5123};

    int res = t.removeDuplicates(m);
    System.out.println(res);
    System.out.println(Arrays.toString(m));
  }
}
