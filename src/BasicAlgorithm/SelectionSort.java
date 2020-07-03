package BasicAlgorithm;

/**
 * @description: 选择排序
 * @author: KlayHu
 * @create: 2020/4/13 11:19
 **/
public class SelectionSort {
    /**
     * 对数组a中的元素进行排序
     *
     * @param a
     */
    public void sort(Comparable[] a) {
        //定义一个变量，记录最小元素所在的索引，默认为参与选择排序的第一个元素所在的位置
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (greater(a[minIndex], a[j])) {
                    minIndex = j;     //j就是新的最小值
                }
            }
            exch(a, minIndex, i);     //互换新的最小值和i下标的位置
        }
    }

    /**
     * 比较v元素和w元素大小
     *
     * @param v
     * @param w
     * @return
     */
    private boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }


    /**
     * a数组下标i和j位置互换
     *
     * @param a
     * @param i
     * @param j
     */
    private void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
