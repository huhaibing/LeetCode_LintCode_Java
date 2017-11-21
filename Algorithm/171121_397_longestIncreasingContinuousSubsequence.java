/**
397. 最长上升连续子序列 
给定一个整数数组（下标从 0 到 n-1， n 表示整个数组的规模），请找出该数组中的最长上升连续子序列。（最长上升连续子序列可以定义为从右到左或从左到右的序列。）

 注意事项
time

样例
给定 [5, 4, 2, 1, 3], 其最长上升连续子序列（LICS）为 [5, 4, 2, 1], 返回 4.
*/

public class Solution {
    /*
     * @param A: An array of Integer
     * @return: an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // write your code here
        if (A == null || A.length == 0)
            return 0;
        if (A.length == 1)
            return 1;
        int max = 0, min = 0, nmax=1, nmin=1;
        for (int i=0; i<A.length-1; i++) {
            if (A[i] > A[i+1]) {
                nmax += 1;
                nmin = 1;
                if (nmax > max)
                    max = nmax;
            } else if (A[i] < A[i+1]) {
                nmin += 1;
                nmax = 1;
                if (nmin > min)
                    min = nmin;
            } else {
                nmin = 1;
                nmax = 1;
            }
        }
        return (max>min ? max : min);
    }
}