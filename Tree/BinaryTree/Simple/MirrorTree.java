package Tree.BinaryTree.Simple;

import java.util.Stack;

/**
 * @author XYH
 * @version 1.0.0
 * @ClassName MirrorTree.java
 * @Description 剑指 Offer 27. 二叉树的镜像
 * @createTime 2020年12月06日 22:12:00
 */
public class MirrorTree {
    // bfs
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.empty()){
            TreeNode node = stack.pop();
            if(node.left!=null) stack.add(node.left);
            if(node.right!=null) stack.add(node.right);
            //
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        return root;
    }

    // 递归（暂存左子树，交换左右子树）
    /*
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;
        TreeNode temp = root.left;//暂存左子树
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;
    }

     */
}
