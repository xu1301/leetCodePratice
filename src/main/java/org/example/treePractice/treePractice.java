package org.example.treePractice;

import org.example.dataStructure.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author xuxinyao
 * @Description: TODO
 * @Date 2021/8/6/21:31
 */
public class treePractice {
    public static void main(String[] args) {

    }

    /**
     * @leetcode 107
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

    /**
     * @leetcode
     * 判断二叉树是否对称
     * @递归法
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        //
    }


    /**
     * 路径总和
     * @param root
     * @param targetSum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
    }
}
