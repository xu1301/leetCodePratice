package org.example.treePractice;

import org.example.dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author xuxinyao
 * @Description: 二叉树的右视图
 * @Date 2021/8/10/22:10
 */
public class BinaryTreeRightSideView {
    /**
     * @see <a href="https://leetcode-cn.com/problems/binary-tree-right-side-view/">二叉树的右视图</a>
     * 层序遍历 的变形
     * @see levelOrder#levelOrder;
     * @param root
     * @return
     */
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode tempNode = queue.poll();
                if (tempNode == null) {
                    continue;
                }
                if (tempNode.left != null) {
                    queue.offer(tempNode.left);
                }
                if (tempNode.right != null) {
                    queue.offer(tempNode.right);
                }
                //装入 树 的 每层的最后一个元素
                if (i == size - 1) {
                    result.add(tempNode.val);
                }
            }
        }
        return result;
    }
}
