package Leetcode.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * @description: No：234 回文链表    【难度：简单】
 * @author: KlayHu
 * 思路：使用额外空间的话比较好想，但是题目希望时间复杂度为O(1)，又是原地判断？
 * 双指针，需要复制到数组中，也需要额外空间
 * ======================================================================================================
 * leetcode题解：递归O(n)，改变输入O(1)，递归解法：frontPointer指向链表头。递归先到链表为尾，然后跟链表头去比。
 * @create: 2020/9/13 10:44
 **/
public class isPalindromeList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    private ListNode frontPointer;

    private boolean recursivelyCheck(ListNode currentNode) {
        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next)) return false;
            if (currentNode.val != frontPointer.val) return false;
            frontPointer = frontPointer.next;
        }
        return true;
    }

    public boolean isPalindrome(ListNode head) {
        frontPointer = head;
        return recursivelyCheck(head);
    }

}
