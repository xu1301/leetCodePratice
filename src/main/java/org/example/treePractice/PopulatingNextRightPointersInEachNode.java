package org.example.treePractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author xuxinyao
 * @since 2021/8/19/9:27
 */
public class PopulatingNextRightPointersInEachNode {
    private class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    /**
     * <a href="https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/">填充每个节点的下一个右侧节点指针</a>
     * 层序遍历
     * @param root
     * @return
     */
    public Node connect(Node root) {
        Queue<Node> q =  new LinkedList();
        if (root == null) {
            return root;
        }
        q.offer(root);
        while (q.size() != 0) {
            int size = q.size();
            List<Node> nodeList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                if (i < size - 1) {
                    node.next = q.peek();
                }
                if (node.left !=  null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
        }
        return root;
    }


}
