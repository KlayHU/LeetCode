package Leetcode.Aim4Offer;

/**
 * @description: No：剑指Offer 24 反转链表 【难度：简单】
 * @author: KlayHu
 * 思路：
 * ================================================================================================
 * leetcode题解：
 * @create: 2020/9/20 18:18
 **/
public class reverseList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public ListNode reverseList(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = reverseList(head.next);
        //5(head.next) (指向(next)) -> 4(head)
        head.next.next = head;
        //原来的链表还存在4 -> 5的情况，链表有环，索引把4 -> 5断开
        head.next = null;
        return cur;
    }
}
