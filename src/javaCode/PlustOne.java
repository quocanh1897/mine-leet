package javaCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * <p> You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 *
 * <p> Increment the large integer by one and return the resulting array of digits.
 * <p> Example 1:
 *
 * <p> Input: digits = [1,2,3]
 * <p> Output: [1,2,4]
 * <p> Explanation: The array represents the integer 123.
 * <p> Incrementing by one gives 123 + 1 = 124.
 * <p> Thus, the result should be [1,2,4].
 * <p> Example 2:
 *
 * <p> Input: digits = [4,3,2,1]
 * <p> Output: [4,3,2,2]
 * <p> Explanation: The array represents the integer 4321.
 * <p> Incrementing by one gives 4321 + 1 = 4322.
 * <p> Thus, the result should be [4,3,2,2].
 * <p> Example 3:
 *
 * <p> Input: digits = [9]
 * <p> Output: [1,0]
 * <p> Explanation: The array represents the integer 9.
 * <p> Incrementing by one gives 9 + 1 = 10.
 * <p> Thus, the result should be [1,0].
 *
 * <p> Constraints:
 *
 * <p> 1 <= digits.length <= 100
 * <p> 0 <= digits[i] <= 9
 * <p> digits does not contain any leading 0's.
 */
public class PlustOne {
  public int[] plusOne(int[] digits) {
    int len = digits.length;

    for (int i = len -1 ; i >= 0; i--) {
      digits[i]++;
      if (digits[i] == 10) {
        digits[i] =0;
      } else return digits;
    }

    if (digits[0] == 0) {
      int[] res = new int[len + 1];
      res[0] = 1;
      return res;
    }
    return digits;
  }

  public static void main(String[] args) {
    PlustOne t = new PlustOne();
    int[] m = {9, 9};
    int[] k = {2, 3, 4};
    System.out.println(Arrays.toString(t.plusOne(m)));
    System.out.println(Arrays.toString(t.plusOne(k)));
  }
}
