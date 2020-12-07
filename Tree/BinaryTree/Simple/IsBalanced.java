package Tree.BinaryTree.Simple;

/**
 * @author XYH
 * @version 1.0.0
 * @ClassName IsBlanced.java
 * @Description 110. 平衡二叉树
 * @createTime 2020年12月07日 15:57:00
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if(account(root) == -1) return false;
        else return true;
    }
    private int account(TreeNode root){
        if(root == null) return 0;

        int left = account(root.left);
        int right = account(root.right);

        if(left==-1||right==-1) return -1;
        else return Math.abs(left-right)>1?-1:Math.max(left,right)+1;
    }
}
