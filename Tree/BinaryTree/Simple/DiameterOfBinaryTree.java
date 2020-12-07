package Tree.BinaryTree.Simple;


/**
 * @author XYH
 * @version 1.0.0
 * @ClassName DiameterOfBinaryTree.java
 * @Description 543. 二叉树的直径
 * @createTime 2020年12月07日 17:35:00
 */
public class DiameterOfBinaryTree {
    int max = 0;
    // 以p为根结点的二叉树的最长路径就是其左右子树之和
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }
    private int dfs(TreeNode root){
        if(root ==null) return 0;
        //遍历左右子树求高度
        int left = dfs(root.left);
        int right = dfs(root.right);
        int sum = left + right;
        if(max<sum) max=sum;
        return left>right?++left:++right;
    }

    // 1.0
    /*1.0
    ArrayList<Integer> arrs = new ArrayList<Integer>();
    // 以p为根结点的二叉树的最长路径就是其左右子树之和
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        dfs(root);
        int max = 0;
        for (Integer arr : arrs) {
            if(arr>max) max=arr;
        }
        return max;
    }
    private int dfs(TreeNode root){
        if(root ==null) return 0;
        //遍历左右子树求高度
        int left = dfs(root.left);
        int right = dfs(root.right);
        arrs.add(left+right);// 记录左右子树高度
        return left>right?++left:++right;
    }*/
}
