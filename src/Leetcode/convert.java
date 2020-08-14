package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: No：006.Z字形变换    【难度：中等】
 * @author: KlayHu
 * 思路：创建一个二维数组，将字符串按照Z字形存进去，输出新的字符串通过正常的遍历得到
 * =============================================================================
 * 题解：思想相同，把每一列元素看做一个StringBuilder对象，遍历后append。时空复杂度低，
 * 而且不用考虑列的大小问题，绕开了二维数组的难题。
 * @create: 2020/7/30 11:29
 **/
public class convert {
    public String convert(String s, int numRows) {
        if(numRows < 2) return s;
        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++){
            rows.add(new StringBuilder());
        }
        int i = 0, flag = -1;
        for(char c : s.toCharArray()) {
            rows.get(i).append(c);
            if(i == 0 || i == numRows -1    /* 换行，找规律可以发现 */) {
                flag = - flag;
            }
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder row : rows) res.append(row);
        return res.toString();
    }
}
//        int firstRow;      //从第一行开始
//        int column=s.length()-1; //列
//        if (s.length() < 1) {
//            return s;
//        }
//        char[][] all = new char[numRows][column];
//        for (firstRow = 0,column=0; firstRow < numRows-1; firstRow++) {
//            all[firstRow][column] = s.charAt(0);
//        }
//        numRows-=1;
//        int flag;   //标志位
//        for (flag=0; flag < numRows - 1; flag++) {
//            if (flag<numRows-1) {
//                numRows-=1;
//                column+=1;
//                all[numRows][column] = s.charAt(numRows+1);
//                column++;
//            }
//        }
// 哭了，问题出哪找不到，题解区一看，用二维数组的费时又费力。。。。。。。
//        convert(s.substring(numRows+flag,s.length()-1),numRows);
//        System.out.println(Arrays.toString(all));
//            return Arrays.toString(all);
//    }
//
//    public static void main(String[] args) {
//        new convert().convert("", 4);
//    }