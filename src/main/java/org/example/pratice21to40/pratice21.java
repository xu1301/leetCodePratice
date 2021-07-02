package org.example.pratice21to40;

import org.example.dataStructure.ListNode;

import java.util.List;

public class pratice21 {
       //21.
       //将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
       //
       // 
       //
       //示例 1：
       //
       //
       //输入：l1 = [1,2,4], l2 = [1,3,4]
       //输出：[1,1,2,3,4,4]
       //
       public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
           ListNode result = new ListNode();
           ListNode tempNode = new ListNode();
           result.next = tempNode;
            while (l1 != null || l2 != null) {
                if (l1 == null) {
                    tempNode.next = l2;
                    break;
                }
                if (l2 == null) {
                    tempNode.next = l1;
                    break;
                }
                if (l1.val <= l2.val) {
                    tempNode.next = l1;
                    l1 = l1.next;
                } else if (l1.val > l2.val) {
                    tempNode.next = l2;
                    l2 = l2.next;
                }
                tempNode = tempNode.next;
            }
            return result.next;
       }
}
