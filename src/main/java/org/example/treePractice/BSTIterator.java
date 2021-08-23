package org.example.treePractice;

import org.example.dataStructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author xuxinyao
 * @since 2021/8/23/21:58
 */

/**
 * 实现一个二叉搜索树 迭代器
 * @see <a href="https://leetcode-cn.com/problems/binary-search-tree-iterator/">二叉搜索树迭代器</a>
 */
public class BSTIterator {
    Queue<Integer> queue = new LinkedList<>();

    public BSTIterator(TreeNode root) {
        recursionBuild(root);
    }
    public void recursionBuild(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        recursionBuild(treeNode.left);
        queue.offer(treeNode.val);
        recursionBuild(treeNode.right);
    }

    public int next() {
        return queue.poll();
    }

    public boolean hasNext() {
        if (queue.size() > 0) {
            return true;
        }
        return false;
    }
}
