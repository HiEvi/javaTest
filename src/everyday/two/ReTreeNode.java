package everyday.two;

import java.util.Scanner;

/**
 * 题目描述
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 */

//Definition for binary tree
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int val){
            this.val = val;
        }
}

public class ReTreeNode {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
       return reBuild(pre,0,pre.length-1,in,0,in.length-1);
    }

    public TreeNode reBuild(int [] pre,int preLeft, int preRight, int[] in,int inLeft, int inRight){
        if(preLeft>preRight){
            return null;
        }
        TreeNode root = new TreeNode(pre[preLeft]);
        int rootIndex = 0;
        for(int i = inLeft; i<=inRight; i++){
            if(in[i]==pre[preLeft]){
                rootIndex = i;
                break;
            }
        }
        root.left = reBuild(pre,preLeft+1,preLeft+rootIndex-inLeft,in,inLeft,rootIndex-1);
        root.right = reBuild(pre,preLeft+rootIndex-inLeft+1,preRight,in,rootIndex+1,inRight);
        return root;
    }

    public static void main(String[] args) {
//        System.out.println("输入前序：");
//        Scanner scanner = new Scanner(System.in);
//        String[] pre1 = scanner.nextLine().split(" ");
//        int[] pre = new int[pre1.length];
//        for (int i = 0; i < pre1.length; i++) {
//            pre[i] = Integer.parseInt(pre1[i]);
//        }
//        System.out.println("输入中序：");
//        String[] in1 = scanner.nextLine().split(" ");
//        int[] in = new int[in1.length];
//        for (int i = 0; i < in1.length; i++) {
//            in[i] = Integer.parseInt(in1[i]);
//        }
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        ReTreeNode reTreeNode = new ReTreeNode();
        TreeNode root = reTreeNode.reConstructBinaryTree(pre,in);
        System.out.println(root);
    }
}

