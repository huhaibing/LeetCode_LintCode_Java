/**
将二叉树拆成链表
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
     * @param root: a TreeNode, the root of the binary tree
     * @return: 
     */
    public void flatten(TreeNode root) {
		if (root == null)
			return ;
		if (root.left != null) {
			TreeNode temp = root.left;
			while (temp.right != null) {
				temp = temp.right;
			}
			temp.right = root.right;
			root.right = root.left;
			root.left = null;
		}
		if (root.right != null) {
			flatten(root.right);
		}
	}
}