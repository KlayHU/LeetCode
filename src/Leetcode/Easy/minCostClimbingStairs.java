package Leetcode.Easy;

/**
 * @description: No：746 使用最小花费爬楼梯   【难度：简单】
 * @author: KlayHu
 * 思路：最短路径=当前路径+起点最小值
 * ====================================================================================
 * leetcode题解：题解区的代码。很巧妙，直接相加，总有最小的。最小的一定出现在最后
 * @create: 2020/8/27 15:49
 **/
public class minCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i <cost.length; i++) {
            //改变数组结构，一遍遍历下标元素直接存新结果返回
            cost[i] = Math.min(cost[i - 2], cost[i - 1]) + cost[i];
        }
        //最短路径肯定存在于最后两个元素之间
        return Math.min(cost[cost.length - 2], cost[cost.length - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {1,100,1,1,1,100,1,1,100,1};
        new minCostClimbingStairs().minCostClimbingStairs(arr);
    }
}
