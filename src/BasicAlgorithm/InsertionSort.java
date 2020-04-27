package BasicAlgorithm;

/**
 * @description: 插入排序
 * @author: KlayHu
 * @create: 2020/4/14 12:56
 **/
public class InsertionSort {
    /**
     * 对数组a中的元素进行排序
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        //外层循环控制已排序的元素下标
        for (int i = 1; i < a.length; i++) {
            //内层循环用于比较和交换，比较j-1处的值和j处的值，如果j-1大，交换，否则就是合适的位置，退出循环
            for (int j = i; j > 0; j--) {
                if (greater(a[j - 1], a[j])) {
                    exch(a, j - 1, j);
                } else {
                    break;  //结束内层循环
                }
            }
        }
    }

    /**
     * 比较v元素和w元素大小
     *
     * @param v
     * @param w
     * @return
     */
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    /**
     * 数组下标i和j位置互换
     *
     * @param a
     * @param i
     * @param j
     */
    private static void exch(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
