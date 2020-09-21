package Leetcode.Medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @description: No：046 全排列 【难度：中等】
 * @author: KlayHu
 * 思路：这个题和076的子集比较像，不需要子集的情况所以在第二层循环中只需要遍历剩下的元素，但是如何才能一次存下遍历一遍的
 * 元素集合呢？
 * ========================================================================================================
 * leetcode题解：回溯法 ：一种通过探索所有可能的候选解来找出所有的解的算法。如果候选解被确认不是一个解的话（或者至少不是
 * 最后一个解），回溯算法会通过在上一步进行一些变化抛弃该解，即回溯并且再次尝试。
 *
 * 首先这棵树除了根结点和叶子结点以外，每一个结点做的事情其实是一样的，即：在已经选择了一些数的前提下，在剩下的还没有选择的
 * 数中，依次选择一个数，这显然是一个 递归 结构；递归的终止条件是： 一个排列中的数字已经选够了 ，因此我们需要一个变量来表示
 * 当前程序递归到第几层，我们把这个变量叫做 depth，或者命名为 index ，表示当前要确定的是某个全排列中下标为 index 的那个数
 * 是多少；布尔数组 used，初始化的时候都为 false 表示这些数还没有被选择，当我们选定一个数的时候，就将这个数组的相应位置设置
 * 为 true ，这样在考虑下一个位置的时候，就能够以 O(1)O(1) 的时间复杂度判断这个数是否被选择过，这是一种「以空间换时间」的思想。
 *
 * 作者：liweiwei1419
 * 链接：https://leetcode-cn.com/problems/permutations/solution/hui-su-suan-fa-python-dai-ma-java-dai-ma-by-liweiw/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @create: 2020/9/15 17:53
 **/
public class permute_046 {
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        // 使用一个动态数组保存所有可能的全排列
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        //bool数组表示当前元素遍历状态
        boolean[] used = new boolean[len];
        Deque<Integer> path = new ArrayDeque<>(len);

        dfs(nums, len, 0, path, used, res);
        return res;
    }

    private void dfs(int[] nums, int len, int depth,
                     Deque<Integer> path, boolean[] used,
                     List<List<Integer>> res) {
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                path.addLast(nums[i]);
                used[i] = true;

                System.out.println("  递归之前 => " + path);
                dfs(nums, len, depth + 1, path, used, res);

                used[i] = false;
                path.removeLast();
                System.out.println("递归之后 => " + path);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        permute_046 solution = new permute_046();
        List<List<Integer>> lists = solution.permute(nums);
        System.out.println(lists);
    }
}

