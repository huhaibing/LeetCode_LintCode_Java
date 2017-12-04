/**
115. 不同的路径 II 
"不同的路径" 的跟进问题：
现在考虑网格中有障碍物，那样将会有多少条不同的路径？
网格中的障碍和空位置分别用 1 和 0 来表示。

 注意事项
m 和 n 均不超过100

样例
如下所示在3x3的网格中有一个障碍物：
[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
一共有2条不同的路径从左上角到右下角。
*/

public class Solution {
    /*
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
		int[][] npath = new int[m][n];
		if (obstacleGrid[0][0] == 1)
		    return 0;
		npath[0][0] = 1;
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				if (i==0 && j==0)
					continue;
				if (obstacleGrid[i][j] == 1)
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