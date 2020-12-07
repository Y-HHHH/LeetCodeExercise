# 树相关的题目

> 树相关的问题的核心思路：递归
```java
public void fun(TreeNode root){
    //前序
    fun(root.left);
    //中序
    fun(root.right);
    //后序
}
```
