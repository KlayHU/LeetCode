package Leetcode.Easy;


/**
 * @description: No：617 合并二叉树   【难度：简单】
 * @author: KlayHu
 * 思路：二叉树的相关操作先想到递归。
 * =======================================================================================================
 * leetcode题解；我们可以对这两棵树同时进行前序遍历，并将对应的节点进行合并。在遍历时，如果两棵树的当前节点均不为空，
 * 我们就将它们的值进行相加，并对它们的左孩子和右孩子进行递归合并；如果其中有一棵树为空，那么我们返回另一颗树作为结果；
 * 如果两棵树均为空，此时返回任意一棵树均可（因为都是空）。
 *
 * 作者：LeetCode
 * 链接：https://leetcode-cn.com/problems/merge-two-binary-trees/solution/he-bing-er-cha-shu-by-leetcode/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @create: 2020/9/11 17:04
 **/
public class mergeTrees {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        //t1和t2左边都走完，之后走右边，遇到空的直接返回当前结点；
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
