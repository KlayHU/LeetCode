package Leetcode.Easy;

/**
 * @description: No：038.外观数列    【难度：简单】
 * @author: KlayHu
 * @create: 2020/7/20 11:02
 **/
public class countAndSay_038 {

    /**
     * 1.     1
     * 2.     11
     * 3.     21
     * 4.     1211
     * 5.     111221
     * 第一项是数字 1
     *
     * 描述前一项，这个数是 1 即 “一个 1 ”，记作 11
     *
     * 描述前一项，这个数是 11 即 “两个 1 ” ，记作 21
     *
     * 描述前一项，这个数是 21 即 “一个 2 一个 1 ” ，记作 1211
     *
     * 描述前一项，这个数是 1211 即 “一个 1 一个 2 两个 1 ” ，记作 111221
     */

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        StringBuffer stringBuffer = new StringBuffer();
        String str = countAndSay(n - 1);
        int length = str.length();
        int a = 0;          //str的指针，从字符串第0个元素开始
        for (int i = 1; i < length + 1; i++) {
            if (i == length) {
                return stringBuffer.append(i - a).append(str.charAt(a)).toString();
            }
            //除了长度为1(1)和长度为2(11)的字符串，开始append
            else if (str.charAt(i) != str.charAt(a)) {
                stringBuffer.append(i - a).append(str.charAt(a));
                a = i; //移动指针
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        new countAndSay_038().countAndSay(8);
    }
}
//        HashMap<Integer, String> result = new HashMap<>();
//        result.put(1, "1");
//        result.put(2, "11");
//        result.put(3, "21");
//        result.put(4, "1211");
//        result.put(5, "111221");
//        result.put(6, "312211");
//        result.put(7, "13112221");
//        result.put(8, "1113213211");
//        result.put(8, "1113213211");
//        result.put(9, "31131211131221");
//        result.put(10, "13211311123113112211");
//        System.out.println(result.get(n));
//        return result.get(n);
