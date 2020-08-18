package Leetcode;

/**
 * @description: No：198 打家劫舍    【难度：简单】
 * @author: KlayHu
 * 思路：师爷，给我讲讲，什么叫贪心算法。
 * =====================================================================================
 * leetcode题解：动态规划。状态转移方程：dp[n]=MAX(dp[n-1],dp[n-2]+num)。
 * 由于不可以在相邻的房屋闯入，所以在当前位置 n 房屋可盗窃的最大值，要么就是 n-1 房屋可盗窃的最大
 * 值，要么就是 n-2 房屋可盗窃的最大值加上当前房屋的值，二者之间取最大值
 **/
public class rob {
    public int rob(int[] nums){
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n + 1];      //从0开始的dp
        //记录dp的初始状态
        dp[0] = 0;
        dp[1] = nums[0];
        for (int index = 2; index <= n; index++) {      //这里index-1表示dp数组和nums数组下标的对应关系
            dp[index] = Math.max(dp[index - 1], dp[index - 2] + nums[index-1]);
        }
        return dp[n];
    }
}
