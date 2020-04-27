package BasicAlgorithm.Test;

import BasicAlgorithm.SelectionSort;

import java.util.Arrays;

/**
 * @description:    选择排序测试
 * @author: KlayHu
 * @create: 2020/4/13 12:28
 **/
public class SelectionSortTest {
    public static void main(String[] args) {
        Integer[] arr = {1, 12, 10, 8, 6, 7, 9, 1, 3, 4};
        System.out.println("选择排序前数组元素:"+Arrays.toString(arr));
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.println("选择排序结果："+ Arrays.toString(arr));
    }
}
