package org.example.leetCodePractice.practice21to40;

/**
 * @Author xuxinyao
 * @Description: TODO
 * @Date 2021/7/4/11:21
 */
public class practice28 {
    //28. 实现 strStr()
    //实现 strStr() 函数。
    //
    //给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
    //
    //
    //
    //说明：
    //
    //当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
    //
    //对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。
    //
    //
    //
    //示例 1：
    //
    //输入：haystack = "hello", needle = "ll"
    //输出：2

    /**
     *  todo KMP算法都是简单题了？？
     */


    /**
     *  暴力匹配
     */
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean equal = true;
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    equal = false;
                    break;
                }
            }
            if (equal) {
                return i;
            }
        }
        return -1;
    }
}
