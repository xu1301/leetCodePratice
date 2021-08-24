package org.example.treePractice;

import org.example.dataStructure.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @author xuxinyao
 * @since 2021/8/24/18:55
 */
public class LowestCommonAncestorOfABinarySearchTree {
    /**
     * <a href="https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/">二叉搜索树的最近公共祖先</a>
     * <a href="https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/">二叉树的最近公共祖先</a>
     * todo 解法没用到二叉搜索树的性质，注意审题！
     */
    Map<Integer, TreeNode> map = new HashMap<Integer, TreeNode>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        generateMap(root);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(p.val);
        while (p.val != root.val) {
            TreeNode node = map.get(p.val);
            queue.offer(node.val);
            p = node;
        }
        while (q.val != root.val) {
            if (queue.contains(q.val)) {
                return q;
            }
            TreeNode node = map.get(q.val);

            q = node;
        }
        return root;
    }
    public void generateMap(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            map.put(root.left.val, root);
            generateMap(root.left);
        }
        if (root.right != null) {
            map.put(root.right.val,root);
            generateMap(root.right);
        }
    }
}
