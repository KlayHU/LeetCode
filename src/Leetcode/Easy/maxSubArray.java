package Leetcode.Easy;

import java.util.HashMap;

/**
 * @description: No：053.最大子序和 【难度：简单】
 * @author: KlayHu
 * 思路：移动指针先找到第一个正数，记录下下标然后开始计算到下一个正数的和，记录结果；
 * 继续移动指针，重复上述的操作直到最后一个正数。如何才能实现O(n)呢
 * ------------------------------------------------------------------------
 * leetcode题解：上述大体思路通过动态规划实现
 * @create: 2020/7/27 11:11
 **/
public class maxSubArray {
    //dp。对于不需要的数无需做记录，只记录当前需要的结果
    public int maxSubArray(int[] nums){
        int result = nums[0];      //数组指针
        int sum = 0;            //子序和(从正数开始，故初值赋0)
        for (int num : nums) {
            if (sum > 0) {
                sum += num;     //求和
            } else {
                sum = num; //当前指针所指元素给sum（就是从第一项开始）
            }
            //通过每次移动指针，返回最大子序和
            result = Math.max(result, sum);
        }
        return result;
    }
//        int index; //起始位置的指针
//        int length = nums.length;
//        int sum = 0,tmp = 0;
//        HashMap hashmap = new HashMap<>();
//        for (index = 0; index < length-1; index++) {
//            if (nums[index] > 0) {
//                //拿到第一个正数
//            }
//        }
//        return 1;
//    }
}