package leetcode.p0000_0099.p0029_divide_two_integers;

public class DivideTwoIntegersLeft implements DivideTwoIntegers {
    @Override
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        } else if (divisor == 1) {
            return dividend;
        }
        boolean isPositive = dividend < 0 == divisor < 0;
        long dend = Math.abs((long) dividend);
        long sor = Math.abs((long) divisor);
        long output = 0;
        while (dend >= sor) {
            long moveTimes = 1;
            long leftMove = sor;
            while (leftMove <= dend) {
                leftMove <<= 1;
                moveTimes <<= 1;
            }
            leftMove >>= 1;
            moveTimes >>= 1;
            output += moveTimes;
            dend -= leftMove;
        }
        if (isPositive) {
            if (output > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else {
                return (int) output;
            }
        } else {
            output *= -1;
            if (output < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else {
                return (int) output;
            }
        }
    }
}
