package Leetcode.Interview;

/**
 * @description: No：面试题 16.17 连续数列
 * @author: KlayHu
 * 思路：dp。找最大值，ac
 * ====================================================================================
 * leetcode题解：分治复杂度O(nlogn)
 * @create: 2020/8/28 17:22
 **/
public class maxSubArray {
    /**
     * 输入： [-2,1,-3,4,-1,2,1,-5,4]
     * 输出： 6
     * 解释： 连续子数组 [4,-1,2,1] 的和最大，为 6。
     */
    public int maxSubArray(int[] nums){
        int [] dp = new int[nums.length];
        int max =  nums[0];
        dp[0] = nums[0];
        for(int i = 1;i < nums.length;i ++){
            dp[i] = Math.max(dp[i - 1] + nums[i],nums[i]);
            max = Math.max(max , dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        new maxSubArray().maxSubArray(arr);
    }
}
