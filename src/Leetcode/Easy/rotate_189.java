package Leetcode.Easy;

/**
 * @description: No：189 旋转数组    【难度：简单】
 * @author: KlayHu
 * 思路：暴力，感觉咋都不好想
 * @create: 2020/8/17 10:10
 **/
public class rotate_189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        // 第一次交换完毕后，前 k 位数字位置正确，后 n-k 位数字中最后 k 位数字顺序错误，继续交换
        for (int start = 0; start < nums.length && k != 0; n -= k, start += k, k %= n) {
            for (int i = 0; i < k; i++) {
                swap(nums, start + i, nums.length - k + i);
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        new rotate_189().rotate(arr,3);
    }
}
