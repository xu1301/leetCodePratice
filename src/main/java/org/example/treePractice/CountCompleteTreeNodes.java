package org.example.treePractice;

import org.example.dataStructure.TreeNode;

/**
 * @author xuxinyao
 * @since 2021/8/23/22:17
 */
public class CountCompleteTreeNodes {
    /**
     * <a href="https://leetcode-cn.com/problems/count-complete-tree-nodes/">完全二叉树的节点个数</a>
     * 遍历找到树中右下角的节点，根据完全二叉树的数学关系 计算节点个数
     * @param root
     * @return
     */
    int count = 0;
    public int countNodes(TreeNode root) {
        if (root == null) {
            return count;
        }
        count++;
        countNodes(root.left);
        countNodes(root.right);
        return count;
    }

    //todo log n^2进阶做法

}
