package Leetcode.Easy;

import java.util.Stack;

/**
 * @description: No：581 最短无序连续子数组   【难度：简单】
 * @author: KlayHu
 * 思路：找到最大值，找到最小值，然后判断如果最大值不在数组最后一位，最小值不在
 * 第一位。一边比较一边记录；复杂度已经爆炸了
 * =====================================================================
 * leetcode题解：暴力O(N^2)、排序O(NlogN)、栈O(N)，栈解法。
 * 这个方法背后的想法仍然是选择排序。我们需要找到无序子数组中最小元素和最大元素分别对应的正确位置，来求得我们想要
 * 的无序子数组的边界。
 *
 * @create: 2020/9/14 13:40
 **/
public class findUnsortedSubarray_581 {
    public int findUnsortedSubarray(int[] nums){
        Stack<Integer> stack = new Stack<>();
        //定义左右边界条件
        int left = nums.length;
        int right = 0;
        //左边界，从0开始找
        for (int i = 0; i < nums.length;++i) {
            //如果栈不为空，且栈顶元素比遍历的当前元素大
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i])
                //为了找到 nums[j] 的正确位置，我们不断将栈顶元素弹出，直到栈顶元素比 nums[j] 小
                left = Math.min(left, stack.pop());
            //如果遇到的数字大小一直是升序的，我们就不断把对应的下标压入栈中
            stack.push(i);
        }
        stack.clear();
        //右边界，从最后开始找
        for (int i = nums.length-1; i >= 0; --i) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i])
                //右边界扩大
                right = Math.max(right, stack.pop());
            stack.push(i);
        }
        return right - left > 0 ? right - left + 1 : 0;
    }
}
