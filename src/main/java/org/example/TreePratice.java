package org.example;


import java.util.*;
import java.util.stream.Collector;

//
class TreePratice {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    //[10,5,15]
    //[10,5,null,null,15]


    public static void main(String[] args) {

    }
}