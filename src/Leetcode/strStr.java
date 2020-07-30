package Leetcode;

/**
 * @description: No：28.实现strStr() 【难度：简单】
 * @author: KlayHu
 * @create: 2020/7/9 17:07
 **/
public class strStr {
    public int strStr(String haystack, String needle) {
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
}
