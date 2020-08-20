package Leetcode.EverydayQuest;

/**
 * @description: 每日一题：给定一个正整数 n，将其拆分为至少两个正整数的和，并使
 * 这些整数的乘积最大化。 返回你可以获得的最大乘积。    【难度：中等】
 * @author: KlayHu
 * 思路：（初）我觉得遇到这种需要拆数字/字符串的应该是要用dp。
 * dp首先得写状态转移方程
 * @create: 2020/7/30 16:57
 **/
public class integerBreak {
    //dp[i]表示将正整数i拆分成至少两个正整数的和之后，这些正整数的最大乘积。
    public int integerBreak(int n) {
        //情况①：将i拆分成j和i−j的和，且i-j不再拆分成多个正整数，此时的乘积是j*(i-j)
        //情况②：将i拆分成j和i-j的和，且i-j继续拆分成多个正整数，此时的乘积是j*dp[i-j] //再继续拆分
        int[] dp = new int[n + 1];      //多一位，下标为0无意义
        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }
}