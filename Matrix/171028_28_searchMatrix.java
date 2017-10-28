/*
搜索二维矩阵 
写出一个高效的算法来搜索 m × n矩阵中的值。
这个矩阵具有以下特性：
每行中的整数从左到右是排序的。
每行的第一个数大于上一行的最后一个整数。
*/

public class Solution {
    /*
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length==0)
			return false;
		int m=matrix.length, n=matrix[0].length, s=0, e=m*n;
		
		if (e == 1 && matrix[0][0] == target)
			return true;
		else if (e == 1 && matrix[0][0] != target)
			return false;
		while (s+1 < e) {
			int mid = (s+e)/2;
			int i=(mid%n==0 ? mid/n-1 : mid/n), j=(mid%n==0 ? n-1 : mid%n-1);
			if (matrix[i][j] == target) {
				return true;
			} else if (matrix[i][j] > target) {
				e = mid;
			} else if (matrix[i][j] < target){
				s = mid;
			} 
		}
		
		//头尾处理
		int i=(s%n==0 ? s/n-1 : s/n), j=(s%n==0 ? n-1 : s%n-1);
		if (matrix[i][j] == target)
			return true;
		i=(e%n==0 ? e/n-1 : e/n);
		j=(e%n==0 ? n-1 : e%n-1);
		if (matrix[i][j] == target)
			return true;
		
		return false;
    }
}