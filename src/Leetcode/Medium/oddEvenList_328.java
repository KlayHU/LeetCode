package Leetcode.Medium;

/**
 * @description: No：328 奇偶链表    【难度：中等】
 * @author: KlayHu
 * 思路：双指针odd和even。
 * @create: 2020/9/9 0:08
 **/
public class oddEvenList_328 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode oddEvenList(ListNode head){
        if (head.next == null) {
            return null;
        }
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            //1 - > 2 - > 3
            odd.next = even.next;
            //(odd)1 - > 3
            odd = odd.next;
            //1 - > 2 - > 4
            even.next = odd.next;
            //(even)2 - > 4
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
