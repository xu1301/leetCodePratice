package StringPractice;

import java.util.Stack;

/**
 * @author xuxinyao
 * @since 2021/8/20/22:58
 */
public class ReverseStringII {
    /**
     * <a href="https://leetcode-cn.com/problems/reverse-string-ii/">反转字符串 II</a>
     * @param s
     * @param k
     * @return
     */
    public String reverseStr(String s, int k) {
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        int fast = 0;
        for (int i = 0; i < s.length(); i++) {
            if (fast == 2*k) {
                fast = 0;
            }
            if (stack.size() < k && fast < k) {
                stack.push(s.charAt(i));
            } else {
                if (stack.size() == k) {
                    while (!stack.isEmpty()) {
                        stringBuilder.append(stack.pop());
                    }
                }
                stringBuilder.append(s.charAt(i));
            }
            fast++;
        }
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }
}
