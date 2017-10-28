/*
判断数独是否合法 
请判定一个数独是否有效。
该数独可能只填充了部分数字，其中缺少的数字用 . 表示。

 注意事项
一个合法的数独（仅部分填充）并不一定是可解的。我们仅需使填充的空格有效即可
*/
public class Solution {
    /*
     * @param board: the board
     * @return: whether the Sudoku is valid
     */
	private Set<Character> sNums = new HashSet<>();
    public boolean isValidSudoku(char[][] board) {
        // write your code here
        if (board.length != 9 || board[0].length != 9) 
            return false;
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
            	if (!isUnique(board[i][j]))
            		return false;
            }
            sNums.clear();
        }
        for (int j=0; j<9; j++) {
            for (int i=0; i<9; i++) {
            	if (!isUnique(board[i][j]))
            		return false;
            }
            sNums.clear();
        }
    	for (int i=0; i<9; i++) {
    		for (int j=0; j<9; j++) {
    		    System.out.println((i/3*3 + j/3) + " " + (i/3*3 + j/3));
    			if (!isUnique(board[i/3*3 + j/3][i%3*3 + j%3]))
    				return false;
    		}
    		sNums.clear();
    	}
        return true;
    }
    
    public boolean isUnique(char a){
    	if (a == '.') {
    		return true;
    	} else if (a >= '1' && a <= '9' && !sNums.contains(a)) {
    		sNums.add(a);
    		return true;
        } else {
            return false;
        }
    }
}