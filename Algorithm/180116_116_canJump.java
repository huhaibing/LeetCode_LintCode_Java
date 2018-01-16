/**
116. 跳跃游戏 
给出一个非负整数数组，你最初定位在数组的第一个位置。　　　
数组中的每个元素代表你在那个位置可以跳跃的最大长度。　　　　
判断你是否能到达数组的最后一个位置。
样例
A = [2,3,1,1,4]，返回 true.
A = [3,2,1,0,4]，返回 false.
*/

public class Solution {
    /*
     * @param A: A list of integers
     * @return: A boolean
     */
    public boolean canJump(int[] A) {
        // write your code here
		if (A.length == 0 || A.length == 1)
			return true;
        int[] dp = new int[A.length];
        dp[0] = A[0];
        for (int i=1; i<A.length; i++) {
        	if (dp[i-1] >= i)
        		dp[i] = Integer.max(dp[i-1], A[i]+i);
        	else
        		dp[i] = 0;
        }
        return (dp[A.length-1] > A[A.length-1] ? true : false);
    }
}