package Leetcode.Medium;

/**
 * @description: No：236 二叉树的最近公共祖先
 * @author: KlayHu
 * 思路：递归，好想
 * =====================================================================
 * leetcode：注意判定条件。
 * @create: 2020/9/15 9:43
 **/
public class lowestCommonAncestor_236 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
  }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left != null && right != null){
            return root;
        }else if(left != null){
            return left;
        }else if (right != null){
            return right;
        }
        return null;
    }
}
