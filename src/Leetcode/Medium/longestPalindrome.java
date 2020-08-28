package Leetcode.Medium;

/**
 * @description: No：5 最长回文子串    【难度：中等】
 * @author: KlayHu
 * 思路：双指针。提前看标签发现是dp的题型，dp还能处理字符串？？dp思想是找状态转移方程，这个字符
 * 串的话怎么找？只ac了30%，感觉双指针一遍没法找到答案，要回溯吗？
 * ====================================================================================
 * leetcode题解：中心扩展算法的思想使用到双指针。
 * 我们枚举所有的「回文中心」并尝试「扩展」，直到无法扩展为止，此时的回文串长度即为此「回文中心」
 * 下的最长回文串长度。我们对所有的长度求出最大值，即可得到最终的答案。
 * 思路比较接近中心扩展，要用双指针的话必须往中心扩展那边靠，不然边界条件能嵌套好多if还容易错
 * @create: 2020/8/28 9:47
 **/
public class longestPalindrome {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        //初始化最大回文子串的起点和终点
        int start = 0, end = 0;
        //遍历每个位置，当做中心位
        for (int i = 0; i < s.length(); i++) {
            //分别拿到奇数偶数的回文子串长度(奇、偶)
            int len_odd = expandAroundCenter(s, i, i);
            int len_even = expandAroundCenter(s, i, i + 1);

            // 对比最大的长度
            int len = Math.max(len_odd,len_even);
            // 计算对应最大回文子串的起点和终点
            if (len > end - start){
                start = i - (len - 1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
//        int head = 0;
//        int tail = s.length()-1;
//        String res = "";
//        while (head < tail) {
//
//            if (s.charAt(head) != s.charAt(tail)) {
//                --tail;
//                ++head;
//                if (s.charAt(tail) == s.charAt(tail+1)) {
//                    res = s.substring(tail, tail + 2);
//                }
//                if (head == tail) {
//                    return res;
//                }
//            }else {
//                res = s.substring(head, tail+1);
//                --tail;
//                ++head;
//            }
//        }
//        System.out.println(res);
//        return res;

    public static void main(String[] args) {
        String str = "abcdcba";
        new longestPalindrome().longestPalindrome(str);
    }
}
