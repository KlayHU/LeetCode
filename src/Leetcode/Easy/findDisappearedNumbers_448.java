package Leetcode.Easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @description: No：448 消失的数字   【难度：简单】
 * @author: KlayHu
 * 思路：用Map把所有[1,N]的数字存进去，然后遍历数组，重复的元素+1，最后遍历Map输出次数为0的元素。
 * 空间复杂度O(1)，如何原地修改？
 * ========================================================================================================
 * leetcode题解：
 * 遍历输入数组的每个元素一次。
 * 我们将把 |nums[i]|-1 索引位置的元素标记为负数。即 nums[|nums[i] |- 1] \times -1nums[∣nums[i]∣−1]×−1 。
 * 然后遍历数组，若当前数组元素 nums[i] 为负数，说明我们在数组中存在数字 i+1。
 * 可以通过以下图片示例来帮助理解。
 *
 * 作者：LeetCode
 * 链接：https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/solution/zhao-dao-suo-you-shu-zu-zhong-xiao-shi-de-shu-zi-2/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @create: 2020/9/12 17:07
 **/
public class findDisappearedNumbers_448 {
    public List<Integer> findDisappearedNumbers(int[] nums){
        Map<Integer, Integer> res = new HashMap<>();
        //存到map里
        for (int i = 0; i < nums.length; ++i) {
            if (res.containsKey(nums[i])) {
                res.put(nums[i], res.get(nums[i]) + 1);
            } else {
                res.put(nums[i],0);
            }
        }
        List<Integer> list = new LinkedList<>();
        for (int i =1;i<=nums.length;++i) {
            if (!res.containsKey(i)) {
                list.add(i);
            }
        }
        return list;
    }
}
