/*
矩阵的之字型遍历 
给你一个包含 m x n 个元素的矩阵 (m 行, n 列), 求该矩阵的之字型遍历。
样例
对于如下矩阵：
[
  [1, 2,  3,  4],
  [5, 6,  7,  8],
  [9,10, 11, 12]
]
返回 [1, 2, 5, 9, 6, 3, 4, 7, 10, 11, 8, 12]
*/
import java.util.Arrays;

public class Solution {
    /*
     * @param matrix: An array of integers
     * @return: An array of integers
     */
    public int[] printZMatrix(int[][] matrix) {
        // write your code here
        if (matrix == null)
            return null;
        int m=matrix.length, n=matrix[0].length, i=0, j=0, k=0;
        int[] lm = new int[m*n];
        lm[k++] = matrix[i][j];
        while (k < m*n) {
            //斜向下遍历
            while (i>0 && j+1<n) {
            	System.out.println(Arrays.toString(lm)+i+" "+j);
                lm[k++] = matrix[--i][++j];
            }
            //斜向下后，判断是否能向右
            if (j+1 < n) {
            	System.out.println(Arrays.toString(lm)+i+" "+j);
                lm[k++] = matrix[i][++j];
            } else if (i+1 < m) {   //是否可以向下
            	System.out.println(Arrays.toString(lm)+i+" "+j);
                lm[k++] = matrix[++i][j];
            }
            //斜向上遍历
            while (i+1<m && j>0) {
            	System.out.println(Arrays.toString(lm)+i+" "+j);
                lm[k++] = matrix[++i][--j];
            }
            //是否可以向下
            if (i+1 < m) {
            	System.out.println(Arrays.toString(lm)+i+" "+j);
            	lm[k++] = matrix[++i][j];
            } else if (j+1 < n) {   //是否可以向右
            	System.out.println(Arrays.toString(lm)+i+" "+j);
            	lm[k++] = matrix[i][++j];
            }
        }
        System.out.println(Arrays.toString(lm));
        return lm;
    }
}