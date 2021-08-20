package org.example.treePractice;

import org.example.dataStructure.TreeNode;

/**
 * @author xuxinyao
 * @since 2021/8/19/9:49
 */
public class SumRootToLeafNumbers {
    /**
     * <a href="https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/">求根节点到叶节点数字之和</a>
     * @param root
     * @return
     */
    int sum=0;
    StringBuilder stringBuilder = new StringBuilder();
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        recursionSum(root);
        return sum;
    }
    public void recursionSum(TreeNode node) {
        stringBuilder.append(node.val);
        if (node.right == null && node.left == null && stringBuilder.length() > 0) {
            sum += Integer.parseInt(stringBuilder.toString());
        }
        if (node.left != null) {
            recursionSum(node.left);
        }
        if (node.right != null) {
            recursionSum(node.right);
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
    }
}
