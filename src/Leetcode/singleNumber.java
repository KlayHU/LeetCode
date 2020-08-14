package Leetcode;


/**
 * @description: No：136 只出现一次的数字    【难度：简单】
 * @author: KlayHu
 * 思路；和括号匹配思路差不多，入栈出栈。或者二分查找？HashSet？
 * 题解：异或， a^b^a^b^c = c
 * @create: 2020/8/14 14:50
 **/
public class singleNumber {
    public int singleNumber(int[] nums){
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
//        Stack stack = new Stack();
//        for (int index = 0; index < nums.length;index++) {
//            stack.push(nums[index]);
//            if (stack.contains(nums[index])) {
//                stack.remove(nums[index]);
//            }
//        }
//        System.out.println((int)stack.firstElement());
//        return (int) stack.firstElement();
//    }
}
