package everyday.seven;

/**
 * 题目描述
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 解题思路：1.先序遍历A的节点，2.再先序比较A的节点结构是不是和B节点结构一致
 */
public class IsSubTree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return dfs(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }
    boolean dfs(TreeNode root1,TreeNode root2){
        //B树节点没了，A树还有节点
        if (root2 == null) {
            return true;
        }
        //A树节点没了，B树还有节点
        if (root1 == null) {
            return false;
        }
        return root1.val==root2.val && dfs(root1.left,root2.left) && dfs(root1.right,root2.right);
    }
}

class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;
 }
}