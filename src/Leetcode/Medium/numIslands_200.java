package Leetcode.Medium;

/**
 * @description: No：200 岛屿的数量   【难度：中等】
 * @author: KlayHu
 * 思路：遍历二维数组，然后dfs或是bfs，走迷宫。看完题解，dfs比bfs好想。
 * ===================================================================================
 * leetcode题解：
 * dfs方法： 设目前指针指向一个岛屿中的某一点 (i, j)，寻找包括此点的岛屿边界。
 * 从 (i, j) 向此点的上下左右 (i+1,j),(i-1,j),(i,j+1),(i,j-1) 做深度搜索。
 * 终止条件：
 * (i, j) 越过矩阵边界;
 * grid[i][j] == 0，代表此分支已越过岛屿边界。每遍历一个点，把这个点元素置为 0
 * -----------------------------------------------------------------------------------

 * -----------------------------------------------------------------------------------
 * bfs方法：借用一个队列 queue，判断队列首部节点 (i, j) 是否未越界且为 1：
 * 若是则置零（删除岛屿节点），并将此节点上下左右节点 (i+1,j),(i-1,j),(i,j+1),(i,j-1) 加入队列；
 * 若不是则跳过此节点；
 * 循环 pop 队列首节点，直到整个队列为空，此时已经遍历完此岛屿。
 *
 * 作者：jyd
 * 链接：https://leetcode-cn.com/problems/number-of-islands/solution/number-of-islands-shen-du-you-xian-bian-li-dfs-or-/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。
 * @create: 2020/8/20 14:44
 **/
public class numIslands_200 {

    private void dfs(char[][] grad, int i, int j) {
        //判断边界条件
        if (i < 0 || j < 0 || i >=grad.length || j >=grad[0].length || grad[i][j] == '0')
            return;
        //先标记为已发现的陆地，置为0
        grad[i][j] ='0';
        //开始深度优先去寻找其他陆地，必须上下左右都是陆地才算是一个岛屿
        dfs(grad, i + 1, j);
        dfs(grad, i, j + 1);
        dfs(grad, i-1, j);
        dfs(grad, i, j-1);
    }

    public int numIslands(char[][] grid) {
        int islandCount = 0;
        //遍历二维数组
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //找到陆地肯定存在岛屿，进入dfs
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    islandCount++;
                }
            }
        }
            return islandCount;
    }
}
