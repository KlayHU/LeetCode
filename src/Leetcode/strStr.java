package Leetcode;

/**
 * @description: 28.实现strStr() 【简单】
 * @author: KlayHu
 * @create: 2020/7/9 17:07
 **/
public class strStr {
    public int strStr1(String haystack, String needle) {
        if (haystack == null ) {
                return -1;
        } else if (haystack.equals("") || needle.equals("")) {
            return 0;
        }

        for (int i = 0; i <haystack.length(); ++i) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "ba";
        String s2 = "aaaa";
        new strStr().strStr1(s1, s2);
    }
}
