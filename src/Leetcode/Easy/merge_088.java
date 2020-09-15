package Leetcode.Easy;

/**
 * @description: No：088 合并两个有序数组    【难度：简单】
 * @author: KlayHu
 * 思路：合并后排序。从后向前遍历数组，因为nums1为0的元素都在后面。但这个没有利用到已经是排序数组
 * 的性质，时间复杂度O((n+m)log(n+m))，而且有现成的System.arraycopy()和Arrays.sort()
 * ====================================================================================
 * 题解：双指针。依然是从后往前遍历数组nums1，但是同时进行下标元素的比较，将最大的值放到最后，任
 * 何一个数组遍历完成后进行剩下元素的arraycopy，时间复杂度O(m+n)
 * @create: 2020/8/14 11:54
 **/
public class merge_088 {
    public void merge(int[] nums1,int m,int[] nums2,int n){
        //双指针
        int arr1 = m - 1;
        int arr2 = n - 1;
        int len = m + n - 1;
        while(arr1 >= 0 && arr2 >= 0) {
            // 注意--符号在后面，表示先进行计算再减1，这种缩写缩短了代码
            // 每次进行完比较后直接移动下标
            nums1[len--] = nums1[arr1] > nums2[arr2] ? nums1[arr1--] : nums2[arr2--];
        }
        // 表示将nums2数组从下标0位置开始，拷贝到nums1数组中，从下标0位置开始，长度为arr2+1
        System.arraycopy(nums2, 0, nums1, 0, arr2 + 1);
    }
}

