package Leetcode.Interview;

/**
 * @description: No：面试题04 二维数组中的查找  难度【简单】
 * 暴力不可取，时间复杂度O(mn),容易超时
 * @author: KlayHu
 * @create: 2020/4/27 15:49
 **/
public class findNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //先判断数组是否合规
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;      //定义数组行列
        int columns = matrix[0].length;
        //初始化寻找位置
        int row = 0;
        int column = columns - 1;
        while (row < rows && column >= 0) {
            int num = matrix[row][column];
            if (num == target) {
                System.out.println("true");
                return true;
            } else if (num > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        findNumberIn2DArray findNumberIn2DArray = new findNumberIn2DArray();
        int[][] arr = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6}, {3, 4, 5, 6, 7, 8}, {4, 5, 6, 7, 8, 9}, {9, 10, 11, 12, 13}};
        findNumberIn2DArray.findNumberIn2DArray(arr, 3);
    }
}
