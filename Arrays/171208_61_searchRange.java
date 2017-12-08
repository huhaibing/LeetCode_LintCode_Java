/**
61. 搜索区间 
给定一个包含 n 个整数的排序数组，找出给定目标值 target 的起始和结束位置。
如果目标值不在数组中，则返回[-1, -1]

样例
给出[5, 7, 7, 8, 8, 10]和目标值target=8,

返回[3, 4]
*/

public class Solution {
    /*
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        // write your code here
        int n = 0;
        int[] ans = {-1, -1};
        for (int i=0; i<A.length; i++) {
            if (A[i] == target) {
                if (n == 0)
                    ans[0] = i;
                n++;
            }
        }
        if (ans[0] == -1)
            return ans;
        else {
            ans[1] = ans[0] + n -1;
            return ans;
        }
    }
}