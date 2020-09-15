package Leetcode.Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @description: No：202 快乐数 【难度：简单】
 * @author: KlayHu
 * 思路：有些数字会一直循环，避开循环的情况，用Set比较快吧？
 * ====================================================================================
 * leetcode题解：考察的算法和环形链表相仿，平方数可能进入循环的情况，可以使用Set和快慢指针实现。
 * @create: 2020/8/19 15:45
 **/
public class isHappy_202 {

    private int getNext(int n){
        int totalSum = 0;
        while (n > 0) {
            //每次取个位，之后要逐位相加
            int lower = n%10;
            n = n/10;   //下一位
            totalSum += lower * lower;
        }
        return totalSum;
    }


    public boolean isHappy(int n) {
        Set<Integer> hashSet = new HashSet();
        //数字循环了直接出false
        while (n != 1 && !hashSet.contains(n)) {
            hashSet.add(n);
            n = getNext(n);
        }
        return n==1;
    }
}
