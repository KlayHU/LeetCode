package Leetcode.Aim4Offer;

import java.net.Socket;
import java.util.HashMap;

/**
 * @description: No：剑指Offer 18 删除链表的节点
 * @author: KlayHu
 * 思路：双指针，递归
 * =====================================================================
 * leetcode题解：双指针；递归
 * @create: 2020/9/15 20:19
 **/
public class deleteNode {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode deleteNode(ListNode head, int val) {
        if(head == null){
            return head;
        }
        if(head.val == val){
            return head.next;
        }
        //递归
        head.next = deleteNode(head.next,val);
        return head;
    }
}
