package Leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: No：078 子集  【难度：中等】
 * @author: KlayHu
 * 思路：暴力，想的麻烦
 * ===========================================================================================================
 * leetcode题解：暴力的解法，能直观一些。
 * @create: 2020/9/15 17:26
 **/
public class subsets_078 {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        //存放结果集
        res.add(new ArrayList<>());
        //外层遍历所有单个元素
        for (int i = 0; i < nums.length; ++i) {
            //以当前元素为主的子集
            int size = res.size();
            //内层循环遍历所有可能的子集
            for (int j = 0; j < size; ++j) {
                //定义存储内存循环遍历的子集元素，返回最后的res直接从tmp里面取值
                //这一步操作完成从每单个元素去重新遍历，得到子集，不重不漏
                List<Integer> tmp = new ArrayList<>(res.get(j));
                //拼接子集
                tmp.add(nums[i]);

                res.add(tmp);
            }
        }
        return res;
    }
}
