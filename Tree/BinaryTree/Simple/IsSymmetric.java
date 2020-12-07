package Tree.BinaryTree.Simple;


/**
 * @author XYH
 * @version 1.0.0
 * @ClassName IsSymmetric.java
 * @Description
 * @createTime 2020年12月07日 16:18:00
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left,root.right);
    }
    private boolean check(TreeNode p,TreeNode q){
        if(p==null&&q==null) return true;
        // if(p==null||q==null) return false; 因为给定的是二叉树，所以这一步可以省略
        // 一棵树是否对称，可以分成左右子树是否平衡
        return p.val==q.val&&check(p.left,q.right)&&check(p.right,q.left);
    }
}
