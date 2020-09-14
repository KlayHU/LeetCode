package Leetcode.Easy;

/**
 * @description: No：543 二叉树的直径
 * @author: KlayHu
 * 思路：中序遍历，每经过一个节点给cnt++。
 * ==========================================================================================================
 * leetcode题解：dfs。首先我们知道一条路径的长度为该路径经过的节点数减一，所以求直径（即求路径长度的最大值）等效于求路径
 * 经过节点数的最大值减一。而任意一条路径均可以被看作由某个节点为起点，从其左儿子和右儿子向下遍历的路径拼接得到。
 *
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/diameter-of-binary-tree/solution/er-cha-shu-de-zhi-jing-by-leetcode-solution/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @create: 2020/9/13 21:45
 **/
public class diameterOfBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private int ans;
    private int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }
    private int depth(TreeNode node) {
        if (node == null) return 0; // 访问到空节点了，返回0
        int L = depth(node.left); // 左儿子为根的子树的深度
        int R = depth(node.right); // 右儿子为根的子树的深度
        ans = Math.max(ans, L+R+1); // 计算d_node即L+R+1 并更新ans
        return Math.max(L, R) + 1; // 返回该节点为根的子树的深度
    }

//    public static void main(String[] args) {
//        TreeNode treeNode = new TreeNode(1);
//        treeNode.left = new TreeNode(2);
//        treeNode.right = new TreeNode(3);
//        treeNode.left.left = new TreeNode(4);
//        treeNode.left.right = new TreeNode(5);
//        new diameterOfBinaryTree().diameterOfBinaryTree(treeNode);
//    }
}
