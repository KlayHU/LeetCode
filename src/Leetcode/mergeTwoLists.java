package Leetcode;

/**
 * @description: 21.合并两个有序链表  【难度：简单】
 * @author: KlayHu
 * @create: 2019/12/11 11:02
 **/
public class mergeTwoLists {
    static class ListNode {
        int val;    //节点的对象，即内容
        ListNode next;  //节点的引用，指向下一个节点

        ListNode(int data) {
            val = data;
        }
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists1(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists1(l1, l2.next);
            return l2;
        }
    }
}