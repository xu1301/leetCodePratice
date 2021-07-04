package org.example.practice21to40;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class practice22 {
    //22. 括号生成
    //数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
    //
    //
    //
    //示例 1：
    //
    //输入：n = 3
    //输出：["((()))","(()())","(())()","()(())","()()()"]

    /**
     *  todo 回溯算法
     *  递归
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            fun("(", n);
        }
        return result;
    }
    public void fun(String temp, int n) {

    }
    public boolean isValid(String str ) {
        if (str.length() <= 1) {
            return false;
        }
        Stack<Character> stack = new Stack();
        stack.push(str.charAt(0));
        int i = 1;
        while (stack.size() != 0) {
            if (str.charAt(i) == ')') {
                if (stack.pop() != '(' ) {
                    return false;
                }
            }
        }
        if (stack.size() == 0 ) {
            return true;
        }
        return false;
    }
}
