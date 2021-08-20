package org.example.treePractice;

import org.example.dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuxinyao
 * @since 2021/8/19/22:14
 */
public class RecoverBinarySearchTree {
    /**
     * <a href="https://leetcode-cn.com/problems/recover-binary-search-tree/">恢复二叉搜索树</a>
     * @param root
     */
    TreeNode node1 = null;
    TreeNode node2 = null;
    TreeNode node3 = null;
    TreeNode preNode = null;
    public void recoverTree(TreeNode root) {
        inorder(root);
        if (node2 != null) {
            int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;
        } else {
            int temp = node1.val;
            node1.val = node3.val;
            node3.val = temp;
        }
    }
    private void inorder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        if (treeNode.left != null) {
            inorder(treeNode.left);
        }
        if (preNode != null) {
            if (treeNode.val <= preNode.val) {
                if (node1 == null) {
                    node1 = preNode;
                    node3 = treeNode;
                } else {
                    node2 = treeNode;
                }
            }
        }
        preNode = treeNode;
        if (treeNode.right != null) {
            inorder(treeNode.right);
        }
    }
}
