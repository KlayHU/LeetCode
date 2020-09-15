package Leetcode.Easy;

/**
 * @description: No：203 移除链表元素    【难度：简单】 删除所有元素为val的结点
 * @author: KlayHu
 * 思路：直接法，O(n)，注意头指针需要被删除的情况，其余操作指针就行。
 * =====================================================================================
 * leetcode题解：定义多个指针，应对不同情况。一、sentinel哨兵指针：应对头结点需要被删除的情况
 * 二、cur指针：表示当前指针所在位置，与head对上；三、pre指针：前一个节点如果被删除，判断下一个
 * 节点元素是否也需要被删除；
 * @create: 2020/8/24 15:14
 **/
public class removeElements_203 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode removeElements(ListNode head, int val){
        //自定义哨兵指针，新加个节点放在头节点之前就行
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        //定义pre和cur指针一个是当前指针的上一个节点，一个是当前（head）节点指针
        ListNode pre = sentinel , cur = head;
        //开始遍历链表
        while (cur != null) {
            if (cur.val == val) {
                //头节点需要被删除，直接让pre指针的下一个节点指向头节点的下一个节点
                //跳过这个要被删除的结点
                pre.next = cur.next;
            } else {
                //头结点不需要被删除,所以不存在pre的前置节点，直接让pre跟头节点对齐
                //同时把之前删掉的覆盖
                pre = cur;
            }
            cur = cur.next;
        }
        return sentinel.next;
    }
}
