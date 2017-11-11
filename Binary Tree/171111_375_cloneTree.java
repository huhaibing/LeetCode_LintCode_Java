/**克隆二叉树
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
     * @param root: The root of binary tree
     * @return: root of new tree
     */
	public TreeNode cloneTree(TreeNode root) {
		if (root == null)
			return null;
		TreeNode croot = new TreeNode(root.val);
		helpCloneTree(root, croot);
		
		return croot;
	}
	public void helpCloneTree(TreeNode root, TreeNode croot) {
		if (root.left == null && root.right == null)
			return ;
		if (root.left != null) {
			croot.left = new TreeNode(root.left.val);
			helpCloneTree(root.left, croot.left);
		}
		if (root.right != null) {
			croot.right = new TreeNode(root.right.val);
			helpCloneTree(root.right, croot.right);
		}
	}
}