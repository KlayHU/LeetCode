package Leetcode.Medium;

/**
 * @description: No：012 整数转罗马数字 【难度：中等】
 * 思路：先把给定的数字和对应的罗马数字及其特殊情况存到HashMap里面。然后拿到传进来的num，依次从
 * 个位、十位、百位进行取余运算，每算完一位就用StringBuffer append一位，最后判定完所有条件之后
 * return，时间复杂度O(1)
 * ====================================================================================
 * leetcode题解思路： 把阿拉伯数字与罗马数字可能出现的所有情况和对应关系，放在两个数组中并且按照
 * 阿拉伯数字的大小降序排列，这是贪心选择思想
 * @author: KlayHu
 * @create: 2020/8/4 17:21
 **/
public class intToRoman {
    public String intToRoman(int num){
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        while (index < 13) {
            // 特别注意：这里是等号
            while (num >= nums[index]) {
                // 注意：这里是等于号，表示尽量使用大的"面值"
                //这样可以巧妙避开进一步判断所需要的append的数值
                stringBuilder.append(romans[index]);
                num -= nums[index];
            }
            index++;
        }
        //System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        new intToRoman().intToRoman(1234);
    }
}
