package Leetcode.Easy;

/**
 * @description: No：538 把二叉搜索树转换为累加树    【难度：简单】
 * @author: KlayHu
 * 思路：递归实现，中序遍历。
 * =====================================================================
 * leetcode题解：注意中序遍历的结果需要反过来
 * @create: 2020/9/15 8:21
 **/
public class convertBST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    int res = 0;
    public TreeNode convertBST(TreeNode root){
        if (root == null) {
            return null;
        }
        convertBST(root.right);
        root.val = root.val + res;
        res = root.val;
        convertBST(root.left);
        return root;
    }
}
