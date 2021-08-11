package org.example.leetCodePractice.practice1to20;

import org.example.dataStructure.ListNode;

import java.util.Stack;

/**
 * @Author xuxinyao
 * @Description: TODO
 * @Date 2021/7/2/11:12
 */
public class pratice19 {
    //给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
    //
    //进阶：你能尝试使用一趟扫描实现吗？
    //
    //
    //
    //示例 1：
    //
    //输入：head = [1,2,3,4,5], n = 2
    //输出：[1,2,3,5]
    /**
     * 使用  快慢指针
     * @Description:感觉 这个方法最好，写的时候没想到
     * todo 待实现
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode listNode = new ListNode();
        return listNode;
    }

    /**
     * 使用 栈
     * @Description: 一趟扫描，只想到了这个方法
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode listNode = new ListNode(-1, head);
        Stack<ListNode> stack = new Stack<>();
        stack.push(listNode);
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        ListNode temp = stack.peek();
        temp.next  = temp.next.next ;

        return listNode.next;
    }

}
