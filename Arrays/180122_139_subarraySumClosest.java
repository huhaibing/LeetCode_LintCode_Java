/**
139. 最接近零的子数组和 
给定一个整数数组，找到一个和最接近于零的子数组。返回第一个和最有一个指数。你的代码应该返回满足要求的子数组的起始位置和结束位置

样例
给出[-3, 1, 1, -3, 5]，返回[0, 2]，[1, 3]， [1, 1]， [2, 2] 或者 [0, 4]。
*/

public class Solution {
    /*
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
    public int[] subarraySumClosest(int[] nums) {
        // write your code here
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int s = 0, min = Integer.MAX_VALUE;
		int[] res = new int[2];
		int[] sum = new int[nums.length];
		for (int i=0; i<nums.length; i++) {
			s += nums[i];
			if (map.containsKey(s)){
				res[0] = map.get(s)+1;
				res[1] = i;
				return res; 
			} else {
				map.put(s, i);
				sum[i] = s;
			}
		}
		Arrays.sort(sum);
		for (int j=0; j<sum.length-1; j++) {
			if (Math.abs(sum[j]-sum[j+1]) < min) {
				min = Math.abs(sum[j]-sum[j+1]);
				res[0] = (map.get(sum[j])<map.get(sum[j+1]) ? map.get(sum[j]) : map.get(sum[j+1]))+1;
				res[1] = (map.get(sum[j])>map.get(sum[j+1]) ? map.get(sum[j]) : map.get(sum[j+1]));
			}
		}
		return res;
    }
}