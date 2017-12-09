/**
735. 替换为右侧最大值 
给一整数数组, 用当前元素之后数组中的最大元素来替换当前元素(右侧的最大元素). 因为最后一个元素的右边没有元素了, 所以用 -1 来替换这个值. 举个例子, 如果数组为 [16,17,4,3,5,2], 那么它就需要修改为 [17,5,5,5,2,-1].

样例
给出数组 nums = [16,17,4,3,5,2], 改变数组为 [17,5,5,5,2,-1], 你需要在原地实现。
*/

public class Solution {
    /*
     * @param : An array of integers.
     * @return: nothing
     */
    public void arrayReplaceWithGreatestFromRight(int[] nums) {
        // Write your code here.
        if (nums.length == 1) {
            nums[0] = -1;
            return ;
        }
        int max = nums[nums.length-1], temp = max;
        nums[nums.length-1] = -1;
        for (int i=nums.length-1; i>0; i--) {
            max = Math.max(max, temp);
            temp = nums[i-1];
            nums[i-1] = max;
        }
    }
}