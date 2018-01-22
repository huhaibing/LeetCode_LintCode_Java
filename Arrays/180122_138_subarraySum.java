/**
138. 子数组之和 
给定一个整数数组，找到和为零的子数组。你的代码应该返回满足要求的子数组的起始位置和结束位置

 注意事项
There is at least one subarray that it's sum equals to zero.

样例
给出 [-3, 1, 2, -3, 4]，返回[0, 2] 或者 [1, 3].
*/

public class Solution {
    /*
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
    public List<Integer> subarraySum(int[] nums) {
        // write your code here
		List<Integer> res = new ArrayList<Integer>();
		for (int i=0; i<nums.length; i++) {
			int sum = 0;
			for (int j=i; j<nums.length; j++) {
				sum += nums[j];
				if (sum == 0) {
					res.add(i);
					res.add(j);
					return res;
				}
			}
		}
		return res;
    }
}