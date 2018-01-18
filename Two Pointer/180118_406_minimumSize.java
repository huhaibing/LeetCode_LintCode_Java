/**
406. 和大于S的最小子数组 
给定一个由 n 个正整数组成的数组和一个正整数 s ，请找出该数组中满足其和 ≥ s 的最小长度子数组。如果无解，则返回 -1。

样例
给定数组 [2,3,1,2,4,3] 和 s = 7, 子数组 [4,3] 是该条件下的最小长度子数组。
*/

public class Solution {
    /*
     * @param nums: an array of integers
     * @param s: An integer
     * @return: an integer representing the minimum size of subarray
     */
    public int minimumSize(int[] nums, int s) {
        // write your code here
		if (nums.length == 0)
			return -1;
		int phead = 1, ptail = 0, sum = nums[0], minlen = Integer.MAX_VALUE;
		while (phead<nums.length) {
			sum += nums[phead++];
			while (ptail <= phead && sum >= s) {
				if (phead - ptail < minlen)
					minlen = phead - ptail;
				sum -= nums[ptail++];
			}
		}
		return (minlen == Integer.MAX_VALUE ? -1 : minlen);
    }
}