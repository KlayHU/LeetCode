package Leetcode.everydayQuest;

/**
 * @description: 每日一题：旋转数组中的查找，要求：时间复杂度O(log(n)) 【难度】：中等
 * 用二分查找，暴力超时了
 * @author: KlayHu
 * @create: 2020/4/27 17:44
 **/
public class search {
    public int search1(int[] nums, int target) {

        if (nums.length == 0 || nums == null) {
            return -1;
        }
        //下标
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end + start) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (nums[start] <= nums[mid]) {
                //target落在前半段
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;//新end，分割
                } //在后半段去找
                else {
                    start = mid + 1;
                }
            } else {
                //target落在后半段
                if (target <= nums[end] && target > nums[mid]) {
                    start = mid + 1;
                } //在前半段再去找
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
