package Leetcode.Easy;

import Leetcode.EverydayQuest.isBalanced;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @description: No：101 对称二叉树   【难度：简单】
 * @author: KlayHu
 * 思路：就是子节点遍历比较，一般用递归
 * ===================================================================================
 * leetcode题解：1、递归O(n)。。2、迭代，用队列实现嵌套在while里面
 * @create: 2020/9/3 10:35
 **/
public class isSymmetric {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    //递归实现，定义p、q两个指针，分别指向根节点左、右子节点，然后分别移动
    private boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }
}
