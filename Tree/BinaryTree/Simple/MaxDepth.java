package Tree.BinaryTree.Simple;

/**
 * @author XYH
 * @version 1.0.0
 * @ClassName MaxDepth.java
 * @Description 剑指 Offer 55 - I. 二叉树的深度
 * @createTime 2020年12月06日 22:06:00
 */




public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left>right?++left:++right;
    }
}
