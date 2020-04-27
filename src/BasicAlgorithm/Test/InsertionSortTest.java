package BasicAlgorithm.Test;

import BasicAlgorithm.InsertionSort;

import java.util.Arrays;

/**
 * @description:    插入排序测试
 * @author: KlayHu
 * @create: 2020/4/14 13:09
 **/
public class InsertionSortTest {
    public static void main(String[] args) {
        Integer[] a = {4, 3, 2, 10, 12, 5, 1, 6};
        System.out.println("插入排序前数组元素:"+Arrays.toString(a));
        InsertionSort.sort(a);
        System.out.println("插入排序结果:"+Arrays.toString(a));
    }
}
