/*
给一个数组 nums 写一个函数将 0 移动到数组的最后面，非零元素保持原数组的顺序
注意事项
1.必须在原数组上操作
2.最小化操作数

样例
给出 nums = [0, 1, 0, 3, 12], 调用函数之后, nums = [1, 3, 12, 0, 0].
*/

public class Solution {
    /*
     * @param nums: an integer array
     * @return: 
     */
    public void moveZeroes(int[] nums) {
		int k=0;
		for (int i=0; i<nums.length; i++) {
			if (nums[i] != 0) {
				nums[k++] = nums[i];
//				System.out.println(Arrays.toString(nums));
			}
		}
		while (k <= nums.length-1) {
			nums[k++] = 0;
		}
	}
}