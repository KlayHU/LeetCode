package Leetcode.Easy;

/**
 * @description: No：160 相交链表    【难度：简单】
 * @author: KlayHu
 * 思路：需要O(n)且返回结果之后链表结构不改变，这两个限制条件pass掉直接法和合并链表的做法，递归
 * 也不能用。应该从O(n)效率的查找算法入手？相交之后长度是相同的。
 * ===================================================================================
 * leetcode题解：走完A走B，走完B再回来走A...多走几次就遇见了。
 * @create: 2020/8/19 10:31
 **/
public class getIntersectionNode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            //移动指针，第一次有可能都不相等，然后一个为空一个继续走。多走几次就遇见了，妙啊。。
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
