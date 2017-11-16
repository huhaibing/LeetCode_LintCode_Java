/**
子树 
有两个不同大小的二叉树： T1 有上百万的节点； T2 有好几百的节点。请设计一种算法，判定 T2 是否为 T1的子树。
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
     * @param T1: The roots of binary tree T1.
     * @param T2: The roots of binary tree T2.
     * @return: True if T2 is a subtree of T1, or false.
     */
    public boolean isSubtree(TreeNode T1, TreeNode T2) {
		if (T2 == null)
			return true;
		if (T1 == null)
			return false;
		if (!helpIsSubtree(T1, T2)) {
		    //将左子树和右子树与T2进行相等比较
			return (isSubtree(T1.left, T2)==true || isSubtree(T1.right, T2)==true);
		}
		return true;
        
    }
    //判断两树是否相等
    public boolean helpIsSubtree(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null)
			return true;
		if ((t1==null && t2!=null) || (t1!=null && t2==null))
			return false;
		if (t1.val == t2.val) {
			return (helpIsSubtree(t1.left, t2.left) && helpIsSubtree(t1.right, t2.right));
		}
		return false;
	}
}