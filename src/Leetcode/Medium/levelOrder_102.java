package Leetcode.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description: No：二叉树的层序遍历
 * @author: KlayHu
 * 思路：NULL
 * =====================================================================
 * leetcode题解：层序遍历用BFS，主要实现为队列，而DFS是递归，本题使用BFS
 *
 * @create: 2020/9/15 8:52
 **/
public class levelOrder_102 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        //先把根节点加到队列里
        queue.add(root);
        while (!queue.isEmpty()) {
            //需要存每一层遍历节点的元素的情况
            List<Integer> level = new ArrayList<>();
            //定义当前层数
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {
                //节点出队，记录元素
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(level);
        }
        return res;
    }
}
