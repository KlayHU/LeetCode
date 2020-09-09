package Leetcode.Interview;

/**
 * @description: 乐信笔试 字符串距离
 * @author: KlayHu
 * 思路：先在字符串找到第一次出现字符索引的下标，然后分割字符串，
 * @create: 2020/9/8 20:51
 **/
public class findShortestIndex {
    public int[] target(String str, char ch) {
        if (null == str || 0 == str.length()) {
            return null;
        }
        int N = str.length();
        int[] ans = new int[N];
        int prev = Integer.MIN_VALUE / 2;
        for (int i = 0; i < N; ++i) {
            if (str.charAt(i) == ch) prev = i;
            ans[i] = i - prev;
        }
        //正着遍历一遍，倒着遍历一遍的时候取个最小值就行了
        prev = Integer.MAX_VALUE / 2;
        for (int i = N-1; i >= 0; --i) {
            if (str.charAt(i) == ch) prev = i;
            ans[i] = Math.min(ans[i], prev - i);
        }
        return ans;
    }
}

