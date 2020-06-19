package everyday.three;

/**
 * 题目描述
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * n       1  2  3  4
 * 方法数  1  2  3  5
 * 解决思想：我的：由于宽度不变，都是2，则长度可以看成由1或2组成，问题就变成了n可以有多少种1或2组成的方法
 */
public class RectCover {
    public int RectCover(int n) {
        if (n==0 || n==1 || n==2) {
            return n;
        }
        int a = 2, b = 1;
        for (int i=3; i<=n; ++i) {
            a = a + b;
            b = a - b;
        }
        return a;

    }
}
