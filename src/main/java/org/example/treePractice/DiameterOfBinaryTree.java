package org.example.treePractice;

import org.example.dataStructure.TreeNode;

/**
 * @author xuxinyao
 * @since 2021/8/21/9:25
 */
public class DiameterOfBinaryTree {
    /**
     * <a href="https://leetcode-cn.com/problems/diameter-of-binary-tree/">二叉树的直径</a>
     * 自底向上遍历，每个节点的左子树的最大路径 与  右子树的最大路径 和
     */
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    public int depth(TreeNode node ) {
        if (node == null) {
            return 0;
        }
        int left = depth(node.left);
        int right = depth(node.right);
        int depth = Math.max(left,right) + 1;
        max = Math.max(max, left + right);
        return depth;
    }
}
