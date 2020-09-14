package Leetcode.Aim4Offer;

/**
 * @description: No：剑指Offer 42 连续子数组的最大和   【难度：简单】
 * @author: KlayHu
 * 思路：动态规划，A了(动态规划往往用于优化递归问题)
 * ================================================================
 * @create: 2020/8/20 17:35
 **/
public class maxSubArray {

    /**
     * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * 输出: 6
     * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
     */
    public int maxSubArray(int[] nums){
        int result = nums[0];
        int sum =0;
        for(int num : nums){
            if(sum>0){
                sum += num;
            }else{
                sum =num;
            }
            //就算一列数组都是负数，直接返回nums[0]，不影响相加的判断
            result = Math.max(result,sum);
        }
        return result;
    }
}
