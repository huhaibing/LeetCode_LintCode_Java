/**二叉树的所有路径
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
     * @param root: the root of the binary tree
     * @return: all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
		List<String> paths = new ArrayList<>();
		strBinaryTreePaths(paths, "", root);
		System.out.println(paths);
		return paths;
	}
	
	public void strBinaryTreePaths(List<String> lsPaths, String str, TreeNode root) {
		if (root == null)
			return ;
		str =  str + "->" + root.val;
		if (root.left==null && root.right==null) {
			lsPaths.add(str.substring(2,str.length()));
		}
		if (root.left != null){
			strBinaryTreePaths(lsPaths, str, root.left);
		}
		if (root.right != null) {
			strBinaryTreePaths(lsPaths, str, root.right);
		}
	}
}