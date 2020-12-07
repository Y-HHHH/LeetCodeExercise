package Tree.BinaryTree.Simple;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author XYH
 * @version 1.0.0
 * @ClassName IsUnivalTree.java
 * @Description 965. 单值二叉树
 * @createTime 2020年12月07日 17:19:00
 */
public class IsUnivalTree {
    Queue<TreeNode> que = new LinkedList<>();
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        que.add(root);
        int val = root.val;
        boolean isSuccess = true;
        while (isSuccess&&!que.isEmpty()){
            TreeNode node = que.poll();
            if(val!=node.val) isSuccess=false;
            if(node.left!=null) que.add(node.left);
            if(node.right!=null) que.add(node.right);
        }
        return isSuccess;
    }
}
