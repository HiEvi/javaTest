package everyday.three;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class JumpFloor {
    public int JumpFloor(int target) {
        if(target == 1 || target == 2){
            return target;
        }
        int a = 2;
        int b = 1;
        for (int i = 2; i < target; i++) {
            a = a + b;
            b = a - b;
        }
        return  a;
    }
}
