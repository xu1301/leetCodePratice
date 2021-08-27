package org.example.treePractice;

import com.sun.deploy.util.StringUtils;
import org.example.dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuxinyao
 * @since 2021/8/25/20:59
 */
public class BinaryTreePaths {
    /**
     * <a href="https://leetcode-cn.com/problems/binary-tree-paths/">二叉树的所有路径</a>>
     */

    List<String> result = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> onepath = new ArrayList<>();
        recursionBuild(root,onepath);
        return result;
    }

    private void recursionBuild(TreeNode node, List<String> onePath) {
        if (node.left == null && node.right == null) {
            String oneResult = "";
            oneResult += onePath;
            result.add(oneResult);
            return;
        }
        onePath.add(String.valueOf(node.val));
        recursionBuild(node.left, onePath);
        recursionBuild(node.right, onePath);
        onePath.remove(onePath.size() - 1);
    }
}
