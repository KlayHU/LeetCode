package Leetcode.EverydayQuest;

/**
 * @description: 每日一题，【面试题】 数组中数字出现的次数。要求时间复杂度O(n),空间复杂度O(1)
 *【难度】：中等
 * @author: KlayHu
 * @create: 2020/4/28 21:55
 **/
public class singleNumbers {
    public int[] singleNumbers(int[] nums) {

        //用于将所有的数异或起来
        int k = 0;

        for (int num : nums) {
            k ^= num;
        }

        //获得k中最低位的1
        int mask = 1;

        //mask = k & (-k)
        while ((k & mask) == 0) {
            mask <<= 1;
        }

        int a = 0;
        int b = 0;

        for (int num : nums) {
            if ((num & mask) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}