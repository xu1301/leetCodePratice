package org.example.treePractice;

import org.example.dataStructure.TreeNode;

/**
 * @author xuxinyao
 * @since 2021/8/27/20:25
 */
public class IncreasingOrderSearchTree {
    /**
     * <a href="https://leetcode-cn.com/problems/increasing-order-search-tree/">递增顺序搜索树</a>
     * @param root
     * @return
     */
    TreeNode conNode = new TreeNode();
    public TreeNode increasingBST(TreeNode root) {
        TreeNode result = conNode;
        recursion(root);
        return result.right;
    }
    public void recursion(TreeNode root) {
        if (root == null) {
            return;
        }
        recursion(root.left);
        conNode.right = root;
        conNode = root;
        root.left = null;
        recursion(root.right);
    }

}
