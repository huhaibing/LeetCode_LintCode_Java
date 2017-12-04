/**
114. 不同的路径 
有一个机器人的位于一个 m × n 个网格左上角。
机器人每一时刻只能向下或者向右移动一步。机器人试图达到网格的右下角。
问有多少条不同的路径？

 注意事项
n和m均不超过100

样例
给出 m = 3 和 n = 3, 返回 6.
给出 m = 4 和 n = 5, 返回 35.
*/

public class Solution {
    /*
     * @param m: positive integer (1 <= m <= 100)
     * @param n: positive integer (1 <= n <= 100)
     * @return: An integer
     */
     
    public int uniquePaths(int m, int n) {
		int[][] npath = new int[m][n];
		npath[0][0] = 1;
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				if (i==0 && j==0)
					continue;
				if (j == 0) {
					npath[i][j] += npath[i-1][j];
				} else if (i == 0) {
					npath[i][j] += npath[i][j-1];
				} else {
					npath[i][j] += npath[i-1][j] + npath[i][j-1];
				}
			}
		}
		return npath[m-1][n-1];
	}
}