package everyday.seven;

/**
 * 题目描述
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 解题思路：
 */
public class MirrorTree {
    public void Mirror(TreeNode root) {
        if (root != null) {
            swapLeftAndRight(root);
            Mirror(root.left);
            Mirror(root.right);
        }
    }
    public void swapLeftAndRight(TreeNode root){
        TreeNode temp;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
