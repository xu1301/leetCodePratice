package org.example.treePractice;

import org.example.dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author xuxinyao
 * @since 2021/8/27/23:05
 */
public class MaximumWidthOfBinaryTree {
    /**
     * <a href="https://leetcode-cn.com/problems/maximum-width-of-binary-tree/">二叉树最大宽度</a>
     * @param root
     * @return
     */
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int max = -1;
        while (queue.size() != 0) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    list.add(node.val);
                    queue.offer(node.left);
                    queue.offer(node.right);
                }else {
                    list.add(null);
                    queue.offer(null);
                    queue.offer(null);
                }
            }
            int count = countWidth(list);
            max = Math.max(max, count);
            if (count == 0) {
                break;
            }
        }
        return max;
    }
    private int countWidth(List<Integer> list) {
        int start = -1;
        int end = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && start == -1) {
                start = i;
            }
            if (list.get(i) != null && start != -1) {
                end = i;
            }
        }
        if (start == -1) {
            return 0;
        }
        if (end == start) {
            return 1;
        }
        return end - start + 1;
    }
}
