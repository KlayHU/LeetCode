package HigherAlgorithm;

/**
 * @description: 快速排序
 * @author: KlayHu
 * @create: 2020/4/15 17:42
 **/
public class QuickSort {
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    /**
     * 对数组元素进行排序
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        int low = 0;
        int high = a.length - 1;
        sort(a, low, high);
    }

    //给low到high索引的元素排序
    public static void sort(Comparable[] a, int low, int high) {
        if (low >= high) {
            return;
        }

        //需要对数组中low到high元素进行分组(左子组，右子组)
        int partition = partition(a, low, high);    //返回值为分组的分界值处的索引

        //让左子组有序
        sort(a, low, partition - 1);
        //让右子组有序
        sort(a, partition + 1, high);


    }

    //快排分组核心代码
    //在数组a中，从索引low处到索引high处之间的元素进行分析，并返回分组界限对应的索引
    private static int partition(Comparable[] a, int low, int high) {

        //确定分界值
        Comparable key = a[low];
        int left = low;
        int right = high + 1;
        //定义两个指针，分别指向将元素切分的最小索引处和最大索引处的下一个位置；
        while (true) {
            //先从右往左扫描，移动left指针，找到一个比分界值小的元素，停止；
            while (less(key, a[--right])) {
                //如果right移动到最左边还是没有找到合适的元素
                if (right == low) {
                    break;
                }
            }
            //再从左往右扫描，移动right指针，找到一个比分界值大的元素，停止；
            while (less(a[++left], key)) {
                if (left == high) {
                    break;
                }
            }
            //判断left>=right，如果不相等就交换left和right指针对应的索引元素位置,相等就结束循环
            if (right >= left) {
                break;
            } else {
                exch(a, left, right);
            }
        }
        //交换分界值
        exch(a, low, left);
        return left;
    }
}
