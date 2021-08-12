package org.example.treePractice;

import org.example.dataStructure.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuxinyao
 * @Description: 二叉树的三种遍历方式
 * @Date 2021/8/9/21:33
 */
public class Traversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderRecursion(root,result);
        return result;
    }

    /**
     * @see <a href="https://leetcode-cn.com/problems/binary-tree-inorder-traversal/">中序遍历</a>
     * @param treeNode
     * @param result
     */
    public void inorderRecursion(TreeNode treeNode, List<Integer> result) {
        if (treeNode == null) {
            return;
        }
        if (treeNode.left != null) {
            inorderRecursion(treeNode.left,result);
        }
        result.add(treeNode.val);
        if (treeNode.right != null) {
            inorderRecursion(treeNode.right,result);
        }
    }

    /**
     * @see <a href="https://leetcode-cn.com/problems/binary-tree-preorder-traversal/">前序遍历</a>
     * @param treeNode
     * @param result
     */
    public void preRecursion(TreeNode treeNode, List<Integer> result) {
        if (treeNode == null) {
            return;
        }
        result.add(treeNode.val);
        if (treeNode.left != null) {
            preRecursion(treeNode.left,result);
        }
        if (treeNode.right != null) {
            preRecursion(treeNode.right,result);
        }
    }
}
