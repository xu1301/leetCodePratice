package org.example.treePractice;

import org.example.dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author xuxinyao
 * @since 2021/8/18/9:53
 */
public class PathSum2 {
    /**
     *  <a href="https://leetcode-cn.com/problems/path-sum-ii/">路径总和 II</a>
     * @param root
     * @param targetSum
     * @return
     */
    List<List<Integer>> result = new ArrayList<>();
    Deque<Integer> onePath = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        recursionSum(root, targetSum);
        return result;
    }

    public void recursionSum(TreeNode node, int targetSum) {
        if (node == null) {
            return;
        }
        onePath.add(node.val);
        if (node.left == null && node.right == null) {
            if (targetSum - node.val == 0) {
                result.add(new ArrayList<>(onePath));
            }
        }
        recursionSum(node.left, targetSum - node.val);
        recursionSum(node.right, targetSum - node.val);
        onePath.pollLast();
    }

//    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//        List<List<Integer>> result = new ArrayList<>();
//        if (root == null ){
//            return result;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        List<Integer> list = new ArrayList<>();
//        list.add(root.val);
//
//        while (queue.size() != 0) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode treeNode = queue.poll();
//                if (treeNode.left == null && treeNode.right == null) {
//                    if (treeNode.val == targetSum) {
//
//                    }
//                }
//
//                if (treeNode.left != null) {
//                    treeNode.left.val = treeNode.val + treeNode.left.val;
//                    queue.add(treeNode.left);
//                }
//                if (treeNode.right != null ){
//                    treeNode.right.val = treeNode.val + treeNode.right.val;
//                    queue.add(treeNode.right);
//                }
//            }
//        }
//
//        return result;
//    }
}
