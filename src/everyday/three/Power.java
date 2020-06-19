package everyday.three;

/**
 * 题目描述
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 保证base和exponent不同时为0
 *
 *
 */
public class Power {
    public double Power(double b, int n) {
        //n为负数时
        if (n < 0) {
            b = 1/b;
            n = -n;
        }
        double x = b;
        double ret = 1.0;
        while (n!=0) {
            if ((n & 1) != 0) {
                ret *= x;
            }
            x *= x;
            n >>= 1;
        }
        return ret;
    }

    public static void main(String[] args) {
        Power power = new Power();
        power.Power(2.0,6);
    }
}
