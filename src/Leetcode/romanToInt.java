package Leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: No：013.罗马数字转整数   【难度：简单】
 * @author: KlayHu
 * @create: 2019/12/8 18:10
 **/
public class romanToInt {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int sup = map.get(s.charAt(i));
            int sub = i < s.length() - 1 ? map.get(s.charAt(i + 1)) : 0;        //检查这里是不是倒数第二个罗马数字，若不是就往前推一个索引进行赋值，再进一步比较大小；若是直接赋0处理。
            result += sub > sup ? -sup : sup;
            //这里，所有情况均考虑在内了， 
            // C 可以放在 D (500)和 M (1000)的左边，来表示400和900。
            // 表I 可以放在 V (5)和 X (10) 的左边，来表示4和9。
            //            // X 可以放在 L (50) 和 C (100) 的左边，来示40和90。
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("请输入一段将要转换的罗马数字：");
        romanToInt("IVV");
    }
}
