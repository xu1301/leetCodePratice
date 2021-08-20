package org.example.treePractice;

import org.example.dataStructure.TreeNode;

/**
 * @Author xuxinyao
 * @Description: 翻转二叉树
 * @Date 2021/8/10/22:59
 */
public class InvertBinaryTree {
    /**
     * @see <a href="https://leetcode-cn.com/problems/invert-binary-tree/">翻转二叉树</a>
     *  所以我能去Google吗？
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        //深度遍历  每个节点，分别交换左右节点
       recursionTree(root);
        return root;
    }
    private void recursionTree(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        recursionTree(node.left);
        recursionTree(node.right);
    }
}
