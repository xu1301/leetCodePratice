package org.example.treePractice;

import org.example.dataStructure.TreeNode;

/**
 * @author xuxinyao
 * @since 2021/8/18/8:50
 */
public class FlattenBinaryTreeToLinkedList {
    /**
     * <a href="https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/">二叉树展开为链表</a>
     * @param root
     */
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode node = root;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        flatten(node.right);
        while (node.right != null) {
            node = node.right;
        }
        node.right = temp;
        flatten(temp);
    }

}
