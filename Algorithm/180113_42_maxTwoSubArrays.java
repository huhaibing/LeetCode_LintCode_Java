/**
42. 最大子数组 II 
给定一个整数数组，找出两个 不重叠 子数组使得它们的和最大。
每个子数组的数字在数组中的位置应该是连续的。
返回最大的和。

 注意事项
子数组最少包含一个数

样例
给出数组 [1, 3, -1, 2, -1, 2]
这两个子数组分别为 [1, 3] 和 [2, -1, 2] 或者 [1, 3, -1, 2] 和 [2]，它们的最大和都是 7
*/

public class Solution {
    /*
     * @param nums: A list of integers
     * @return: An integer denotes the sum of max two non-overlapping subarrays
     */
    public int maxTwoSubArrays(List<Integer> nums) {
        // write your code here
		int len=nums.size(), max=Integer.MIN_VALUE, 
				maxh=Integer.MIN_VALUE, sumh=0,
				maxt=Integer.MIN_VALUE, sumt=0;
		int[] sh = new int[len]; 
		int[] st = new int[len];
        for (int p=0; p < len; p++) {
		  //  System.out.println(p);
			sumh += nums.get(p);
			if (sumh > maxh)
				maxh = sumh;
			if (sumh < 0)
				sumh = 0;
			sh[p] = maxh;
		}
        for (int q=len-1; q > 0; q--) {
		  //  System.out.println(q);
		    sumt += nums.get(q);
			if (sumt > maxt)
				maxt = sumt;
			if (sumt < 0)
				sumt = 0;
			st[q] = maxt;
		}
        for (int i=0; i < len; i++) {
        	for (int j=i+1; j< len; j++) {
        		if (sh[i] + st[j] > max)
        			max = sh[i] + st[j];
        	}
        }
        return max;
    }
}