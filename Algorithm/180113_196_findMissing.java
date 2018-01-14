/**
196. 寻找缺失的数 
给出一个包含 0 .. N 中 N 个数的序列，找出0 .. N 中没有出现在序列中的那个数。

样例
N = 4 且序列为 [0, 1, 3] 时，缺失的数为2。
*/

public class Solution {
    /*
     * @param nums: An array of integers
     * @return: An integer
     */
    public int findMissing(int[] nums) {
        // write your code here
		Arrays.sort(nums);
        if (nums.length == 0 || nums[0] != 0)
            return 0;
        int i = 1, temp = nums[0];
        while (i < nums.length) {
            if (nums[i] != temp+1)
                return (temp+1);
            temp = nums[i];
            i++;
        }
        return (temp+1);
    }
};