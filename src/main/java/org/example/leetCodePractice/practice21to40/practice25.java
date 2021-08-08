package org.example.leetCodePractice.practice21to40;

import org.example.dataStructure.ListNode;

public class practice25 {
    //给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
    //
    //k 是一个正整数，它的值小于或等于链表的长度。
    //
    //如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
    //
    //进阶：
    //
    //你可以设计一个只使用常数额外空间的算法来解决此问题吗？
    //你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
    // 
    //
    //示例 1：
    //
    //
    //输入：head = [1,2,3,4,5], k = 2
    //输出：[2,1,4,3,5]
    /**
     * @Practice24 进阶版
     * todo 未通过
     * 时间复杂度: O(n)
     */
    //[1,2,3,4,5]
    //3
    public ListNode reverseKGroup(ListNode head, int k) {
        float a = (float) 1.1;
        ListNode first = new ListNode(-1, head);
        ListNode temp= first;
        ListNode countNode = head;
        while (true) {
            boolean flag = true;
            for (int i = 0; i < k; i++) {
                if (countNode == null) {
                    flag = false;
                    break;
                }
                countNode = countNode.next;
            }
            if (!flag) {
                break;
            }
            for (int i = 0; i < k; i++) {
                ListNode one = temp.next;
                ListNode two = temp.next.next;
                temp.next = two;
                one.next = two.next;
                two.next = one;
                temp = one;
            }
        }
        return first.next;
    }
}
