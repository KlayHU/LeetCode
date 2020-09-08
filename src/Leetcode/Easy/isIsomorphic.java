package Leetcode.Easy;

import com.sun.scenario.effect.SepiaTone;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @description: No：205 同构字符串   【难度：简单】
 * @author: KlayHu
 * 思路：存到Map里，如果遇到重复出现的字符就给出现次数+1，然后取出来进行比较，
 * 如果次数相同就找字符出现的相应位置，太复杂最少的时间复杂度都在O(NMlogNM)，
 * 有什么比较好的解法？
 * ===================================================================
 * leetcode题解：评论区有个HashMap的解法，KV放的是两个Character。比较的时候
 * 免去了按照顺序进行的比较操作。常规解法
 * @create: 2020/9/7 13:29
 **/
public class isIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> res = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            //因为K是s字符串的字符，V是t字符串的字符，所以首先往Map里面添加元素
            if (!res.containsKey(s.charAt(i))) {
                //这样的对应关系直接顺序比较，不一样就false
                if (res.containsValue(t.charAt(i))) {
                    return false;
                }
                res.put(s.charAt(i), t.charAt(i));
            }
            //存进去之后对不上就false
            if (res.get(s.charAt(i))!=t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
