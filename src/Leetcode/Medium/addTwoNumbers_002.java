package Leetcode.Medium;

/**
 * @description: No：002 两数相加    【难度：中等】
 * @author: KlayHu
 * 思路：想法跑偏，这部分类型题需要多做练习。
 * =====================================================================================
 * leetcode题解：没有特别的方法，就题论题，逐个相加，但是有几个需要注意到的地方：1、进位如何处理；
 * 2、链表不对称时补0如何处理；3、头指针空间问题。
 * @create: 2020/8/17 17:33
 **/
public class addTwoNumbers_002 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode pre = new ListNode(0);     //定义预指针，给移动指针留下余地
        ListNode cur = pre;     //定义和与指针起点相同的当前指针

        int carry = 0;      //进位标志位，不管顺序，只管相加。所以不考虑这是百位千位还是其他位
        while (l1 != null || l2 != null) {
            //表达式体现出不对称补0的情况
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            int sum = a+b+carry;
            carry = sum/10;     //不足进位不管，进位置为1
            sum = sum%10;   //(实际存入链表)。只进行两两相加，每一位只存0-9，进位的交给carry处理

            //新建节点,把两个链表同一位的sum放到新节点
            cur.next = new ListNode(sum);
            cur = cur.next;

            //移动l1、l2指针
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if (carry == 1) {
            //进位情况，在最前面加上val为carry的结点
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(8);
        l1.next = new ListNode(9);
        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(2);
        new addTwoNumbers_002().addTwoNumbers(l1, l2);
    }
}
