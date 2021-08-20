package org.example.treePractice;

import org.example.dataStructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xuxinyao
 * @since 2021/8/19/21:22
 */
public class ValidateBinarySearchTree {
    //todo 最简单的方法：二叉搜索树的中序遍历结果为升序的，
    // 中序遍历二叉搜索树，判断数组是否为升序的
    /**
     * <a href="https://leetcode-cn.com/problems/validate-binary-search-tree/">验证二叉搜索树</a>
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        return  subTreeIsValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    /***
     * 判断 子树上的所有值是否 大于(小于) val
     * @param node
     */
    private boolean subTreeIsValid(TreeNode node, long lower, long bigger) {
        if (node == null) {
            return true;
        }
         if (node.val <= lower || node.val >= bigger) {
             return false;
         }
         return subTreeIsValid(node.right, node.val, bigger) && subTreeIsValid(node.left, lower, node.val);
    }
}
