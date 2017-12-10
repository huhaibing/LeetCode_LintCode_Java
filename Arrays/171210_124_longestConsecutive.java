/**
124. 最长连续序列 
给定一个未排序的整数数组，找出最长连续序列的长度。

说明
要求你的算法复杂度为O(n)

样例
给出数组[100, 4, 200, 1, 3, 2]，这个最长的连续序列是 [1, 2, 3, 4]，返回所求长度 4
*/

public class Solution {
    /*
     * @param num: A list of integers
     * @return: An integer
     */
    public int longestConsecutive(int[] num) {
        // write your code here
        if (num.length == 0)
            return 0;
        Arrays.sort(num);
        int max =1, n=1, index=num[0];
        for (int i=1; i<num.length; i++) {
            if (num[i] == index)    // 如果出现相同数字
                continue;
            if (num[i] == index+1) {
                n++;
            } else {
                n = 1;
            }
            if (n > max)
                max = n;
            index = num[i];
        }
        return max;
    }
}