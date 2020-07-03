package HigherAlgorithm;

/**
 * @description: 递归算法
 * @author: KlayHu
 * @create: 2020/4/14 21:16
 **/
public class Factorial {
    public static void main(String[] args) {
        long result = factorial(6);
        System.out.println("递归计算阶乘结果为：" + result);
    }

    //求N的阶乘
    private static long factorial(int N) {
        if (N == 1) {
            return 1;
        }
        return N * factorial(N - 1);
    }
}
