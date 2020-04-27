package HigherAlgorithm.Test;

import HigherAlgorithm.QuickSort;

import java.util.Arrays;

/**
 * @description:
 * @author: KlayHu
 * @create: 2020/4/15 17:43
 **/
public class QuickSortTest {
    public static void main(String[] args) {
        Integer[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 8};
        System.out.println("排序前数组元素：" + Arrays.toString(arr));
        QuickSort.sort(arr);
        System.out.println("快速排序后的元素：" + Arrays.toString(arr));
    }
}
