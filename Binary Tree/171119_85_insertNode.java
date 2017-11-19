/**
在二叉查找树中插入节点
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
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if (root == null) 
            root = new TreeNode(node.val);
        TreeNode temp = root;
        if (node.val > root.val) {
            if (root.right == null) {
                root.right = node;
            } else {
                insertNode(root.right, node);
            }
        }
        if (node.val < root.val) {
            if (root.left == null) {
                root.left = node;
            } else {
                insertNode(root.left, node);
            }
        }
        return temp;
    }
}