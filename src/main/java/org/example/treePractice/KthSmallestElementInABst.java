package org.example.treePractice;

import org.example.dataStructure.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author xuxinyao
 * @since 2021/8/23/23:53
 */
public class KthSmallestElementInABst {
    /**
     * <a href="https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/">二叉搜索树中第K小的元素</a>
     * @param root
     * @param k
     * @return
     */
    List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        recursionCount(root);
        return list.get(k - 1);
    }
    public void recursionCount(TreeNode node) {
        if (node == null) {
            return;
        }
        recursionCount(node.left);
        list.add(node.val);
        recursionCount(node.right);
    }

    /**
     *  todo 进阶 迭代算法实现
     */
    public int kthSmallest2(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        while (stack.size() >0 ) {
            TreeNode node = stack.pop();
            k--;
            if (k == 0) {
                return node.val;
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return -1;
    }
}
