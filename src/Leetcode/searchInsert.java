package Leetcode;

/**
 * @description: No：39.搜索插入位置 【难度：简单】
 * @author: KlayHu
 * @create: 2020/7/5 19:38
 **/
public class searchInsert {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
