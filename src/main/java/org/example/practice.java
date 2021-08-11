package org.example;

import org.example.dataStructure.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Pattern;

/**
 * @Author xuxinyao
 * @Description: TODO
 * @Date 2021/6/3/10:23
 */

public class practice {
    private static Pattern pattern = Pattern.compile("</br>\\s*（\\d）");
    public static void main(String[] args) {
        String str = "123";
        String str1 = new String("123");
        HashSet set = new HashSet();
        set.add(str);
        set.add(str1);
        set.add("asd");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.printf(String.valueOf(str.equals(str1)));
    }
    protected String string;
    String def;

    //[1,2]
    //[1,null,2]

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
            if (p.val == q.val) {
                if (p.left != null && q.left != null) {
                    return isSameTree(p.left,q.left);
                }
                if (p.right != null && q.right != null) {
                    return isSameTree(p.right,q.right);
                }
            }

        return true;
    }
    //[3,9,20,null,null,15,7],
    //[[3,9],[20,15],[7]]
    //层序遍历二叉树
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> nodeVec = new LinkedList<>();
        nodeVec.add(root);
        int dep = 0;
        while (nodeVec.size() != 0) {
            List<Integer> tempList = new ArrayList<>();
            int size = nodeVec.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = nodeVec.poll();
                if (treeNode == null) {
                    continue;
                }
                tempList.add(treeNode.val);
                if (treeNode.left != null) {
                    nodeVec.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    nodeVec.offer(treeNode.right);
                }
            }
            if (tempList.size() != 0) {
                dep++;
            }
        }
        return dep;
    }



}
