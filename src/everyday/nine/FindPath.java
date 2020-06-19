package everyday.nine;

import java.util.ArrayList;

/**
 * 题目描述
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * 解决思路：先序遍历的同时加入条件判断
 */
public class FindPath {


    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path = new ArrayList<Integer>();

        if (root == null) {
            return result;
        }
        PreTraversal(root,target,path,result);
        return  result;
    }
    public void PreTraversal(TreeNode root,int target,ArrayList<Integer> path,ArrayList<ArrayList<Integer>> result){
        path.add(root.val);
        if (root.val == target && root.left == null && root.right == null) {
            result.add(new ArrayList<Integer>(path));
        }
        if (root.left != null) {
            PreTraversal(root.left,target-root.val,path,result);
        }
        if(root.right != null){
            PreTraversal(root.right,target-root.val,path,result);
        }
        // 代码走到这里，表明要回溯，代表当前path中的root节点我已经不需要了
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode leftRoot = new TreeNode(5);
        TreeNode leftLeft = new TreeNode(4);
        TreeNode leftRight = new TreeNode(7);
        TreeNode right = new TreeNode(12);

        root.left = leftRoot;
        root.right = right;
        leftRoot.left = leftLeft;
        leftRoot.right = leftRight;

        FindPath findPath = new FindPath();
        findPath.FindPath(root,22);
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