package Leetcode.Aim4Offer;

/**
 * @description: No：剑指Offer 17 打印从1到最大的n位数 【难度：简单】
 * @author: KlayHu
 * 思路：n的个数就是0的个数，在大数上-1输出
 * ============================================================================================================
 * leetcode题解：pow
 * @create: 2020/9/13 22:52
 **/
public class printNumbers {
    public int[] printNumbers(int n) {
        int last = (int) Math.pow(10, n)-1;
        int[] res = new int[last];
        for (int i = 0; i < last; ++i) {
            res[i] = i+1;
        }
        return res;
    }
}
