package org.example.treePractice;

import org.example.dataStructure.TreeNode;
import sun.reflect.generics.tree.Tree;

/**
 * @author xuxinyao
 * @since 2021/8/19/23:58
 */
public class ConvertSortedArrayToBinarySearchTree {
    /**
     * <a href="https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/">将有序数组转换为二叉搜索树</a>
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return recursionBuild(nums, 0, nums.length - 1);
    }

    private TreeNode recursionBuild(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = recursionBuild(nums, left, mid -1 );
        root.right = recursionBuild(nums,mid + 1,right);
        return root;
    }
}
