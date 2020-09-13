package Leetcode.Easy;

/**
 * @description: No：104 二叉树的最大深度    【难度：简单】
 * @author: KlayHu
 * 思路：递归，求最大深度。
 * ===========================================================================================================
 * leetcode题解：还是递归，只要有几个节点return几次，+1就完事
 * @create: 2020/9/12 16:05
 **/
public class maxDepth {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int maxDepth(TreeNode root){
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
//    public static void main(String[] args) {
//        TreeNode treeNode = new TreeNode(3);
//        treeNode.left = new TreeNode(9);
//        treeNode.left.left = null;
//        treeNode.left.right = null;
//        treeNode.right = new TreeNode(20);
//        treeNode.right.left = new TreeNode(15);
//        treeNode.right.right = new TreeNode(7);
//        new maxDepth().maxDepth(treeNode);
//    }
}
