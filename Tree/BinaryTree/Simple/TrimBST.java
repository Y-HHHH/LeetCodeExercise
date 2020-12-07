package Tree.BinaryTree.Simple;

/**
 * @author XYH
 * @version 1.0.0
 * @ClassName TrimBST.java
 * @Description 669. 修剪二叉搜索树
 * @createTime 2020年12月07日 18:58:00
 */
public class TrimBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(2);
        TreeNode treeNode = trimBST(root, 1, 2);
        System.out.println(treeNode.val);
        //System.out.println(treeNode.left.val);
        System.out.println(treeNode.right.val);
    }
    public static TreeNode trimBST(TreeNode root, int low, int high) {
        // 核心：二叉搜索树中序遍历是递增的序列
        if(root == null) return null;
        if(root.val < low) return root.right;
        if(root.val > high) return root.left;

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right,low,high);
        return root;
    }
}
