/**
608. 两数和-输入已排序的数组 
给定一个已经按升序排列的数组，找到两个数使他们加起来的和等于特定数。
函数应该返回这两个数的下标，index1必须小于index2。注意返回的值不是 0-based。

 注意事项
你可以假设每个输入刚好只有一个答案

样例
给定数组为 [2,7,11,15] ，target = 9
返回 [1,2]
*/

public class Solution {
    /*
     * @param nums: an array of Integer
     * @param target: target = nums[index1] + nums[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] nums, int target) {
        // write your code here
        int[] ans = new int[2];
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i+1;
                    ans[1] = j+1;
                    return ans;
                }
            }
        }
        return ans;
    }
}