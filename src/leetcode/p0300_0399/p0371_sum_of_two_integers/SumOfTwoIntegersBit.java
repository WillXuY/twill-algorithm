package leetcode.p0300_0399.p0371_sum_of_two_integers;

public class SumOfTwoIntegersBit implements SumOfTwoIntegers {
    @Override
    public int getSum(int a, int b) {
        int xor = a ^ b;
        int and = a & b;
        while (and != 0) {
            a = xor;
            b = and << 1;
            xor = a ^ b;
            and = a & b;
        }
        return xor;
    }
}
