/**
71. 二叉树的锯齿形层次遍历 
给出一棵二叉树，返回其节点值的锯齿形层次遍历（先从左往右，下一层再从右往左，层与层之间交替进行） 

样例
给出一棵二叉树 {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
返回其锯齿形的层次遍历为：
[
  [3],
  [20,9],
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
     * @return: A list of lists of integer include the zigzag level order traversal of its nodes' values.
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // write your code here
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root != null) {
			queue.add(root);
		}
		int len = 1, l = 0, flag = 1;
		List<Integer> temp = new ArrayList<Integer>();
		while (!queue.isEmpty()) {
			if (len == 0) {
				List<Integer> ltemp = new ArrayList<Integer>();
				ltemp.addAll(temp);
				ans.add(ltemp);
				temp.clear();
				len = l;
				l = 0;
				flag = 0-flag;  // 遍历一层，交换顺序
			} else {
				TreeNode t = queue.poll();
				// 用flag记录添加顺序
				if (flag == 1)
				    temp.add(t.val);
				else
				    temp.add(0, t.val);
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