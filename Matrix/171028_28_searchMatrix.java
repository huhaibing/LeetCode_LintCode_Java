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
		if (matrix == null || matrix.length == 0)
			return false;
		int row = 0, col = matrix[0].length-1;
		while (row <= matrix.length-1 && col >= 0) {
			if (matrix[row][col] == target)
				return true;
			else if (matrix[row][col] < target) {
				row++;
			} else if (matrix[row][col] > target) {
				col--;
			}
		}
		return false;
	}
}