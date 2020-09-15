package Leetcode.Medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: No：523 连续的子数组和 【难度：中等】
 * @author: KlayHu
 * 思路：枚举出所有数组的子数组相加后的结果，复杂度爆炸。dp，dp？
 * ====================================================================================
 * leetcode题解：官方题解 HashMap
 * 题解的规律真的能很容易就发现吗？
 * @create: 2020/8/20 17:49
 **/
public class checkSubarraySum_523 {

    /**
     * 输入：[23,2,4,6,7], k = 6
     * 输出：True
     * 解释：[2,4] 是一个大小为 2 的子数组，并且和为 6。
     */
    /**
     * 输入：[23,2,6,4,7], k = 6
     * 输出：True
     * 解释：[23,2,6,4,7]是大小为 5 的子数组，并且和为 42。
     */
    public boolean checkSubarraySum(int[] nums, int k) {
        //HashMap解法，存sum和下标
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0)
                sum = sum %k;
            if (map.containsKey(sum)) {
                //判断一定要是两个连续的元素，一个不行，题解这里很巧妙，同时处理了重复的元素
                if (i - map.get(sum) > 1)
                    return true;
            }else
                map.put(sum,i);
        }
        return false;
//        暴力法
//        for (int i = 0; i < nums.length - 1; i++) {
//            int res = nums[i];
//            for (int j = i + 1; j < nums.length; j++) {
//                res += nums[j];
//                if (res == k || (res % k == 0 && k != 0)) {
//                    return true;
//                }
//            }
//        }
    }
}
