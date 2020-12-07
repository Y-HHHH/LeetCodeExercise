package Tree.BinaryTree.Simple;

/**
 * @author XYH
 * @version 1.0.0
 * @ClassName KThLargest.java
 * @Description 剑指 Offer 54. 二叉搜索树的第k大节点
 * @createTime 2020年12月06日 22:53:00
 */
public class KThLargest {
    int res,k;
    //搜索二叉树的中序序列为递增序列
    public int kthLargest(TreeNode root, int k) {
        this.k=k;
        dfs(root);
        return res;
    }
    private void dfs(TreeNode root){
        // 中序遍历 倒序
        dfs(root.right);

        // 中序
        if(k == 0) return;
        if(--k==0) res = root.val;

        dfs(root.left);
    }
}
