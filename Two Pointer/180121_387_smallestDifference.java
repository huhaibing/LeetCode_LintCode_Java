/**
387. 最小差 
给定两个整数数组（第一个是数组 A，第二个是数组 B），在数组 A 中取 A[i]，数组 B 中取 B[j]，A[i] 和 B[j]两者的差越小越好(|A[i] - B[j]|)。返回最小差。

样例
给定数组 A = [3,4,6,7]， B = [2,3,8,9]，返回 0。
*/

public class Solution {
    /*
     * @param A: An integer array
     * @param B: An integer array
     * @return: Their smallest difference.
     */
    public int smallestDifference(int[] A, int[] B) {
        // write your code here
		if (A.length==1 && B.length==1)
			return Math.abs(A[0]-B[0]);
		Arrays.sort(A);
		Arrays.sort(B);
		int min = Integer.MAX_VALUE;
		int i=0, j=0;
		while (i < A.length) {
			while (j < B.length && B[j] < A[i])
				j++;
			if (j > 0)
				j--;
			// 比A[i]小的数的差
			min = Math.abs(A[i]-B[j]) < min ? Math.abs(A[i]-B[j]) : min;
			if (j < B.length-1)
			    // 比A[i]大的数的差
				min = Math.abs(A[i]-B[j+1]) < min ? Math.abs(A[i]-B[j+1]) : min;
			i++;
		}
		return min;
    }
}