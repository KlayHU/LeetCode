package Leetcode.Easy;

/**
 * @description: No：461 汉明距离
 * @author: KlayHu
 * 思路：异或，出现进制一般先考虑位运算解法
 * ============================================================================================================
 * leetcode：异或，然后&1，移位相加出距离
 * @create: 2020/9/14 19:26
 **/
public class hammingDistance_461 {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int sum = 0;
        while (z!=0){
            sum += z & 1;
            z = z>>1;
        }
        return sum;
    }
}
