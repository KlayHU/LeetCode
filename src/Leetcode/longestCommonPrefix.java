package Leetcode;

/**
 * @description: No：014.最长公共前缀   【难度：简单】
 * @author: KlayHu
 * @create: 2019/12/9 10:03
 **/
public class longestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) {
                return "";
            }
            String str = strs[0];
            for (int i = 1; i < strs.length; i++) {
                while (strs[i].indexOf(str) != 0) {       //判断是不是一样的元素
                    str = str.substring(0, str.length() - 1);     //返回元素最长前缀
                }
            }
            return str;
        }
    }
}