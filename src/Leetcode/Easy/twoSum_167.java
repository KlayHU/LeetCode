package Leetcode.Easy;

/**
 * @description: No：167 两数之和II-输入有序数组   【难度：简单】
 * @author: KlayHu
 * 思路：两数之和I的解法是根据一个数的差值在hashmap里面去找另一个，这个给了升序数组，可以用双指针
 * 但是我的双指针还是复杂了，问题出在返回的条件上了
 * ====================================================================================
 * leetcode题解：二分查找、双指针，思想相差不大。
 * @create: 2020/8/27 17:01
 **/
public class twoSum_167 {
    //双指针
    public int[] twoSum(int[] numbers, int target){
        int last = numbers.length - 1;
        int first = 0;
        while (first < last) {
            int sum = numbers[first] + numbers[last];
            if (sum == target) {
                return new int[]{first + 1, last + 1};
            } else if (sum < target) {
                ++first;
            } else {
                --last;
            }
        }
        return new int[]{-1, -1};
        //        int[] index = new int[2];
//        for (int first = 0; first < numbers.length; first++) {
//            if (numbers[last] - numbers[first] > target) {
//                last--;
//            } else if(numbers[last]-numbers[first]<target){
//                last++;
//            }
//            if (numbers[last] - numbers[first] ==target) {
//                first = index[0];
//                last = index[1];
//            }
//        }
//        System.out.println(index);
//        return index;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 11};
        new twoSum_167().twoSum(arr, 13);
    }
}
