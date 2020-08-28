package Leetcode.Easy;

/**
 * @description: No：206 反转链表    【难度：简单】
 * @author: KlayHu
 * 思路：排序思想可以解决。反转前后元素至少需要三个指针，就像是交换需要排序的数组下标元素值一样，
 * cur指针指向当前元素。tmp指针表示临时指针，用作存储元素，pre指针表示交换后的位置，也就是新的
 * 链表头，所以一开始就是null。
 * ====================================================================================
 * leetcode题解：思路属于迭代，还有一种递归方法，不好想，容易错
 * @create: 2020/8/27 10:07
 **/
public class reverseList {
    public mergeTwoLists.ListNode reverseList(mergeTwoLists.ListNode head){
        //两个全局变量指针，一个临时指针定义在循环结构里面
        mergeTwoLists.ListNode cur = head;
        mergeTwoLists.ListNode pre = null;
        while (cur.next != null) {
            //tmp指针先走，找到cur的下一个，存下来。
            mergeTwoLists.ListNode tmp = cur.next;
            //先将头指针的下一位置为null
            cur.next = pre;
            //这一步让cur指向pre，完成2->1->null
            pre = cur;
            //移动指针
            cur = tmp;
        }
        return pre;
    }
}
