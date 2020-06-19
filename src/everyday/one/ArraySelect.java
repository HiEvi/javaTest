package everyday.one;
/*
题目描述
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
判断数组中是否含有该整数
 */
public class ArraySelect {
    public boolean Find(int target, int [][] array) {
        /*
        二维数组a[m][n]
        思想，从左下角开始第一个数开始判断，因为它是一行中最小的数，一列中最大的数，可以筛选出更多无效的数
        */
        int m = array[0].length;//有m列
        if(m <=0 ){
            return false;
        }
        int n = array.length; //有n行
        if(n <=0 ){
            return false;
        }
        int r = n-1;  //左下角
        int c = 0;
        while(r>=0 && c<m){
            if(array[r][c]==target){
                return true;
            }else if(array[r][c]>target){
                r--;
            }else{
                c++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArraySelect arraySelect = new ArraySelect();
        int [][]array = {{1,2,3},{3,4,5},{5,6,7}};
        System.out.println(arraySelect.Find(7, array));
    }
}
