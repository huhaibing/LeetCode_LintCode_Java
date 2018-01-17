/**
150. 买卖股票的最佳时机 II 
假设有一个数组，它的第i个元素是一个给定的股票在第i天的价格。设计一个算法来找到最大的利润。你可以完成尽可能多的交易(多次买卖股票)。然而,你不能同时参与多个交易(你必须在再次购买前出售股票)。

样例
给出一个数组样例[2,1,2,0,1], 返回 2
*/

public class Solution {
    /*
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
		if (prices.length==0 || prices.length==1)
			return 0;
		int buy=prices[0], sale=prices[0], sumprofit=0;
		for (int i=1; i<prices.length; i++) {
			if (prices[i] < sale) {
				sumprofit += sale - buy;
				buy = prices[i];
				sale = prices[i];
			} else {
				sale = prices[i];
			}
		}
		sumprofit += sale - buy;
		return sumprofit;
    }
}