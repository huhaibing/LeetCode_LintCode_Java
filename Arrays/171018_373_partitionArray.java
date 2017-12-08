/*
分割一个整数数组，使得奇数在前偶数在后。

样例
给定 [1, 2, 3, 4]，返回 [1, 3, 2, 4]或者[3, 1, 2, 4]。
*/

public class Solution {
    /*
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
		int i=0, j=nums.length-1;
		while (j-i > 1) {
			while (nums[i]%2 == 1 && i<j) 
				i++;
			while (nums[j]%2 == 0 && i<j)
				j--;
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			System.out.println(Arrays.toString(nums) + i+ j);
		}
		System.out.println(Arrays.toString(nums));
	}
}