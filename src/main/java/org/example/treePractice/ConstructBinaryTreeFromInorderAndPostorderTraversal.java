package org.example.treePractice;

import org.example.dataStructure.TreeNode;

import java.util.Arrays;

/**
 * @author xuxinyao
 * @since 2021/8/19/23:00
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    /**
     * <a href="https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/">从中序与后序遍历序列构造二叉树</a>
     * @param inorder
     * @param postorder
     * @return
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        //中序遍历 inorder = [9,3,15,20,7]
        //后序遍历 postorder = [9,15,7,20,3]
        return recursionBuild(inorder,postorder,0,inorder.length - 1,0,postorder.length - 1);
    }
    private TreeNode recursionBuild(int [] inorder, int[] postorder, int inLeft, int inRight, int postLeft, int postRight) {
        if (inLeft > inRight) {
            return null;
        }
        int rootVal = postorder[postRight];
        TreeNode root = new TreeNode(rootVal);
        //计算左子树的长度
        int index = indexOf(rootVal, inorder);
        int leftSubTreeLength = index - inLeft;


        root.left = recursionBuild(inorder,postorder,inLeft,index - 1, postLeft, postLeft + leftSubTreeLength - 1);
        root.right = recursionBuild(inorder,postorder,index+1,inRight,postLeft+leftSubTreeLength,postRight -1);

        return root;
    }

    int indexOf(int val, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (val == array[i] ) {
                return i;
            }
        }
        return -1;
    }
}
