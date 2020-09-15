package Leetcode.Easy;

/**
 * @description: No：100 相同的树    【难度：简单】
 * @author: KlayHu
 * 思路：递归
 * ============================================================================================================
 * leetcode：简便写法
 * @create: 2020/9/15 0:09
 **/
public class isSameTree_100 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null || q == null)
            return false;
        if(p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
