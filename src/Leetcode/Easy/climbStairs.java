package Leetcode.Easy;

/**
 * @description: No：070.爬楼梯 【难度：简单】
 * @author: KlayHu
 * 思路：题解区图解算法，dp秒，要看出来数列之间的关系（fibonacci数列）
 * @create: 2020/7/29 15:08
 **/
public class climbStairs {

    /**
     * 输入：2                              输入：3
     * 输出：2                              输出：3
     * 解释：有两种方法可以爬到楼顶           解释：有三种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶
     * 2.  2 阶
     */

    public int climbStairs(int n){
        int[] dp = new int[n+1];        //这里n+1表示比fibonacci数列多一位，下标从0开始
        dp[0] = 1;
        dp[1]=1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
