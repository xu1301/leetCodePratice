package org.example;


import com.sun.xml.internal.ws.util.ASCIIUtility;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Hello world!
 */
public class App {
    //168. Excel表列名称
    //给你一个整数 columnNumber ，返回它在 Excel 表中相对应的列名称。
    //
    //例如：
    //
    //A -> 1
    //B -> 2
    //C -> 3
    //...
    //Z -> 26
    //AA -> 27
    //AB -> 28
    //...
    public String convertToTitle(int columnNumber) {
        String result = "";
        while (columnNumber > 0) {
            int temp = columnNumber % 27;
            columnNumber = columnNumber / 27;
            result = result + (char)((int)'A' + temp - 1);

        }
        return result;
    }
    public int waysToStep(int n) {
        int [] f = new int[n + 1];
        f[0] = 1;
        for (int i = 0; i < n; i++) {
            if (i > 1) {
                f[i] = f[i-1];
            } else if (i > 2) {
                f[i] = f[i-1] + f[i-2];
            } else if (i > 3) {
                f[i] = f[i-1] + f[i-2] + f[i-3];
            }
        }
        return f[n];
    }
    //编写一个函数来查找字符串数组中的最长公共前缀。
    //
    //如果不存在公共前缀，返回空字符串 ""。
    //示例 1：
    //
    //输入：strs = ["flower","flow","flight"]
    //输出："fl"
    //
    //示例 2：
    //
    //输入：strs = ["dog","racecar","car"]
    //输出：""
    //解释：输入不存在公共前缀。
    public String longestCommonPrefix(String[] strs) {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            for (int j = 0; j < strs.length; j++) {

            }
        }
    }



}
