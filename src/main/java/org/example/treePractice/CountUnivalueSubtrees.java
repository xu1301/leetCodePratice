package org.example.treePractice;

import org.example.dataStructure.TreeNode;

/**
 * @author xuxinyao
 * @since 2021/8/24/22:29
 */
public class CountUnivalueSubtrees {
    /**
     * <a href="https://leetcode-cn.com/problems/count-univalue-subtrees/">统计同值子树</a>
     *  给定一个二叉树，统计该二叉树数值相同的子树个数。
     *  同值子树是指该子树的所有节点都拥有相同的数值。
     */
    int count = 0;
    public int countUnivalSubtrees(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (isUnival(root)) {
            count++;
        }
        countUnivalSubtrees(root.left);
        countUnivalSubtrees(root.right);
        return count;
    }
    public boolean isUnival(TreeNode node) {
        if (node == null) {
            return true;
        }
        boolean hasRight = node.right == null || node.val == node.right.val;
        boolean hasLeft = node.left == null || node.val == node.left.val;
        return isUnival(node.right) && isUnival(node.left) && hasLeft && hasRight;
    }
}
