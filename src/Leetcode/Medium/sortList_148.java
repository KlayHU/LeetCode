package Leetcode.Medium;

/**
 * @description: No：148 排序链表    【难度：中等】
 * @author: KlayHu
 * 思路：尽量还是不要往暴力的方向去想、。
 * =====================================================================================================
 * leetcode题解：双指针+递归。两个指针一快一慢用来寻找链表的中间节点。慢的依次走一个节点，快的走两个，快的走完，慢的
 * 刚好在中间。
 * @create: 2020/9/14 17:01
 **/
public class sortList_148 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next==null) {
            return head;
        }
        //定义快慢指针
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //slow走到链表中间节点（偶数个就是中间左边的节点），tmp是分割后的小链表的尾
        ListNode tmp = slow.next;
        //分割链表
        slow.next = null;
        //左节点依然是链表头，右节点是tmp
        //递归分到最小
        ListNode left = sortList(head);
        ListNode right = sortList(tmp);
        //新创建的链表用于存储结果
        ListNode h = new ListNode(0);
        ListNode res = h;
        while (left != null && right != null) {
            //排序
            if (left.val < right.val) {
                h.next = left;
                //移动链表，继续比较
                right = right.next;
            } else {
                //从小到大
                h.next = right;
                right = right.next;
            }
            //移动，存新的节点
            h = h.next;
        }
        //h走完之后判断顺序
        h.next = left != null ? left : right;
        return res;
    }
}
