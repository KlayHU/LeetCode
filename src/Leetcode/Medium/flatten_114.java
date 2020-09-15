package Leetcode.Medium;

/**
 * @description: No：114 二叉树展开为链表 【难度：中等】
 * @author: KlayHu
 * 思路：先序递归，让二叉树先序遍历，然后改变子节点指向
 * ===============================================================================================================
 * leetcode题解：注意到前序遍历访问各节点的顺序是根节点、左子树、右子树。如果一个节点的左子节点为空，则该节点不需要进行展开操
 * 作。如果一个节点的左子节点不为空，则该节点的左子树中的最后一个节点被访问之后，该节点的右子节点被访问。该节点的左子树中最后
 * 一个被访问的节点是左子树中的最右边的节点，也是该节点的前驱节点。因此，问题转化成寻找当前节点的前驱节点。
 *
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/solution/er-cha-shu-zhan-kai-wei-lian-biao-by-leetcode-solu/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @create: 2020/9/14 15:59
 **/
public class flatten_114 {

    public class TreeNode {
      int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
  }


  public void flatten (TreeNode root){
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                //next和pre都指向root.left
                TreeNode next = curr.left;
                TreeNode predecessor = next;
                //pre的右边有节点
                while (predecessor.right != null) {
                    predecessor = predecessor.right;
                }
                //相当于直接截取了root所有右子树，并到pre（root.left）的下一个节点
                predecessor.right = curr.right;
                //清空左子树
                curr.left = null;
                //让cur.right（root.right）指向拼了一部分的next
                curr.right = next;
            }
            //依次走到最右边的节点
            curr = curr.right;
        }
    }
}

