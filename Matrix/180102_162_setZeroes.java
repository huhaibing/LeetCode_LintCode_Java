/**
162. 矩阵归零 
给定一个m×n矩阵，如果一个元素是0，则将其所在行和列全部元素变成0。
需要在原矩阵上完成操作。

样例
给出一个矩阵
[
  [1, 2],
  [0, 3]
]
返回
[
  [0, 2],
  [0, 0]
]
*/

public class Solution {
    /*
     * @param matrix: A lsit of lists of integers
     * @return: 
     */
    public void setZeroes(int[][] matrix) {
        // write your code here
        List<Integer> row = new ArrayList<Integer>();
        List<Integer> col = new ArrayList<Integer>();
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++){            
                if (matrix[i][j] == 0) {
                    if (!row.contains(i))
                        row.add(i);
                    if (!col.contains(j))
                        col.add(j);
                }
            }
        }
        for (int p=0; p<row.size(); p++) {
            for (int q=0; q<matrix[0].length; q++) {
                matrix[row.get(p)][q] = 0;
            }
        }
        for (int q=0; q<col.size(); q++) {
        	for (int p=0; p<matrix.length; p++) {
        		matrix[p][col.get(q)] = 0;
        	}
        }
    }
}