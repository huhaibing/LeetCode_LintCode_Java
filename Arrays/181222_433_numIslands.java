public class Solution {
    /**
     * @param grid: a boolean 2D matrix
     * @return: an integer
     */
    public int numIslands(boolean[][] nums) {
        int res = 0;
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[0].length; j++) {
				if (nums[i][j] == true) {
					verify(nums, i, j);
					res ++;
				}
			}
		}
		return res;
    }
    public void verify(boolean[][] nums, int i, int j) {
		if (i>=0 && i<nums.length  && j>=0 && j<nums[0].length && nums[i][j]==true) {
			nums[i][j] = false;
			verify(nums, i+1, j);
			verify(nums, i-1, j);
			verify(nums, i, j+1);
			verify(nums, i, j-1);
		} else {
			return ;
		}
		
	}
}