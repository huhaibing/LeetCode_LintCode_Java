/**
177. 把排序数组转换为高度最小的二叉搜索树 
给一个排序数组（从小到大），将其转换为一棵高度最小的排序二叉树。

 注意事项
There may exist multiple valid solutions, return any of them.

样例
给出数组 [1,2,3,4,5,6,7], 返回

     4
   /   \
  2     6
 / \    / \
1   3  5   7
*/

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param A: an integer array
     * @return: A tree node
     */
	public TreeNode sortedArrayToBST(int[] A) {
        // write your code here
		int left = 0, right = A.length-1;
		return helpSortedArrayToBST(A, left, right);
    }
	public TreeNode helpSortedArrayToBST(int[] A, int left, int right) {
		if (left <= right) {
			int mid = (left + right) / 2;
			TreeNode root = new TreeNode(A[mid]);
			root.left = helpSortedArrayToBST(A, left, mid-1);
			root.right = helpSortedArrayToBST(A, mid+1, right);
			return root;
		} else 
			return null;
	}
}