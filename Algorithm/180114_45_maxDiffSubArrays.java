/**
45. 最大子数组差 
给定一个整数数组，找出两个不重叠的子数组A和B，使两个子数组和的差的绝对值|SUM(A) - SUM(B)|最大。

返回这个最大的差值。

 注意事项
子数组最少包含一个数

样例
给出数组[1, 2, -3, 1]，返回 6
*/

public class Solution {
    /*
     * @param nums: A list of integers
     * @return: An integer indicate the value of maximum difference between two substrings
     */
	public int maxDiffSubArrays(int[] nums) {
        // write your code here
		int[] maxhead = helpMaxDiffSubArrays(nums, true, true);
		int[] minhead = helpMaxDiffSubArrays(nums, true, false);
		int[] maxtail = helpMaxDiffSubArrays(nums, false, true);
		int[] mintail = helpMaxDiffSubArrays(nums, false, false);
		int max = Integer.MIN_VALUE;
		for (int i=0; i<nums.length-1; i++) {
			for (int j=i+1; j<nums.length; j++) {
				if (maxhead[i] - mintail[j] > max) {
					max = Integer.max(maxhead[i], mintail[j]) - Integer.min(maxhead[i], mintail[j]);
				}
				
				if (maxtail[j] - minhead[i] > max)
					max = Integer.max(maxtail[j], minhead[i]) - Integer.min(maxtail[j], minhead[i]);
			}
		}
		return max;
    }
	public int[] helpMaxDiffSubArrays(int[] nums, boolean direction, boolean flag) {
		int len=nums.length;
		int[] res = new int[len];
		if (direction == true) {	// 从前往后
			int sum=0, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
			for (int i=0; i<len; i++) {
				sum += nums[i];
				if (flag == true) {	// 最大值
					if (sum > max)
						max = sum;
					if (sum < 0)
						sum = 0;
					res[i] = max;
				} else {
					if (sum < min)
						min = sum;
					if (sum > 0)
						sum = 0;
					res[i] = min;
				}
			}
		} else {
			int sum=0, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
			for (int i=len-1; i>=0; i--) {
				sum += nums[i];
				if (flag == true) {	// 最大值
					if (sum > max)
						max = sum;
					if (sum < 0)
						sum = 0;
					res[i] = max;
				} else {
					if (sum < min)
						min = sum;
					if (sum > 0)
						sum = 0;
					res[i] = min;
				}
			}
		}
		return res;
	}
}