package org.example.treePractice;

import org.example.dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author xuxinyao
 * @Description: 二叉树的层序遍历
 * @Date 2021/8/6/21:31
 */
public class levelOrder {
    /**
     * @see <a href="https://leetcode-cn.com/problems/binary-tree-level-order-traversal/">二叉树的层序遍历</a>
     * 层序遍历 二叉树
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> oneList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    oneList.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            if (oneList.size() != 0) {
                result.add(oneList);
            }
        }
        return result;
    }
}
