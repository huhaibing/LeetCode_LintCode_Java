/**
189. 丢失的第一个正整数 
给出一个无序的整数数组，找出其中没有出现的最小正整数。

样例
如果给出 [1,2,0], return 3
如果给出 [3,4,-1,1], return 2
*/

public class Solution {
    /*
     * @param A: An array of integers
     * @return: An integer
     */
    public int firstMissingPositive(int[] A) {
        // write your code here
        Arrays.sort(A);
        int n = 1;
        for (int i=0; i<A.length; i++) {
            if (A[i] == n)
                n++;
            else if (A[i] > n)
                return n;
        }
        return n;
    }
}