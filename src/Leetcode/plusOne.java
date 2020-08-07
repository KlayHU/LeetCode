package Leetcode;

import java.util.Arrays;

/**
 * @description: No：066.加一  【难度：简单】
 * @author: KlayHu
 * 思路：遍历数组。列出所有可能出现的情况归纳一下进行处理，不要嵌套太多if，之前的思路中判断数组
 * 元素并进行扩容，复杂度达到了O(n^2)，尽量考虑简化的写法，巧妙直观地将规律进行代码转换。
 * @create: 2020/7/28 15:17
 **/
public class plusOne {
    public int[] plusOne(int[] digits){
        int length=digits.length;
        for (int i = length-1; i >= 0; i--) {
            //非进位情况
            digits[i]+=1;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        //进位情况
        digits = new int[length+1];
        digits[0]=1;
        //System.out.println(Arrays.toString(digits));
        return digits;
//        for (int index =digits.length-1;index>=0; index--) {
//            if (digits[index] + 1 == 10) {
//                digits[index]=0;
//                digits[index-1]+=1;
//                for (int tmp = index-1; tmp >= 0; tmp--) {
//                    if (digits[tmp]==10) {
//                        digits[tmp]=0;
//                        digits[tmp - 1] += 1;
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(Arrays.toString(digits));
//        return digits;
    }

    public static void main(String[] args) {
        int[] arr = {9};
        new plusOne().plusOne(arr);
    }
}
