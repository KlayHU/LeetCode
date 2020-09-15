package Leetcode.Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @description: No：141 环形链表    【难度：简单】
 * @author: KlayHu
 * 思路：哈希表。把节点存到HashSet里面，如果存在重复的就跳出循环。双指针，一快一慢。这道题和136只出
 * 现一次的数字思路相仿。
 * ======================================================================================
 * 哈希没有双指针快
 * @create: 2020/8/14 16:56
 **/
public class hasCycle_141 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        Set<ListNode> hashSet = new HashSet<>();
        while (head != null) {
            if (hashSet.contains(head)) {
                return true;
            } else {
                hashSet.add(head);
            }
            //移动指针
            head = head.next;
        }
        return false;

    }
    //双指针
//    if (head == null || head.next == null) {
//        return false;
//    }
//    ListNode slow = head;
//    ListNode fast = head.next;
//    while (slow != fast) {
//        if (fast == null || fast.next == null) {
//            return false;
//        }
//        slow = slow.next;
//        fast = fast.next.next;
//    }
//    return true;
}
