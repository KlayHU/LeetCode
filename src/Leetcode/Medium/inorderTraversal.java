package Leetcode.Medium;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: No：94 二叉树的中序遍历 【难度：中等】
 * @author: KlayHu
 * 思路：递归或者栈。
 * =====================================================================
 * leetcode题解：栈解法。（递归在于隐式维护了一个栈）
 * @create: 2020/9/14 10:51
 **/
public class inorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Deque<TreeNode> stk = new LinkedList<TreeNode>();
        //当前节点不为空，或者栈不为空。
        while (root != null || !stk.isEmpty()) {
            //节点不为空，入栈，左移节点
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            //最左的节点出栈，记录节点val
            root = stk.pop();
            res.add(root.val);
            //找右边有没有节点，没有的话再让左节点出栈，循环
            root = root.right;
        }
        return res;
    }
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<Integer>();
//        inorder(root, res);
//        return res;
//    }
//
//    public void inorder(TreeNode root, List<Integer> res) {
//        if (root == null) {
//            return;
//        }
//        inorder(root.left, res);
//        res.add(root.val);
//        inorder(root.right, res);
//    }
}
