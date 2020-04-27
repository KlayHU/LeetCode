package BasicAlgorithm;

/**
 * @description: 冒泡排序
 * @author: KlayHu
 * @create: 2020/4/14 20:48
 **/
public class BubbleSort {
    public static void sort(Comparable[] a) {
        //i从数组最大索引处开始，外层循环遍历所有要进入内层循环的元素
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //内层循环交换数组元素
                if (greater(a[j], a[j + 1])) {
                    exch(a, j, j + 1);
                }
            }
        }
    }

    public static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable tmp;
        tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

}
