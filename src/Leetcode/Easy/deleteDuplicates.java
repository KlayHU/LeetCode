package Leetcode.Easy;

/**
 * @description: No：083 删除链表中重复的元素  【难度：简单】
 * @author: KlayHu
 * 思路：移动指针，走完一遍出结果，O(n)
 * @create: 2020/8/7 15:19
 **/
public class deleteDuplicates {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
      }
    }
    public ListNode deleteDuplicates(ListNode head){
        ListNode res = head;
        while (res != null && res.next != null) {
            if (res.val == res.next.val) {
                res.next = res.next.next;
            } else {
                //移动指针
                res = res.next;
            }
        }
        return head;
    }
}
