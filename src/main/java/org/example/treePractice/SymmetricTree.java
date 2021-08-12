package org.example.treePractice;

import org.example.dataStructure.TreeNode;

/**
 * @Author xuxinyao
 * @Description: TODO
 * @Date 2021/8/9/20:21
 */
public class SymmetricTree {
    /**
     * @see <a href="https://leetcode-cn.com/problems/symmetric-tree">对称二叉树</a>
     * 判断二叉树是否对称
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return isSameTree(root.left,root.right);
    }

    /**
     * @method 递归法
     * @param left
     * @param right
     * @return
     */
    public boolean isSameTree(TreeNode left, TreeNode right) {
        //左节点的左子树 等于 右节点的右子树
        if (left == null && right == null) {
            return true;
        } else if (left != null && right != null) {
            if (left.val == right.val) {
                return isSameTree(left.left,right.right) && isSameTree(left.right,right.left);
            }else {
                return false;
            }
        } else {
            return false;
        }
    }

}
