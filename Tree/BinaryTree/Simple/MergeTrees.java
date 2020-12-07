package Tree.BinaryTree.Simple;

/**
 * @author XYH
 * @version 1.0.0
 * @ClassName MergeTrees.java
 * @Description 617. 合并二叉树
 * @createTime 2020年12月06日 23:23:00
 */
public class MergeTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        // 其中一棵树为空时，只需把另一颗返回即可
        if(t1==null) return t2;
        if(t2==null) return t1;
        // 都不为空时，两根相加
        t1.val += t2.val;

        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;
    }
    /*
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        // 其中一棵树为空时，只需把另一颗返回即可
        if(t1==null) return t2;
        if(t2==null) return t1;
        // 都不为空时，两根相加
        TreeNode merge = new TreeNode(t1.val + t2.val);

        merge.left = mergeTrees(t1.left, t2.left);
        merge.right = mergeTrees(t1.right, t2.right);

        return merge;
    }

     */
}
