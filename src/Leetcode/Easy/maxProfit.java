package Leetcode.Easy;

/**
 * @description: No：121 买卖股票的最佳时机   【难度：简单】
 * @author: KlayHu
 * 思路：dp，但是写完发现逃不掉O(n^2)，还得多练
 * ====================================================================================
 * leetcode题解：O(n^2)是暴力。
 * 一次遍历解法：在题目中，我们只要用一个变量记录一个历史最低价格 minprice，我们就可以假设自己的
 * 股票是在那天买的。那么我们在第 i 天卖出股票能得到的利润就是 prices[i] - minprice。
 * ------------------------------------------------------------------------------------
 * dp虽好，但规律需要寻找最直观的
 * @create: 2020/8/27 10:49
 **/
public class maxProfit {
    /**
     * 输入: [7,1,5,3,6,4]
     * 输出: 5
     * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出;
     * 最大利润 = 6-1 = 5 。
     * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
     */

    /**
     * 输入: [7,6,4,3,1]
     * 输出: 0
     * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
     */
    public int maxProfit(int[] prices){
        //定义最大利润和股票的最低价
        if (prices.length < 1) {
            return 0;
        }
        int max = 0, min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        int[] stockbroker = {7, 1, 5, 3, 6, 4};
        new maxProfit().maxProfit(stockbroker);
    }
}
