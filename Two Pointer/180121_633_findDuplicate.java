/**
633. 寻找重复的数 
给出一个数组 nums 包含 n + 1 个整数，每个整数是从 1 到 n (包括边界)，保证至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。

 注意事项
1.不能修改数组(假设数组只能读)
2.只能用额外的O(1)的空间
3.时间复杂度小于O(n^2)
4.数组中只有一个重复的数，但可能重复超过一次

样例
给出 nums = [5,5,4,3,2,1]，返回 5.
给出 nums = [5,4,4,3,2,1]，返回 4.
*/

public class Solution {
    /*
     * @param nums: an array containing n + 1 integers which is between 1 and n
     * @return: the duplicate one
     */
    public int findDuplicate(int[] nums) {
        // write your code here
		int left = 0, right = nums.length-1;
		while (left <= right) {
			int mid = (left + right) / 2;
			int cnt = 0;
			for (int i=0; i<nums.length; i++) {
				if (nums[i] <= mid)
					cnt ++;
			}
			if (cnt <= mid) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return left;
    }
}