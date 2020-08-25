package Leetcode.EverydayQuest;

/**
 * @description: No：459 每日一题 08.24 重复的子字符串  【难度：简单】
 * @author: KlayHu
 * 思路：第一反应感觉跟递归有关系，结果递归没做出来，找不到适合结束循环的条件，经常堆栈溢出。
 *
 * =================================================================================
 * leetcode题解：枚举、KMP基本这两种方式。KMP没有注释真的不想去看，之后简单难度的遇到这种了
 * 就枚举吧。枚举O(n^2)。评论区有些跟substring解法，跟枚举差不多；
 * @create: 2020/8/24 16:56
 **/
public class repeatedSubstringPattern {

    /**
     * 输入: "abab"
     * 输出: True
     * 解释: 可由子字符串 "ab" 重复两次构成。
     */

    /**
     * 输入: "aba"
     * 输出: False
     */

    public boolean repeatedSubstringPattern(String s){
        //枚举
        for (int index = 1; 2 * index <= s.length(); index++) {
            if (s.length() % index == 0) {
                boolean flag = true;
                for (int j = index; j < s.length(); j++) {
                    //还是找相同的元素，
                    if (s.charAt(j) != s.charAt(j - index)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }
//    public boolean repeatedSubstringPattern(String s){
//        int index;
//        String res="";
//        for (index =1;index < s.length(); index++) {
//            char flag = s.charAt(0);
//            if (flag == s.charAt(index)) {
//                res = s.substring(index);
//                break;
//            }
//        }
//        String substring = s.substring(0, index-1);
//
//        repeatedSubstringPattern(res);
//        System.out.println(res.equals(substring));
//        return res.equals(substring);
//    }


    public static void main(String[] args) {
        new repeatedSubstringPattern().repeatedSubstringPattern("abcabcabc");
    }
}
