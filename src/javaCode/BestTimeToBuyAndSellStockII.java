package javaCode;

/**
 * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/">link</a>
 * <p> You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * <p> On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
 * <p> Find and return the maximum profit you can achieve.
 * <p> Example 1:
 * <p> Input: prices = [7,1,5,3,6,4]
 * <p> Output: 7
 * <p> Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * <p> Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * <p> Total profit is 4 + 3 = 7.
 * <p> Example 2:
 * <p> Input: prices = [1,2,3,4,5]
 * <p> Output: 4
 * <p> Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * <p> Total profit is 4.
 * <p> Example 3:
 * <p> Input: prices = [7,6,4,3,1]
 * <p> Output: 0
 * <p> Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
 * <p> Constraints:
 * <p> 1 <= prices.length <= 3 *  104
 * <p>
 * 0 <= prices[i] <= 104
 */
public class BestTimeToBuyAndSellStockII {
  public int maxProfit(int[] prices) {
    if (prices == null || prices.length < 2) {
      return 0;
    }

    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > prices[i - 1]) {
        profit += prices[i] - prices[i - 1];

        // If the previous day was not a "sell" day, mark it as a "buy" day
        if (i == 1 || prices[i - 1] <= prices[i - 2]) {
          System.out.println("Buy on day " + (i));
        }

        // Mark the current day as a "sell" day
        System.out.println("Sell on day " + (i + 1));
      }
    }

    return profit;
  }

  public static void main(String[] args) {
    BestTimeToBuyAndSellStockII t = new BestTimeToBuyAndSellStockII();

    int[] m = {7,1,5,3,6,4};
    System.out.println(t.maxProfit(m));
  }
}
