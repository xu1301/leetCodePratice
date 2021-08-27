package org.example.treePractice;

import org.example.dataStructure.TreeNode;

/**
 * @author xuxinyao
 * @since 2021/8/27/11:28
 */
public class MergeTwoBinaryTrees {
    /**
     * <a href="https://leetcode-cn.com/problems/merge-two-binary-trees/">合并二叉树</a>
     */
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 != null && root2 != null) {
            return new TreeNode(root1.val + root2.val, mergeTrees(root1.left,root2.left),mergeTrees(root1.right,root2.right));
        }
        if (root1 == null && root2 != null) {
            return root2;
        }
        if (root1!= null && root2 == null) {
            return root1;
        }
        return null;
    }
}
