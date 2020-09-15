package Leetcode.EverydayQuest;

/**
 * @description: No：110 每日一题 08.17 平衡二叉树    【难度：简单】
 * @author: KlayHu
 * 思路：tree的解法一般首先考虑递归，不管实现起来怎么样，初步思路好想。 //递归debug看了半天。。
 * =================================================================================
 * leetcode：递归。自底向上快O(n)，不容易想。自顶向下慢，好想实现较复杂。
 * @create: 2020/8/17 14:24
 **/
public class isBalanced_110 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public boolean isBalanced(TreeNode root) {
        System.out.println(recur(root) != -1);
        return recur(root) != -1;
    }

    private int recur(TreeNode root) {
        if (root == null) return 0;
        int left = recur(root.left);
        //递归的结束条件：左叶子节点不存在，先return 0
        //而后 判断右子节点，不存在 也return 0 ，最后一块return个1
        if(left == -1) return -1;
        int right = recur(root.right);
        //递归先最左，然后一点一点往上。因为递归完有返回值，下次再遇到需要判断这个之前节点的时候
        //直接就返回了，所以直观来看是自底向上的。
        if(right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }

//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
//        new isBalanced().isBalanced(root);
//    }
}
