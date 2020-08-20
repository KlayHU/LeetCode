package Leetcode.Easy;

/**
 * @description: No：009.判断回文数  【难度：简单】
 * @author: KlayHu
 * @create: 2019/12/8 16:17
 **/
public class isPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int div = 1;                //定义一个关卡，用来x找最大位数上的数字
        while (x / div >= 10) {         //如果没有算到x的个位就继续算
            div *= 10;
        }
        while (x > 1) {             //div卡在x最大位数上
            int left = x / div;         //再次计一定是个位，所以拿来做对比
            int right = x % 10;
            if (left != right) {
                System.out.println("false");
                return false;
            } else {
                x = (x % div) / 10;         //如果存在其他情况，掐头去尾，把x最高位和最低位去掉
                div /= 100;                     //重置关卡，和x位数一样大，进一步运算
            }
        }
        System.out.println("true");
        return true;
    }

    public static void main(String[] args) {
        isPalindrome i = new isPalindrome();
        i.isPalindrome(112211);
    }
}
