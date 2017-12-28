/**
636. 132 模式 
给你一个 n 个整数的序列 a1,a2,...,an，一个 132 模式是对于一个子串 ai,aj,ak，满足 i < j < k 和 ai < ak < aj。设计一个算法来检查输入的这 n 个整数的序列中是否存在132模式。
n 会小于 20,000。

样例
给你序列 nums = [1,2,3,4] 
返回 False//没有132模式在这个序列中。
给你序列 nums = [3,1,4,2] 
返回 True//存在132模式：[1,4,2]。
*/

public class Solution {
    /*
     * @param nums: a list of n integers
     * @return: true if there is a 132 pattern or false
     */
    public boolean find132pattern(int[] nums) {
        // write your code here
        if (nums.length < 3)
            return false;
        int n1=Integer.MAX_VALUE, n3=Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++) {
            int temp = nums[i];
            if (temp < n1)
                n1 = temp;
            if (temp > n3)
                n3 = temp;
            if (n3 > temp && temp > n1)
                return true;
        }
        return false;
    }
}