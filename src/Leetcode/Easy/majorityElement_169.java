package Leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: No：169 多数元素    【难度：简单】
 * @author: KlayHu
 * 思路：HashMap的k记录次数，v记录元素。没有做出来
 * ====================================================================================
 * leetcode题解：一、哈希表。k存元素，v存次数。维护最大的值，避免再遍历哈希表
 * @create: 2020/8/19 11:34
 **/
public class majorityElement_169 {

    private Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            //依次把数组元素赋给num，然后put进去
            if (!count.containsKey(num)) {
                count.put(num, 1);
            }else {
                count.put(num, count.get(num) + 1);
            }
        }
        return count;
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = countNums(nums);
        Map.Entry<Integer,Integer> integerEntry = null;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            //只要最大的，避免再次遍历哈希表
            if (integerEntry == null || entry.getValue() > integerEntry.getValue()) {
                integerEntry = entry;
            }
        }
        return integerEntry.getKey();
    }
}
