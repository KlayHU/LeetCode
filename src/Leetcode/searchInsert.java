package Leetcode;

/**
 * @description: 39.搜索插入位置 【简单】
 * @author: KlayHu
 * @create: 2020/7/5 19:38
 **/
public class searchInsert {
    public int searchInsert1(int[] nums, int target) {
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
