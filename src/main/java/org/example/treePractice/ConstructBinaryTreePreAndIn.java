package org.example.treePractice;

import org.example.dataStructure.TreeNode;

/**
 * @author xuxinyao
 * @since 2021/8/15/23:40
 */
public class ConstructBinaryTreePreAndIn {
    /**
     * @param preorder 前序遍历序列
     * @param inorder  中序遍历序列
     * @return
     * @see <a href="https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/">从前序与中序遍历序列构造二叉树</a>
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return recursionBulid(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    public TreeNode recursionBulid(int[] preorder, int[] inorder, int preLeft, int preRight, int inLeft, int inRight) {
        if (preLeft > preRight) {
            //这里注意  是大于时 才返回null
            //为什么不是等于？ left == right 时 还能再构建一个 左右节点为null 的子树
            return null;
        }
        if (inLeft > inRight) {
            return null;
        }
        int rootVal = preorder[preLeft];
        TreeNode treeNode = new TreeNode(rootVal);
        int index = indexOf(inorder, rootVal);
        int leftLength = index - inLeft;
        int rightLength = inRight - index;

        TreeNode leftTree = recursionBulid(preorder, inorder, preLeft + 1, preLeft + leftLength , inLeft, index - 1);
        TreeNode rightTree = recursionBulid(preorder, inorder, preRight - rightLength + 1, preRight,index + 1, inRight);
        treeNode.right = rightTree;
        treeNode.left = leftTree;
        return treeNode;
    }

    public int indexOf(int[] array, int val) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
