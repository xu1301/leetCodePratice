package org.example.treePractice;

import org.example.dataStructure.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author xuxinyao
 * @Description: 路径总和
 * @Date 2021/8/9/20:20
 */
public class PathSum {

    /**
     * @see <a href="https://leetcode-cn.com/problems/path-sum/">路径总和</a>
     * @method todo 递归(深度遍历，求和)
     * 前序遍历的变形
     * @see Traversal#preRecursion;
     * @param root
     * @param targetSum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            if (targetSum - root.val == 0) {
                return true;
            }
        }
        return hasPathSum(root.left,targetSum - root.val) || hasPathSum(root.right,targetSum - root.val);
    }

    /**
     * 层序遍历 的 变形
     * @see levelOrder#levelOrder;
     * @param root
     * @param targetSum
     * @return
     */
    public boolean hasPathSum2(TreeNode root, int targetSum) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            if (treeNode == null) {
                continue;
            }
            if (treeNode.right == null && treeNode.left == null) {
                if (treeNode.val == targetSum) {
                    return true;
                }
            }
            int temp = treeNode.val;
            if (treeNode.left != null) {
                treeNode.left.val = temp + treeNode.left.val;
                queue.offer(treeNode.left);
            }
            if (treeNode.right != null) {
                treeNode.right.val = temp + treeNode.right.val;
                queue.offer(treeNode.right);
            }
        }
        return false;
     }
}
