package Leetcode.Easy;

/**
 * @description: No：027.移除元素 【简单】
 * @author: KlayHu
 * @create: 2020/4/25 19:40
 **/
public class removeElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 5};
        removeElement removeElement = new removeElement();
        removeElement.removeElement(arr, 2);
    }
}
