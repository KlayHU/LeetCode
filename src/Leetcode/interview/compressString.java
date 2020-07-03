package Leetcode.interview;

/**
 * @description: 面试题01.06 字符串压缩 难度【简单】
 * 双指针
 * @author: KlayHu
 * @create: 2020/7/3 9:59
 **/
public class compressString {
    public String compressString1(String S) {
        int i = 0;
        int N = S.length();
        StringBuilder stringBuilder = new StringBuilder();
        while (i < N) {
            int j = i;
            while (j < N && S.charAt(j) == S.charAt(i)) {
                j++;
            }
            stringBuilder.append(S.charAt(i));
            stringBuilder.append(j - i);
            i = j;
        }
        String result = stringBuilder.toString();
        if (result.length() < S.length()) {
            return result;
        } else {
            return S;
        }
    }
}