/*
删除重复数字：

如果可以允许出现两次重复将如何处理？
*/

public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
		int i=0, flag=0;
		if (nums.length == 0)
		    return 0;
		for (int j=1; j<nums.length; j++) {
			if (nums[j] == nums[i] && flag == 0) {
				nums[++i] = nums[j];
				flag = 1;
			} else if (nums[j] != nums[i]) {
				nums[++i] = nums[j];
				flag = 0;
			}
		}
		System.out.println(Arrays.toString(nums));
		return i+1;
	}
}