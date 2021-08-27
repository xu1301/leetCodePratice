package org.example.treePractice;

import org.example.dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuxinyao
 * @since 2021/8/27/10:58
 */
public class BinaryTreePaths {
    /**
     * <a href="https://leetcode-cn.com/problems/binary-tree-paths/">二叉树的所有路径</a>
     * @param root
     * @return
     */
    List<String> result= new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        List<Integer> onePath = new ArrayList<>();
        recursion(root, onePath);
        return result;
    }
    public void recursion(TreeNode node, List<Integer> onePath) {
        if (node == null) {
            return;
        } else {
            onePath.add(node.val);
        }
        if (node.right == null && node.left == null) {
            StringBuilder one = new StringBuilder();
            for (int i = 0; i < onePath.size(); i++) {
                one.append(onePath.get(i));
                if (i != onePath.size() - 1) {
                    one.append("->");
                }
            }
            result.add(one.toString());
            onePath.remove(onePath.size() - 1);
            return;
        }

        recursion(node.left, onePath);
        recursion(node.right, onePath);
        onePath.remove(onePath.size() - 1);
    }
}
