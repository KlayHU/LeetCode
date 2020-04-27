package Leetcode;

import java.util.Arrays;
/**
 * @description:
 * @author: KlayHu
 * @create: 2020/4/26 23:10
 **/
public class removeDuplicates {
    public int removeDuplicates1(int[] nums) {
        //双指针
        int result = 0;
        int fast;
        for (fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[result]) {
                result++;
                nums[result]=nums[fast];
            }
        }
        return result+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        removeDuplicates removeDuplicates = new removeDuplicates();
        removeDuplicates.removeDuplicates1(arr);
        System.out.println(Arrays.toString(arr));
    }
}