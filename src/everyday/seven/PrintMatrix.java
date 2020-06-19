package everyday.seven;

import com.lulu.A;

import java.util.ArrayList;

/**
 * 题目描述
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1  2  3  4
 *                             5  6  7  8
 *                             9  10 11 12
 *                             13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class PrintMatrix {
//    public ArrayList<Integer> printMatrix(int [][] matrix) {
//        ArrayList<Integer> list = new ArrayList<>();
//        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
//            return list;
//        }
//        int up = 0;
//        int down = matrix.length-1;
//        int left = 0;
//        int right = matrix[0].length-1;
//        while(true){
//            // 最上面一行
//            for(int col=left;col<=right;col++){
//                list.add(matrix[up][col]);
//            }
//            // 向下逼近
//            up++;
//            // 判断是否越界
//            if(up > down){
//                break;
//            }
//            // 最右边一列
//            for(int row=up;row<=down;row++){
//                list.add(matrix[row][right]);
//            }
//            // 向左逼近
//            right--;
//            // 判断是否越界
//            if(left > right){
//                break;
//            }
//            // 最下面一行
//            for(int col=right;col>=left;col--){
//                list.add(matrix[down][col]);
//            }
//            // 向上逼近
//            down--;
//            // 判断是否越界
//            if(up > down){
//                break;
//            }
//            // 最左边一列
//            for(int row=down;row>=up;row--){
//                list.add(matrix[row][left]);
//            }
//            // 向右逼近
//            left++;
//            // 判断是否越界
//            if(left > right){
//                break;
//            }
//        }
//        return list;
//    }

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> ret = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return ret;
        }
        int lx = 0, ly = 0;
        int rx = matrix.length-1;
        int ry = matrix[0].length-1;
        while (lx <= rx && ly <= ry) {
            print(lx++, ly++, rx--, ry--, matrix, ret);
        }
        return ret;
    }

    public void print(int lx, int ly, int rx, int ry, int[][]matrix, ArrayList<Integer> ret){
        for (int j=ly; j<=ry; ++j) {
            ret.add(matrix[lx][j]);
        }
        for (int i=lx+1; i<=rx; ++i) {
            ret.add(matrix[i][ry]);
        }
        int h = rx - lx + 1;
        if (h > 1){
            for (int rj=ry-1; rj>=ly; --rj) {
                ret.add(matrix[rx][rj]);
            }
        }

        int w = ry - ly + 1;
        if (w > 1){
            for (int ri = rx-1; ri>=lx+1; --ri) {
                ret.add(matrix[ri][ly]);
            }
        }

    }

}
