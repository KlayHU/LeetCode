package Leetcode;

/**
 * @description: No：067.二进制求和   【难度：简单】
 * @author: KlayHu
 * @deprecate 思路：十进制转二进制，然后求和 （这种思路和算法就没有关系了。java提供了高
 * 精度转化的api）
 * =============================================================================
 * 题解思路：从后向前遍历字符串，进行位运算，通过StringBuffer对象进行append实现拼接。
 * @create: 2020/7/29 9:31
 **/
public class addBinary {
    public String addBinary(String a , String b) {
        int upper=0;      //进位
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum =upper;    //求和
            sum+=i>=0?a.charAt(i)-'0':0;        //进行位运算，同时判断如果字符串长度不相同的情况，防止越界；
            sum+=j>=0?b.charAt(j)-'0':0;
            stringBuilder.append(sum%2);    //将求得的值进行拼接。之后还需要进行一次反转操作
            upper=sum/2;   //进位情况，1进位，0不用管
        }
        stringBuilder.append(upper == 1 ? upper : "");
        System.out.println(stringBuilder.reverse().toString());
        return stringBuilder.reverse().toString();
    }
}
