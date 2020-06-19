package everyday.five;

/**
 * 题目描述
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变
 */
public class OrderArray {
    public void reOrderArray(int [] array) {
        int temp = 0;
        int i = 0;
        int a = 0;
        for (int j = 0; j < array.length ; j++) {
            a = array[j] & 1;
            if(a == 1){
                temp = array[j];
                for (int k = j-1; k >= i; k--) {
                    array[k+1] = array[k];
                }
                array[i++] = temp;
            }
        }
    }
}
