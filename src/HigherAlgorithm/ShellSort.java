package HigherAlgorithm;

/**
 * @description: 希尔排序
 * @author: KlayHu
 * @create: 2020/4/14 18:59
 **/
public class ShellSort {
    public static void sort(Comparable[] a) {
        //1.根据数组a长度，确定h的增量初始值
        int h = 1;
        while (h < a.length / 2) {
            h = 2 * h + 1;
        }
        //2.希尔排序
        while (h >= 1) {
            //排序
            //找到待插入的元素
            for (int i = h; i < a.length; i++) {
                //把待插入的元素插入到有序数列中
                for (int j = i; j >= h; j -= h) {
                    if (greater(a[j - h], a[j])) {
                        //如果j-h大，交换元素顺序
                        exch(a, j - h, j);
                    } else {
                        //有序了
                        break;
                    }
                }
            }
            //减小h的值
            h = h / 2;
        }
    }

    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
