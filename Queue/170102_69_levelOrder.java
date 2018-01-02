/**
69. 二叉树的层次遍历 
给出一棵二叉树，返回其节点值的层次遍历（逐层从左往右访问）

样例
给一棵二叉树 {3,9,20,#,#,15,7} ：
  3
 / \
9  20
  /  \
 15   7
返回他的分层遍历结果：
[
  [3],
  [9,20],
  [15,7]
]
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
     * @param root: A Tree
     * @return: Level order a list of lists of integer
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root != null) {
			queue.add(root);
		}
		int len = 1, l = 0;
		List<Integer> temp = new ArrayList<Integer>();
		while (!queue.isEmpty()) {
			if (len == 0) {
				List<Integer> ltemp = new ArrayList<Integer>();
				ltemp.addAll(temp);
				ans.add(ltemp);
				temp.clear();
				System.out.println(len+"  " + l);
				len = l;
				l = 0;
			} else {
				TreeNode t = queue.poll();
				temp.add(t.val);
				len--;
				if (t.left != null) {
					queue.add(t.left);
					l++;
				}
				if (t.right != null) {
					queue.add(t.right);
					l++;
				}
			}
		}
		if (temp.size() != 0)
		    ans.add(temp);
		return ans;
    }
}