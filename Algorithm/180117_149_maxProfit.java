/**
149. 买卖股票的最佳时机 
假设有一个数组，它的第i个元素是一支给定的股票在第i天的价格。如果你最多只允许完成一次交易(例如,一次买卖股票),设计一个算法来找出最大利润。

样例
给出一个数组样例 [3,2,3,1,2], 返回 1 
*/

public class Solution {
    /*
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
		int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE, profit=0;
		for (int i=0; i<prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
				max = prices[i];
			} else if (prices[i] > max)
				max = prices[i];
			if (max - min > profit)
				profit = max - min;
		}
		return profit;
    }
}