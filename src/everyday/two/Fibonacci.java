package everyday.two;

/**
 *大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        while (n > 0) {
            a = a + b;
            b = a - b;
            n--;
        }
        return  a;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.Fibonacci(5));
    }
}
