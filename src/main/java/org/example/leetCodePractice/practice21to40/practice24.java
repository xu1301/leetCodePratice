package org.example.leetCodePractice.practice21to40;

import org.example.dataStructure.ListNode;

public class practice24 {

    //24. 两两交换链表中的节点
    //给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
    //
    //你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
    //
    //
    //
    //示例 1：
    //
    //
    //输入：head = [1,2,3,4]
    //输出：[2,1,4,3]

    /**
     *  一次遍历即可更换
     *  时间复杂度：O(n)
     */
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode first = new ListNode(-1, head);
            ListNode temp = first;
            while (temp.next != null && temp.next.next != null) {
                ListNode one = temp.next;
                ListNode two = temp.next.next;

                temp.next = two;
                one.next = two.next;
                two.next = one;
                temp = one;
            }
            return first.next;
        }
}
