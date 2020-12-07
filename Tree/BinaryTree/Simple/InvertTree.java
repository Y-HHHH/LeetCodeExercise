package Tree.BinaryTree.Simple;

/**
 * @author XYH
 * @version 1.0.0
 * @ClassName InvertTree.java
 * @Description 226. 翻转二叉树
 * @createTime 2020年12月07日 16:59:00
 */
public class InvertTree {
    //树的翻转等于子树的翻转
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;
        return root;
    }
}
