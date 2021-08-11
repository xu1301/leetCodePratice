package org.example.leetCodePractice.practice21to40;

import java.util.ArrayList;
import java.util.Iterator;
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
        fun("(", n, result);
        return result;
    }
    public void fun(String temp, int n, List<String> result) {
        if (!isValid(temp,n)) {
            return;
        }
        if (temp.length() == 2 * n && isValid(temp,n)) {
                result.add(temp);
            return;
        }

        fun(temp + "(", n,  result);
        fun(temp + ")", n, result);
    }
    public boolean isValid(String str, int n ) {
        Stack<Character> stack = new Stack();
        int i = 0;
        int count = 0;
        while (i < str.length()) {
             if (str.charAt(i) == '(') {
                 stack.push(str.charAt(i));
                 count++;
             } else if(str.charAt(i) == ')') {
                 if (stack.size() == 0 || stack.pop() != '(') {
                     return false;
                 }
             }
             i++;
        }
        if (count > n) {
            return false;
        }
        return true;
    }
}
