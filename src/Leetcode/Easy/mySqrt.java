package Leetcode.Easy;

/**
 * @description: No：069.x的平方根   【难度：简单】
 * 思路：二分查找，对于给定的x，必有0<=y^2<=x，由此可以推出查找上下界
 * @author: KlayHu
 * @create: 2020/7/29 14:18
 **/
public class mySqrt {
    public int mySqrt(int x){
        int down =0,up=x;       //上下界
        int result=0;
        while (up - down>=0) {
            int mid = down+(up-down)/2;     //中间区间值
            if ((long)mid * mid <= x) {
                result=mid;
                down = mid+1;
            }else {
                up = mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new mySqrt().mySqrt(8);
    }
}
