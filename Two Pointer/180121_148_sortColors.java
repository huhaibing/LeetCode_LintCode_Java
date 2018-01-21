/**
148. 颜色分类 
给定一个包含红，白，蓝且长度为 n 的数组，将数组元素进行分类使相同颜色的元素相邻，并按照红、白、蓝的顺序进行排序。

我们可以使用整数 0，1 和 2 分别代表红，白，蓝。

 注意事项
不能使用代码库中的排序函数来解决这个问题。
排序需要在原数组中进行。

样例
给你数组 [1, 0, 1, 2], 需要将该数组原地排序为 [0, 1, 1, 2]。
*/

public class Solution {
    /*
     * @param nums: A list of integer which is 0, 1 or 2 
     * @return: nothing
     */
    public void sortColors(int[] nums) {
        // write your code here
		int red = 0, wit = 0, k = nums.length-1;
		while (k > wit) {
			if (nums[k] == 1) {
				nums[k] = nums[wit];
				nums[wit++] = 1;
			} else if (nums[k] == 0) {
				nums[k] = nums[wit];
				nums[red] = 0;
				if (red != wit)
					nums[wit] = 1;
				wit++;
				red++;
			} else {
			    k--;
			}
		}
		if (nums[k] == 0) {
			nums[red] = 0;
			nums[wit] = 1;
		}
    }
}