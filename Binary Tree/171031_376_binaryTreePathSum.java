/**
二叉树的路径和 
给定一个二叉树，找出所有路径中各节点相加总和等于给定 目标值 的路径。
一个有效的路径，指的是从根节点到叶节点的路径。
*/

import java.util.List;
import java.util.Set;
import java.util.Stack;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;


public class Solution {
    /*
     * @param root: the root of binary tree
     * @param target: An integer
     * @return: all valid paths
     */
	public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
		List<List<Integer>> targetTree = new ArrayList<>();
		Stack<Integer> sNode = new Stack<Integer>();
		int sum = 0;
		if (root == null)
		    return targetTree;
		
		stackTreeSum(targetTree, sNode, target, sum, root);
		
		return targetTree;
	}
	
	public void stackTreeSum(List<List<Integer>> lSumTarget, Stack<Integer> sNode,
							int target, int sum, TreeNode root) {
		sum += root.val;
		sNode.push(root.val);
		if (sum == target && root.left == null && root.right == null) {
			List<Integer> lTarget = new ArrayList<Integer>(sNode); //
			lSumTarget.add(lTarget);
			sNode.pop();
			return ;
		} else {
			if (root.left != null)
				stackTreeSum(lSumTarget, sNode, target, sum, root.left);
			if (root.right != null)
				stackTreeSum(lSumTarget, sNode, target, sum, root.right);
			sNode.pop();
		}
	}
}