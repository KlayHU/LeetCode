package HigherAlgorithm;

/**
 * @description: 递归排序
 * @author: KlayHu
 * @create: 2020/4/14 21:15
 **/
public class MergeSort {
    //成员变量，归并所需要的辅助数组
    private static Comparable[] assist;

    //排序
    public static void sort(Comparable[] a) {
        //初始化成员变量
        assist = new Comparable[a.length];
        //定义一个最小索引low,一个最大索引high
        int low = 0;
        int high = a.length - 1;
        //调用重载的方法进行low到high之间排序
        sort(a, low, high);
    }

    //判断v是否比w小
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    //在a数组中low索引处到high索引处的排序
    private static void sort(Comparable[] a, int low, int high) {
        if (low >= high) {
            return;
        }
        //将low到high索引的元素分组
        int mid = low + (high - low) / 2;
        //low到mid是一组，mid+1到high是一组
        //递归，把组分到不能分了为止
        sort(a, low, mid);
        sort(a, mid + 1, high);

        //合并两个有序数组
        merge(a, low, mid, high);
    }

    /**
     * 从索引low到索引mid为一个子组，从索引mid+1到索引high为另一个子组。
     * 把数组a中这两个子组的数据合并为一个有序的大组(索引low到索引high)
     *
     * @param a
     * @param low
     * @param mid
     * @param high
     */
    private static void merge(Comparable[] a, int low, int mid, int high) {
        //定义三个指针
        int i = low;        //辅助数组头指针
        int p1 = low;       //分组数组(low~mid组)头指针
        int p2 = mid + 1;       //分组数组(mid+1~high组)头指针
        //开始遍历两个组合并到辅助数组中
        while (p1 <= mid && p2 <= high) {
            if (less(a[p1], a[p2])) {
                assist[i++] = a[p1++];
            } else {
                assist[i++] = a[p2++];
            }
        }
        //p2指针跃出最大下标进行处理
        while (p1 <= mid) {
            assist[i++] = a[p1++];
        }
        //p1指针跃出最大下标进行处理
        while (p2 <= high) {
            assist[i++] = a[p2++];
        }
        //把辅助数组中的元素拷贝到原数组中
        for (int index = low; index <= high; index++) {
            a[index] = assist[index];
        }
    }
}

