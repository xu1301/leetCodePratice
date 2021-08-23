package org.example.treePractice;

import org.example.dataStructure.TreeNode;

/**
 * @author xuxinyao
 * @since 2021/8/21/23:24
 */
public class BinaryTreeUpsideDown {
    /**
     * <a href="https://leetcode-cn.com/problems/binary-tree-upside-down/">上下翻转二叉树</a>
     * @param root
     * @return
     */
    public TreeNode upsideDownBinaryTree(TreeNode root) {
        TreeNode right = null, father = null;
        while (root != null) {
            TreeNode left = root.left;
            root.left = right;
            right = root.right;
            root.right = father;
            father = root;

            root = left;
        }
        return father;
    }
}
