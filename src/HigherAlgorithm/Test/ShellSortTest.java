package HigherAlgorithm.Test;

import HigherAlgorithm.ShellSort;

import java.util.Arrays;

/**
 * @description:    希尔排序测试
 * @author: KlayHu
 * @create: 2020/4/14 20:24
 **/
public class ShellSortTest {
    public static void main(String[] args) {
        Integer[] arr = {9, 1, 2, 5, 7, 4, 8, 6, 3, 5};
        System.out.println("排序前的元素:"+ Arrays.toString(arr));
        ShellSort.sort(arr);
        System.out.println("希尔排序后的元素:"+Arrays.toString(arr));
    }
}
