package Leetcode.Easy;

/**
 * @description: No：058.最后一个单词的长度   【难度：简单】
 * @author: KlayHu
 * 从右往左遍历，遇到空格就返回，这样可以避免正常程序遍历时遇到空格的顺序，处理起来更简单
 * @create: 2020/7/27 15:34
 **/
public class lengthOfLastWord_058 {
    public int lengthOfLastWord(String s){
        int end = s.length()-1;     //尾指针;
        while (end >= 0 && s.charAt(end) == ' ') {
            end --;
        }
        int start = end ;   //找到最后一个不是空格的字母;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end-start;
    }
//        int result =0;
//        if (s.length()==0) {
//        return 0;
//    }
//    StringBuffer stringBuffer = new StringBuffer();
//        for (int index = 0; index < s.length(); index++) {
//        if (s.charAt(index) !=' ') {
//            stringBuffer.append(s.charAt(index));
//        } else if (s.charAt(index) == ' ') {
//            stringBuffer.delete(0, index);
//        }
//        result = stringBuffer.length();
//    }
//        System.out.println(result);
//        return result;
//}
}
