package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


/**
 * @description: No：20.有效的括号  【难度：简单】
 * @author: KlayHu
 * @create: 2019/12/10 11:21
 **/
public class isValid {

    public boolean isValid1(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        if (c.length % 2 != 0) {
            System.out.println("错误!");
            return false;
        }
        for (char a : c) {
            if (a == '(' || a == '[' || a == '{') {
                stack.push(a);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("错误!");
                    return false;
                }
                if (stack.pop() != map.get(a)) {       //如果删除的对象和这一个字符不一样，返回错误结果
                    System.out.println("错误!");
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("测试用例通过!");
            return true;
        } else {
            System.out.println("错误!");
            return false;

        }
    }

    public static void main(String[] args) {
        isValid isvalid = new isValid();
        isvalid.isValid1("(){}[[()[]]]");
    }
}
