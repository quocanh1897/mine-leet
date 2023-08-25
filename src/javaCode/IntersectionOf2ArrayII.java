package javaCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/">link</a> <p>
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 * <p>
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * <p>
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 * <p>
 * Constraints:
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 * Follow up:
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class IntersectionOf2ArrayII {
  public int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer, Integer> m = new HashMap<>();
    for (int temp : nums1) {
      int t = m.get(temp) != null ? m.get(temp) : 0;
      m.put(temp, t + 1);
    }

    List<Integer> res = new ArrayList<>();

    for (int temp : nums2) {
      int t = m.get(temp) != null ? m.get(temp) : 0;
      if (t > 0) {
        res.add(temp);
        m.put(temp, t - 1);
      }
    }

    int[] ret = new int[res.size()];
    for (int i = 0; i < ret.length; i++)
      ret[i] = res.get(i);

    return ret;
  }

  public static void main(String[] args) {
    IntersectionOf2ArrayII test = new IntersectionOf2ArrayII();
    int[] nums1 = {4, 9, 5, 6, 6,6, 0};
    int[] nums2 = {6, 6, 0, 4, 33, 5, 5};

    for (int k : test.intersect(nums1, nums2)) {
      System.out.println(k);
    }
  }
}
