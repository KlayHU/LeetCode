package Leetcode.Medium;

/**
 * @description: No：011 盛水最多的容器 【难度：中等】
 * @author: KlayHu
 * leetcode题解思路：双指针。每次步长为1，然后利用小的height*总步长算出一个值，之后移动指针，通过
 * 每次判断左右指针对应下标元素的height大小进行步长的移动。（巧妙解决了桶装水问题，降低
 * 时间复杂度）
 * @create: 2020/7/31 15:38
 **/
public class maxArea_011 {
    public int maxArea(int[] height){
        int left = 0;
        int right = height.length - 1;  //定义左右指针
        int result = 0;
        while(left<right){
            result = height[left] < height[right] ?
                    Math.max(result, (right - left) * height[left++]) :
                    Math.max(result, (right - left) * height[right++]) ;
        }
        return height.length;
    }
}
