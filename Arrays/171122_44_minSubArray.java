/**
44. 最小子数组 
给定一个整数数组，找到一个具有最小和的子数组。返回其最小和。
注意事项
子数组最少包含一个数字

样例
给出数组[1, -1, -2, 1]，返回 -3
*/

public class Solution {
    /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {
        if (nums.size() == 0)
            return 0;
		int min=100000, sum=0;
		for(int i=0; i<nums.size(); i++) {
		    if (sum > 0) {
		        sum = nums.get(i);
		    } else {
		        sum += nums.get(i);
		    }
		    if (sum < min)
		        min = sum;
		}
		return min;
    }
}