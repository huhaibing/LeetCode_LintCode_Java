/**
144. 交错正负数 
给出一个含有正整数和负整数的数组，重新排列成一个正负数交错的数组。

 注意事项
不需要保持正整数或者负整数原来的顺序。

样例
给出数组[-1, -2, -3, 4, 5, 6]，重新排序之后，变成[-1, 5, -2, 4, -3, 6]或者其他任何满足要求的答案
*/

public class Solution {
    /*
     * @param A: An integer array.
     * @return: nothing
     */
    public void rerange(int[] A) {
        // write your code here
		if (A.length == 1)
			return ;
		int i=1;
		while (i < A.length) {
			int j=A.length-1;
			while (i < A.length && A[i] * A[i-1] < 0) 
				i++;
			while (j > i && A[i] * A[j] > 0)
				j--;
			if (i < A.length && i != j) {
			    int temp = A[i];
    			A[i] = A[j];
    			A[j] = temp;
			}
			i++;
		}
		if (A.length%2 == 1 && A[A.length-1]*A[A.length-2] > 0) {
			int temp = A[A.length-1];
			for (int k=A.length-1; k>0; k--) {
				A[k] = A[k-1];
			}
			A[0] = temp;
		}
    }
}