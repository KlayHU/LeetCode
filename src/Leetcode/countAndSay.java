package Leetcode;

/**
 * @description: No：038.外观数列    【难度：简单】
 * @author: KlayHu
 * @create: 2020/7/20 11:02
 **/
public class countAndSay {
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
        new countAndSay().countAndSay(8);
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
