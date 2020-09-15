package Leetcode.Easy;

import java.util.*;

/**
 * @description: No：347 前K个高频元素 【难度：中等】
 * @author: KlayHu
 * 思路：复杂度优于O(nlogn)。把结果集存放在HashMap里，给定一个标志位flag，每输出一个元素flag++，直到和target
 * 相等，也就是说输出flag个元素。
 * =================================================================================================
 * leetcode题解：小顶堆。放Map里可行，但是注意下一步不能排序Map中保存的出现次数结果集。建立一个小顶堆，遍历出现
 * 次数结果集。利用堆的思想：
 * 如果堆的元素个数小于 k，就可以直接插入堆中。
 * 如果堆的元素个数等于 k，则检查堆顶与当前出现次数的大小。如果堆顶更大，说明至少有 k 个数字的出现次数比当前值大，
 * 故舍弃当前值；否则，就弹出堆顶，并将当前值插入堆中。
 * =================================================================================================
 * 排序算法的解法就是先进性哈希运算，维护出现次数的哈希表，然后进行快排/桶排序/。。。
 * @create: 2020/9/7 19:05
 **/
public class topKFrequent_347 {
    public List<Integer> topKFrequent(int[] nums, int k){
        //把出现次数结果集存放到map里
        Map<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (res.containsKey(nums[i])) {
                res.put(nums[i], res.get(nums[i]) + 1);
            } else {
                res.put(nums[i], 1);
            }
        }
        //遍历map，用小顶堆保存出现频率最大的k个元素
        //首先创建优先队列
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer k1, Integer k2) {
                return res.get(k1)-res.get(k2);
            }
        });
        //开始遍历
        for (Integer key : res.keySet()) {
            if (queue.size() < k) {
                queue.add(key);
            } else if (res.get(key) > res.get(queue.peek())){
                //出队，替换成新的频率更高的元素
                queue.remove();
                queue.add(key);
            }
        }
        //取出最小堆中的元素
        List<Integer> heap = new ArrayList<>();
        for (int index= 0;index<k;++index){
            //依次出队
            heap.add(queue.remove());
        }
        return heap;
//        int count =0;
//        Map<Integer, Integer> res = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (res.containsKey(nums[i])) {
//                res.put(nums[i], res.get(nums[i]) + 1);
//            } else {
//                res.put(nums[i], 1);
//            }
//            if(res.get(nums[i])>)
        }
}
