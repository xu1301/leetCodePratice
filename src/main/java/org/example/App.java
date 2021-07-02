package org.example;


import com.sun.xml.internal.ws.util.ASCIIUtility;

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


    //输入：
    //"MCMXCIV"
    //输出：
    //2216
    //预期结果：
    //1994
    //13. 罗马转数字
    public int romanToInt(String s) {
        int [] sys = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        List<String> roma = Arrays.asList("I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M");
        int result = 0;
        for (int i = 0; i < s.length() ; i++) {
            if (s.length() - i >= 2) {
                String temp = s.substring(i,i + 2);
                if (roma.contains(temp)) {
                    result += sys[roma.indexOf(temp)];
                    i++;
                    continue;
                }
            }
            result += sys[roma.indexOf(String.valueOf(s.charAt(i)))];
        }
        return result;
    }


    //12.罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
    //
    //字符          数值
    //I             1
    //V             5
    //X             10
    //L             50
    //C             100
    //D             500
    //M             1000
    //
    //例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
    //
    //通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
    //
    //    I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
    //    X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
    //    C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
    //1994
    //输出：
    //"MIMICIV"
    //预期结果：
    //"MCMXCIV"
    //给你一个整数，将其转为罗马数字。
    public String intToRoman(int num) {
        int [] sys = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] roma = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = sys.length - 1; i >= 0; i--) {
            if (num >= sys[i]) {
                int temp = num /sys[i];
                for (int j = 0; j < temp; j++) {
                    stringBuilder.append(roma[i]);
                }
                num = num % sys[i];
            }
        }
        return String.valueOf(stringBuilder);
    }
}
