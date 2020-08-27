package Leetcode.Interview;

/**
 * @description: No：面试题08.01 三步问题   【难度：简单】
 * @author: KlayHu
 * 思路：找dp规律
 * ====================================================================================
 * leetcode题解：%1000000007卡住
 * @create: 2020/8/27 14:25
 **/
public class waysToStep {
    public int waysToStep(int n) {
        if (n <=2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        for (int i = 4; i < n + 1; i++) {
            dp[i] =(dp[i - 1] +( dp[i - 2] + dp[i - 3])%1000000007)%1000000007;
        }
        //System.out.println(dp[n]);
        return dp[n];
    }

    public static void main(String[] args) {
        new waysToStep().waysToStep(5);
    }
}
