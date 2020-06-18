package stack;
import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

//TODO https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
// 二叉树的中序遍历
//TODO 根节点放在左节点的左边，称为前序（pre-order）、 -------根左右
// 根节点放在左节点和右节点的中间，称为中序（in-order）、--------------左根右
// 根节点放在右节点的右边，称为后序-----------左右根
public class Code94 {

    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {

        if (root == null) {
            return list;
        }

        inorderTraversal(root.left);
        list.add(root.val);

        inorderTraversal(root.right);
        return list;
    }


    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);


        t1.right = t2;
        t2.left = t3;

        List<Integer>  list  = new Code94().inorderTraversal(t1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+"-------");
        }


    }

}
