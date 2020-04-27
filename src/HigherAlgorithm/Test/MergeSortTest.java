package HigherAlgorithm.Test;

import HigherAlgorithm.MergeSort;

import java.util.Arrays;

/**
 * @description:    递归排序测试
 * @author: KlayHu
 * @create: 2020/4/14 21:16
 **/
public class MergeSortTest {
    public static void main(String[] args) {
        Integer[] arr = {8,4,5,7,1,3,6,2};
        System.out.println("归并排序前数组元素："+Arrays.toString(arr));
        MergeSort.sort(arr);
        System.out.println("归并排序结果："+ Arrays.toString(arr));
    }
}
