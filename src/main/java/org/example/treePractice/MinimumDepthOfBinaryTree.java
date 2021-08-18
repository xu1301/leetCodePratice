package org.example.treePractice;

import org.example.dataStructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xuxinyao
 * @since 2021/8/18/9:45
 */
public class MinimumDepthOfBinaryTree {
    /**
     * <a href="https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/">二叉树的最小深度</a>
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int min = 1;
        while (queue.size() != 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                if (treeNode.left == null && treeNode.right == null ) {
                    return min;
                }
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }
            min++;
        }
        return min;
    }
}
