package BasicAlgorithm.Test;

import BasicAlgorithm.BubbleSort;

import java.util.Arrays;

/**
 * @description:
 * @author: KlayHu
 * @create: 2020/4/14 20:55
 **/
public class BubbleSortTest {
    public static void main(String[] args) {
        Integer[] arr = {9, 8, 7, 5, 6, 4, 1, 2, 3};
        BubbleSort.sort(arr);
        System.out.println("冒泡排序后的元素:"+ Arrays.toString(arr));
    }
}
