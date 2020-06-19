package everyday.nine;

/**
 * 题目描述
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。
 * 假设输入的数组的任意两个数字都互不相同。
 * 解决思路：根节点比左子树的都大，比右子树的都小
 */
public class PostTraversal {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0 || sequence == null) {
            return false;
        }
        return isBST(sequence,0,sequence.length-1);
    }
    public boolean isBST(int [] sequence, int start,int end){
        if(start >= end){
            return true;
        }
        int val = sequence[end];
        int split = start;
        for(;split<end && sequence[split]<val; split++){
        }
        for (int i = split; i < end; i++) {
            if (sequence[i] < val) {
                return false;
            }
        }
        return isBST(sequence,start,split-1) && isBST(sequence,split,end-1);
    }
}
