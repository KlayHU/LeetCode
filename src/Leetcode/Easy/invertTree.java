package Leetcode.Easy;

/**
 * @description: No：226 翻转二叉树   【难度：简单】
 * @author: KlayHu
 * 思路：递归
 * ============================================================================================================
 * leetcode题解：反转一颗空树结果还是一颗空树。对于一颗根为 rr，左子树为 mbox{right}mboxright， 右子树为 mbox{left}mboxleft
 * 的树来说，它的反转树是一颗根为 rr，左子树为 mbox{right}mboxright 的反转树，右子树为 mbox{left}mboxleft 的反转树的树。
 *
 * 作者：LeetCode
 * 链接：https://leetcode-cn.com/problems/invert-binary-tree/solution/fan-zhuan-er-cha-shu-by-leetcode/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @create: 2020/9/11 17:33
 **/
public class invertTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode invertTree(TreeNode root){
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
}
