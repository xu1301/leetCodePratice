package org.example.treePractice;

import org.example.dataStructure.TreeNode;

/**
 * @author xuxinyao
 * @since 2021/8/20/10:28
 */
public class BalancedBinaryTree {
    /**
     * <a href="https://leetcode-cn.com/problems/balanced-binary-tree/">平衡二叉树</a>
     * 自底向下递归
     * O(n)
     * @param root
     * @return
     */
    public boolean isBalanced2(TreeNode root) {
        return height(root) != -1;
    }

    public int  height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        if (Math.abs(leftHeight - rightHeight) > 1 || leftHeight == -1 || rightHeight == -1) {
            return -1;
        } else {
            return Math.max(leftHeight,rightHeight) + 1;
        }
    }




    /**
     * 自顶向下递归高度
     * O(n^2)
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1 && isBalanced(root.right) && isBalanced(root.left);
    }

    public int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getHeight(node.left),getHeight(node.right)) + 1;
    }



}
