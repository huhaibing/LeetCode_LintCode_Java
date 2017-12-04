/**
110. 最小路径和 
给定一个只含非负整数的m*n网格，找到一条从左上角到右下角的可以使数字和最小的路径。
*/

public class Solution {
    /*
     * @param grid: a list of lists of integers
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here
        int m = grid.length, n = grid[0].length;
        for (int i=m-1; i>=0; i--) {
            // 最后一行，只考虑右
            if (i == m-1) {
                for (int j=n-2; j>=0; j--) {
                    grid[i][j] += grid[i][j+1];
                }
            } else {
                // 正常行，考虑下和右
                int j=n-1;
                grid[i][j] += grid[i+1][j];
                j--;
                for (; j>=0; j--) {
                    grid[i][j] += Math.min(grid[i+1][j], grid[i][j+1]);
                }
            }
        }
        return grid[0][0];
    }
}