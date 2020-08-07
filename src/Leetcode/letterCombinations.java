package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: No：017.数字电话号码组合    【难度：中等】
 * 思路：把数字和字母存到HashMap里，对于输入的字符串逐个解析（回溯比较巧妙）
 * leetcode题解：回溯算法是一种通过穷举所有可能情况来找到所有解的算法。如果一个候选解最后被发现并不
 * 是可行解，回溯算法会舍弃它，并在前面的一些步骤做出一些修改，并重新尝试找到可行解。
 * 作者：LeetCode
 * 链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/solution/dian-hua-hao-ma-de-zi-mu-zu-he-by-leetcode/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * leetcode题解：
 * @author: KlayHu
 * @create: 2020/8/5 11:34
 **/
public class letterCombinations {
    //把电话号码存入map
    Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    //存放结果集
    List<String> res = new ArrayList<>();
    //回溯方法体
    public void backtrack(String combination, String next_digits) {
        // if there is no more digits to check
        if (next_digits.length() == 0) {
            // 组合已经完全穷举
            res.add(combination);
        }
        // 如果还有字母组合没有穷举完
        else {
            // iterate over all letters which map
            // the next available digit
            String digit = next_digits.substring(0, 1);
            String letters = phone.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                String letter = phone.get(digit).substring(i, i + 1);
                // append the current letter to the combination
                // and proceed to the next digits
                //递归
                backtrack(combination + letter, next_digits.substring(1));
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() != 0){
            backtrack("", digits);
        }
        System.out.println(res.toString());
        return res;
    }

    public static void main(String[] args) {
        new letterCombinations().letterCombinations("23");

    }
}